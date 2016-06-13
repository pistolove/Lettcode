package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 10:07
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;

public class MethodDescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.inputType)) {
            f_2 = ByteString.copyFromUtf8(t.inputType);
        }if (!CodedConstant.isNull(t.inputType))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.outputType)) {
            f_3 = ByteString.copyFromUtf8(t.outputType);
        }if (!CodedConstant.isNull(t.outputType))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }
        Object f_4=null;
        if (!CodedConstant.isNull(t.options)) {
            f_4=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(4,f_4, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){CodedConstant.writeObject(output,4,FieldType.OBJECT,f_4, false);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    ret.name=input.readString()
                    ;
                    continue;
                }if (tag == 18) {
                    ret.inputType=input.readString()
                    ;
                    continue;
                }if (tag == 26) {
                    ret.outputType=input.readString()
                    ;
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.MethodOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.MethodOptionsPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.inputType)) {
            f_2 = ByteString.copyFromUtf8(t.inputType);
        }if (!CodedConstant.isNull(t.inputType))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.outputType)) {
            f_3 = ByteString.copyFromUtf8(t.outputType);
        }if (!CodedConstant.isNull(t.outputType))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }
        Object f_4=null;
        if (!CodedConstant.isNull(t.options)) {
            f_4=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(4,f_4, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }ByteString f_2=null;
        if (!CodedConstant.isNull(t.inputType)) {
            f_2 = ByteString.copyFromUtf8(t.inputType);
        }ByteString f_3=null;
        if (!CodedConstant.isNull(t.outputType)) {
            f_3 = ByteString.copyFromUtf8(t.outputType);
        }Object f_4=null;
        if (!CodedConstant.isNull(t.options)) {
            f_4=t.options;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){CodedConstant.writeObject(output,4,FieldType.OBJECT,f_4, false);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    ret.name=input.readString()
                    ;
                    continue;
                }if (tag == 18) {
                    ret.inputType=input.readString()
                    ;
                    continue;
                }if (tag == 26) {
                    ret.outputType=input.readString()
                    ;
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.MethodOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.MethodOptionsPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.MethodDescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
