package com.jprotobuf;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufIDLGenerator;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/17
 * Time: 下午4:14
 */
public class testmain {
    public static void main(String[] args) {
        /**
         * jprotobuf序列化
         */
        try{
            Codec<HelloCons> consCodec = ProtobufProxy.create(HelloCons.class, false);


            HelloCons helloCons = new HelloCons();
            List<HelloJson> helloJsonList = new ArrayList<>();
            HelloJson helloJson = new HelloJson();
            helloJson.setId(12);
            helloJson.setName("xuli");
            helloJson.setSpeak("hello");
            List<String> phones = new ArrayList<>();
            phones.add("15311496253");
            helloJson.setPhone(phones);
            helloJsonList.add(helloJson);
            helloCons.setHello(helloJsonList);

            byte[] bytes = consCodec.encode(helloCons);
            System.out.println("序列化结果："+ new String(bytes));
            HelloCons decode = consCodec.decode(bytes);
            System.out.println("反序列化结果：" + decode.toString());
        } catch (Exception e){
            int i = 0;
        }
//
        String code = ProtobufIDLGenerator.getIDL(HelloCons.class);
        System.out.println("jprotobuf 1.8.5  code：" + code);
    }

}
