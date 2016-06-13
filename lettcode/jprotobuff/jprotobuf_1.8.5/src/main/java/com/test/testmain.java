package com.test;

import com.baidu.bjf.remoting.protobuf.Codec;
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

//            ProtobufProxy.create(HelloJson.class, false);
//            Codec<HelloJson> consCodec = new HelloJson$$JProtoBufClass();
//            HelloJson helloJson = new HelloJson();
//            helloJson.setId(12);
//            helloJson.setName("xuli");
//            helloJson.setSpeak("hello");
//            List<String> phones = new ArrayList<>();
//            for(int i = 0;i < 100000;i++){
//                phones.add("15311496253");
//            }
//            helloJson.setPhone(phones);
//            Long stime_jpb_encode = System.currentTimeMillis();
//            byte[] jsonb = consCodec.encode(helloJson);
//            Long etime_jpb_encode = System.currentTimeMillis();
//            System.out.println("jprotobuf 1.8.5 序列化耗时："+ (etime_jpb_encode-stime_jpb_encode) + "ms;总大小："+jsonb.length);
//            Long stime_jpb_encode1 = System.currentTimeMillis();
//            byte[] jsonb1 = consCodec.encode(helloJson);
//            Long etime_jpb_encode1 = System.currentTimeMillis();
//            System.out.println("jprotobuf 1.8.5 序列化耗时111："+ (etime_jpb_encode1-stime_jpb_encode1) + "ms;总大小："+jsonb1.length);


            Long stime_jpb_create = System.currentTimeMillis();

//            ProtobufProxy.create(HelloCons.class, false);
//            Codec<HelloCons> consCodec = new HelloCons$$JProtoBufClass();
//            Codec<HelloDecodeCons> helloDecodeConsCodec = new HelloCons$$JProtoBufClass();


            Codec<HelloCons> consCodec = ProtobufProxy.create(HelloCons.class, false);
            Codec<HelloDecodeCons> helloDecodeConsCodec = ProtobufProxy.create(HelloDecodeCons.class, false);

            Long etime_jpb_end = System.currentTimeMillis();
            System.out.println("jprotobuf 1.8.5  create 耗时："+ (etime_jpb_end-stime_jpb_create) + "ms");

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
            System.out.println("jprotobuf 1.8.5 序列化耗时："+ (etime_jpb_encode-stime_jpb_encode) + "ms;总大小："+bytes.length);
            Long stime_jpb_decode = System.currentTimeMillis();
            HelloCons helloCons1 = consCodec.decode(bytes);
            HelloDecodeCons helloDecodeCons = helloDecodeConsCodec.decode(bytes);
            Long etime_jpb_decode = System.currentTimeMillis();
//            System.out.println("jprotobuf 1.8.5 反序列化耗时："+ (etime_jpb_decode-stime_jpb_decode) + "ms");

            for(int i = 0;i<5;i++) {
                Long stime_jpb_encode1 = System.currentTimeMillis();
                byte[] bytes1 = consCodec.encode(helloCons);
                Long etime_jpb_encode1 = System.currentTimeMillis();
                System.out.println("jprotobuf 1.8.5 序列化耗时：" + (etime_jpb_encode1 - stime_jpb_encode1) + "ms;总大小：" + bytes1.length);

            }
        } catch (Exception e){
            int i = 0;
        }
//
//        String code = ProtobufIDLGenerator.getIDL(HelloCons.class);
//        System.out.println("jprotobuf 1.8.5  code：" + code);
    }

}
