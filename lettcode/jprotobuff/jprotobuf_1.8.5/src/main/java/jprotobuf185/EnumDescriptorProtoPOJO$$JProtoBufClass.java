package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:34
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnumDescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        List f_2=null;
        if (!CodedConstant.isNull(t.values)) {
            f_2=t.values;
        }if (!CodedConstant.isNull(t.values))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.options)) {
            f_3=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
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
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.values) == null) {
                        ret.values= new ArrayList();
                    }ret.values.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        List f_2=null;
        if (!CodedConstant.isNull(t.values)) {
            f_2=t.values;
        }if (!CodedConstant.isNull(t.values))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.options)) {
            f_3=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }List f_2=null;
        if (!CodedConstant.isNull(t.values)) {
            f_2=t.values;
        }List f_3=null;
        if (!CodedConstant.isNull(t.options)) {
            f_3=t.options;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO();try {
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
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.values) == null) {
                        ret.values= new ArrayList();
                    }ret.values.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
