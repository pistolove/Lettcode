package compare;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

//import compare.Hello.HelloTest;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/1/22
 * Time: 下午6:42
 */

public class pbmain {

    public static void main(String[] args) {
        try{
            Long stime_jpb_create = System.currentTimeMillis();

            Codec<HelloCons> consCodec = ProtobufProxy.create(HelloCons.class, false);
            Long etime_jpb_end = System.currentTimeMillis();
            System.out.println("jprotobuf 1.9.7 create 耗时："+ (etime_jpb_end-stime_jpb_create) + "ms");

            HelloCons helloCons = new HelloCons();
            List<HelloJson> helloJsonList = new ArrayList<>();
            for(int i = 0;i < 5000;i++){
                HelloJson helloJson = new HelloJson();
                helloJson.setId(12);
                helloJson.setName("xuli");
                helloJson.setSpeak("hello");
                List<String> phones = new ArrayList<>();
                phones.add("15311496253");
                helloJson.setPhone(phones);
                helloJsonList.add(helloJson);
            }
            helloCons.setHello(helloJsonList);

            Long stime_jpb_encode = System.currentTimeMillis();
            byte[] bytes = consCodec.encode(helloCons);
            Long etime_jpb_encode = System.currentTimeMillis();
            System.out.println("jprotobuf 1.9.7 序列化耗时："+ (etime_jpb_encode-stime_jpb_encode) + "ms;总大小："+bytes.length);
            Long stime_jpb_decode = System.currentTimeMillis();
            HelloCons helloCons1 = consCodec.decode(bytes);
            Long etime_jpb_decode = System.currentTimeMillis();
            System.out.println("jprotobuf 1.9.7 反序列化耗时："+ (etime_jpb_decode-stime_jpb_decode) + "ms");

            for(int i = 0;i<5;i++){
                Long stime_jpb_encode1 = System.currentTimeMillis();
                byte[] bytes1 = consCodec.encode(helloCons);
                Long etime_jpb_encode1 = System.currentTimeMillis();
                System.out.println("jprotobuf 1.9.7 序列化耗时："+ (etime_jpb_encode1-stime_jpb_encode1) + "ms;总大小："+bytes1.length);

            }

        } catch (Exception e){
            int i = 0;
        }
    }
}
