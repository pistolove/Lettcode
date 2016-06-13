package com.compare;

import com.alibaba.fastjson.JSONObject;
import com.compare.jsonfile.HelloCons;
import com.compare.jsonfile.HelloJson;
import com.compare.protobuffile.Test;
import com.compare.thriftfile.HelloCon;
import com.compare.thriftfile.HelloConDecode;
import com.compare.thriftfile.HelloTest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TMemoryBuffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * protouf、json和thrift的对比
 * User: xuli
 * Date：16/3/27
 * Time: 11:07
 */
public class CompareMain {
    public static void main(String[] args) {
        ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        try{
            //protobuf
            List<Test.HelloTest> helloTestList = new ArrayList<>();
            for(int i = 0;i < 1000;i++){
                Test.HelloTest.Builder builder = Test.HelloTest.newBuilder();
                builder.setId(12);
                builder.setName("xuli");
                builder.setSpeak("hello");
                builder.addPhone("15311496253");
                helloTestList.add(builder.build());
            }
            Test.HelloCon.Builder helloCon = Test.HelloCon.newBuilder();
            helloCon.addAllHello(helloTestList);
            Long stime = System.currentTimeMillis();
            byte[] byte1 = helloCon.build().toByteArray();
            Long etime = System.currentTimeMillis();
            System.out.println("PB序列化耗时："+ (etime-stime) + "ms;总大小："+byte1.length);
            Long decode_stime = System.currentTimeMillis();
            Test.HelloCon pb1 = Test.HelloCon.parseFrom(byte1);
            Long decode_etime = System.currentTimeMillis();
            System.out.println("PB反序列化耗时："+ (decode_etime-decode_stime) + "ms");

            //jsonfile
            int sizecount2 = 0;
            HelloCons helloCons = new HelloCons();
            List<HelloJson> helloJsonList = new ArrayList<>();
            for(int i = 0;i < 1000;i++){
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
            Long stime2 = System.currentTimeMillis();
            String helloStr = OBJECT_MAPPER.writeValueAsString(helloCons);
            sizecount2 = helloStr.length();
            Long etime2 = System.currentTimeMillis();
            System.out.println("JSON序列化耗时："+ (etime2-stime2) + "ms;总大小："+sizecount2);
            Long stime4 = System.currentTimeMillis();
            HelloCons jsondecode = OBJECT_MAPPER.readValue(helloStr,HelloCons.class);
            Long etime4 = System.currentTimeMillis();
            System.out.println("JSON反序列化耗时："+ (etime4-stime4) + "ms");

            Long fastJson_stime2 = System.currentTimeMillis();
            String hellostr2 = JSONObject.toJSONString(helloCons);
            int f_sizecount2 = hellostr2.length();
            Long fastJson_etime2 = System.currentTimeMillis();
            System.out.println("fast JSON序列化耗时："+ (fastJson_etime2-fastJson_stime2) + "ms;总大小："+f_sizecount2);

            //thriftfile
            HelloCon thriftCon = new HelloCon();
            List<HelloTest> thriftList = new ArrayList<>();
            for(int i = 0;i < 1000;i++){
                HelloTest thriftTest = new HelloTest();
                thriftTest.setId(12);
                thriftTest.setName("xuli");
                thriftTest.setSpeak("hello");
                List<String> phones = new ArrayList<>();
                phones.add("15311496253");
                thriftTest.setPhone(phones);
                thriftList.add(thriftTest);
            }
            thriftCon.setHello(thriftList);
            Long thrift_stime = System.currentTimeMillis();
            TMemoryBuffer buffer = new TMemoryBuffer(100);
//            TProtocol protocol = new TCompactProtocol(buffer);
            TProtocol protocol = new TBinaryProtocol(buffer);
            thriftCon.write(protocol);
            byte[] thriftbyte = buffer.getArray();
            Long thrift_etime = System.currentTimeMillis();
            int sizecount3 = thriftbyte.length;
            System.out.println("thrift序列化耗时："+ (thrift_etime-thrift_stime) + "ms;总大小："+sizecount3);

            Long thrift_dstime = System.currentTimeMillis();
            TMemoryBuffer decodebuffer = new TMemoryBuffer(sizecount3);
            decodebuffer.write(thriftbyte);
//            TProtocol dprotocol = new TCompactProtocol(buffer);
            TProtocol dprotocol = new TBinaryProtocol(buffer);

//            HelloCon thriftDecode = new HelloCon();
//            thriftDecode.read(dprotocol);
            HelloConDecode thriftDecode = new HelloConDecode();
            thriftDecode.read(dprotocol);
            Long thrift_detime = System.currentTimeMillis();
            System.out.println("thrift反序列化耗时："+ (thrift_detime-thrift_dstime) + "ms");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
