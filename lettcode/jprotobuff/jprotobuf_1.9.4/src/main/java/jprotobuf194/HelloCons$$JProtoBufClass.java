package jprotobuf194;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/23
 * Time: 14:59
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloCons$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<compare.HelloCons> {
    public HelloCons$$JProtoBufClass() {
    }

    private Descriptors.Descriptor descriptor;
    public byte[] encode(compare.HelloCons t) throws IOException {
        int size = 0;List f_1=null;
        if (!CodedConstant.isNull(t.getHello())) {
            f_1=t.getHello();
        }if (!CodedConstant.isNull(t.getHello())){
            size += CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,ProtobufProxy.OUTPUT_PATH.get());

        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        writeTo(t, output);
        return result;
    }
    public compare.HelloCons decode(byte[] bb) throws IOException {
        CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        compare.HelloCons ret = new compare.HelloCons();
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(compare.HelloJson.class, false,ProtobufProxy.OUTPUT_PATH.get());
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.getHello()) == null) {
                        List __list = new ArrayList();
                        ret.setHello(__list);
                    }
                    (ret.getHello()).add((compare.HelloJson) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }
                input.skipField(tag);
            }
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        return ret;
    }
    public int size(compare.HelloCons t) throws IOException {
        int size = 0;
        List f_1=null;
        if (!CodedConstant.isNull(t.getHello())) {
            f_1=t.getHello();
        }if (!CodedConstant.isNull(t.getHello())){
            size += CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,ProtobufProxy.OUTPUT_PATH.get());
        }
        return size;
    }
    public void writeTo(compare.HelloCons t, CodedOutputStream output) throws IOException {
        List f_1=null;
        if (!CodedConstant.isNull(t.getHello())) {
            f_1=t.getHello();
        }if (f_1!=null){
            Long stime_jpb_encode = System.currentTimeMillis();
            CodedConstant.writeToList(output, 1, FieldType.OBJECT, f_1);
            Long etime_jpb_encode = System.currentTimeMillis();
            System.out.println("jprotobuf 1.8.5 CodedConstant.writeToList："+ (etime_jpb_encode-stime_jpb_encode));

        }}
    public compare.HelloCons readFrom(CodedInputStream input) throws IOException {
        compare.HelloCons ret = new compare.HelloCons();
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(compare.HelloJson.class, false,ProtobufProxy.OUTPUT_PATH.get());
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.getHello()) == null) {
                        List __list = new ArrayList();
                        ret.setHello(__list);
                    }
                    (ret.getHello()).add((compare.HelloJson) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }
                input.skipField(tag);
            }
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(compare.HelloCons.class);
        return (this.descriptor = descriptor);
    }
}
