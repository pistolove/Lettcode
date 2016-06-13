package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:36
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnumValueDescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        Integer f_2=null;
        if (!CodedConstant.isNull(t.number)) {
            f_2=t.number;
        }if (!CodedConstant.isNull(t.number))
        {
            size+= CodedOutputStream.computeInt32Size(2,f_2.intValue());
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
        }if (f_2!=null){output.writeInt32(2, f_2.intValue());
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
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
                }if (tag == 16) {
                    ret.number=input.readInt32()
                    ;
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumValueOptionsPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        Integer f_2=null;
        if (!CodedConstant.isNull(t.number)) {
            f_2=t.number;
        }if (!CodedConstant.isNull(t.number))
        {
            size+= CodedOutputStream.computeInt32Size(2,f_2.intValue());
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
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }Integer f_2=null;
        if (!CodedConstant.isNull(t.number)) {
            f_2=t.number;
        }List f_3=null;
        if (!CodedConstant.isNull(t.options)) {
            f_3=t.options;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeInt32(2, f_2.intValue());
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    ret.name=input.readString()
                    ;
                    continue;
                }if (tag == 16) {
                    ret.number=input.readInt32()
                    ;
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumValueOptionsPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.EnumValueDescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
