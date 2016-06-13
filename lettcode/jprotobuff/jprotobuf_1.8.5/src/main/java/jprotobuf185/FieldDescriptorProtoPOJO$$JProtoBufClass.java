package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:23
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;

public class FieldDescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.extendee)) {
            f_2 = ByteString.copyFromUtf8(t.extendee);
        }if (!CodedConstant.isNull(t.extendee))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        Integer f_3=null;
        if (!CodedConstant.isNull(t.number)) {
            f_3=t.number;
        }if (!CodedConstant.isNull(t.number))
        {
            size+= CodedOutputStream.computeInt32Size(3,f_3.intValue());
        }
        Enum f_4=null;
        if (!CodedConstant.isNull(t.label)) {
            f_4=t.label;
        }if (!CodedConstant.isNull(t.label))
        {
            size+= CodedOutputStream.computeEnumSize(4,((com.baidu.bjf.remoting.protobuf.descriptor.Label) f_4).value());
        }
        Enum f_5=null;
        if (!CodedConstant.isNull(t.type)) {
            f_5=t.type;
        }if (!CodedConstant.isNull(t.type))
        {
            size+= CodedOutputStream.computeEnumSize(5,((com.baidu.bjf.remoting.protobuf.descriptor.Type) f_5).value());
        }
        ByteString f_6=null;
        if (!CodedConstant.isNull(t.typeName)) {
            f_6 = ByteString.copyFromUtf8(t.typeName);
        }if (!CodedConstant.isNull(t.typeName))
        {
            size+= CodedOutputStream.computeBytesSize(6,f_6);
        }
        ByteString f_7=null;
        if (!CodedConstant.isNull(t.defaultValue)) {
            f_7 = ByteString.copyFromUtf8(t.defaultValue);
        }if (!CodedConstant.isNull(t.defaultValue))
        {
            size+= CodedOutputStream.computeBytesSize(7,f_7);
        }
        Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(8,f_8, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeInt32(3, f_3.intValue());
        }if (f_4!=null){output.writeEnum(4, ((com.baidu.bjf.remoting.protobuf.descriptor.Label) f_4).value());
        }if (f_5!=null){output.writeEnum(5, ((com.baidu.bjf.remoting.protobuf.descriptor.Type) f_5).value());
        }if (f_6!=null){output.writeBytes(6, f_6);
        }if (f_7!=null){output.writeBytes(7, f_7);
        }if (f_8!=null){CodedConstant.writeObject(output,8,FieldType.OBJECT,f_8, false);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
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
                    ret.extendee=input.readString()
                    ;
                    continue;
                }if (tag == 24) {
                    ret.number=input.readInt32()
                    ;
                    continue;
                }if (tag == 32) {
                    ret.label=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.Label.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.Label.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 40) {
                    ret.type=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.Type.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.Type.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 50) {
                    ret.typeName=input.readString()
                    ;
                    continue;
                }if (tag == 58) {
                    ret.defaultValue=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.extendee)) {
            f_2 = ByteString.copyFromUtf8(t.extendee);
        }if (!CodedConstant.isNull(t.extendee))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        Integer f_3=null;
        if (!CodedConstant.isNull(t.number)) {
            f_3=t.number;
        }if (!CodedConstant.isNull(t.number))
        {
            size+= CodedOutputStream.computeInt32Size(3,f_3.intValue());
        }
        Enum f_4=null;
        if (!CodedConstant.isNull(t.label)) {
            f_4=t.label;
        }if (!CodedConstant.isNull(t.label))
        {
            size+= CodedOutputStream.computeEnumSize(4,((com.baidu.bjf.remoting.protobuf.descriptor.Label) f_4).value());
        }
        Enum f_5=null;
        if (!CodedConstant.isNull(t.type)) {
            f_5=t.type;
        }if (!CodedConstant.isNull(t.type))
        {
            size+= CodedOutputStream.computeEnumSize(5,((com.baidu.bjf.remoting.protobuf.descriptor.Type) f_5).value());
        }
        ByteString f_6=null;
        if (!CodedConstant.isNull(t.typeName)) {
            f_6 = ByteString.copyFromUtf8(t.typeName);
        }if (!CodedConstant.isNull(t.typeName))
        {
            size+= CodedOutputStream.computeBytesSize(6,f_6);
        }
        ByteString f_7=null;
        if (!CodedConstant.isNull(t.defaultValue)) {
            f_7 = ByteString.copyFromUtf8(t.defaultValue);
        }if (!CodedConstant.isNull(t.defaultValue))
        {
            size+= CodedOutputStream.computeBytesSize(7,f_7);
        }
        Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(8,f_8, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }ByteString f_2=null;
        if (!CodedConstant.isNull(t.extendee)) {
            f_2 = ByteString.copyFromUtf8(t.extendee);
        }Integer f_3=null;
        if (!CodedConstant.isNull(t.number)) {
            f_3=t.number;
        }Enum f_4=null;
        if (!CodedConstant.isNull(t.label)) {
            f_4=t.label;
        }Enum f_5=null;
        if (!CodedConstant.isNull(t.type)) {
            f_5=t.type;
        }ByteString f_6=null;
        if (!CodedConstant.isNull(t.typeName)) {
            f_6 = ByteString.copyFromUtf8(t.typeName);
        }ByteString f_7=null;
        if (!CodedConstant.isNull(t.defaultValue)) {
            f_7 = ByteString.copyFromUtf8(t.defaultValue);
        }Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeInt32(3, f_3.intValue());
        }if (f_4!=null){output.writeEnum(4, ((com.baidu.bjf.remoting.protobuf.descriptor.Label) f_4).value());
        }if (f_5!=null){output.writeEnum(5, ((com.baidu.bjf.remoting.protobuf.descriptor.Type) f_5).value());
        }if (f_6!=null){output.writeBytes(6, f_6);
        }if (f_7!=null){output.writeBytes(7, f_7);
        }if (f_8!=null){CodedConstant.writeObject(output,8,FieldType.OBJECT,f_8, false);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO();try {
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
                    ret.extendee=input.readString()
                    ;
                    continue;
                }if (tag == 24) {
                    ret.number=input.readInt32()
                    ;
                    continue;
                }if (tag == 32) {
                    ret.label=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.Label.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.Label.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 40) {
                    ret.type=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.Type.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.Type.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 50) {
                    ret.typeName=input.readString()
                    ;
                    continue;
                }if (tag == 58) {
                    ret.defaultValue=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO) codec.readFrom(input)
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
