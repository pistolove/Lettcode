package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:29
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FieldOptionsPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO t) throws IOException {
        int size = 0;Enum f_1=null;
        if (!CodedConstant.isNull(t.ctype)) {
            f_1=t.ctype;
        }if (!CodedConstant.isNull(t.ctype))
        {
            size+= CodedOutputStream.computeEnumSize(1,f_1.ordinal());
        }
        Boolean f_2=null;
        if (!CodedConstant.isNull(t.packed)) {
            f_2=t.packed;
        }if (!CodedConstant.isNull(t.packed))
        {
            size+= CodedOutputStream.computeBoolSize(2,f_2.booleanValue());
        }
        Boolean f_3=null;
        if (!CodedConstant.isNull(t.deprecated)) {
            f_3=t.deprecated;
        }if (!CodedConstant.isNull(t.deprecated))
        {
            size+= CodedOutputStream.computeBoolSize(3,f_3.booleanValue());
        }
        Boolean f_5=null;
        if (!CodedConstant.isNull(t.lazy)) {
            f_5=t.lazy;
        }if (!CodedConstant.isNull(t.lazy))
        {
            size+= CodedOutputStream.computeBoolSize(5,f_5.booleanValue());
        }
        Boolean f_10=null;
        if (!CodedConstant.isNull(t.weak)) {
            f_10=t.weak;
        }if (!CodedConstant.isNull(t.weak))
        {
            size+= CodedOutputStream.computeBoolSize(10,f_10.booleanValue());
        }
        List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOption)) {
            f_999=t.uninterpretedOption;
        }if (!CodedConstant.isNull(t.uninterpretedOption))
        {
            size+=CodedConstant.computeListSize(999,f_999, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeEnum(1, f_1.ordinal());
        }if (f_2!=null){output.writeBool(2, f_2.booleanValue());
        }if (f_3!=null){output.writeBool(3, f_3.booleanValue());
        }if (f_5!=null){output.writeBool(5, f_5.booleanValue());
        }if (f_10!=null){output.writeBool(10, f_10.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.ctype=Enum.valueOf(DescriptorProtos.FieldOptions.CType.class, CodedConstant.getEnumName(DescriptorProtos.FieldOptions.CType.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 16) {
                    ret.packed=input.readBool()
                    ;
                    continue;
                }if (tag == 24) {
                    ret.deprecated=input.readBool()
                    ;
                    continue;
                }if (tag == 40) {
                    ret.lazy=input.readBool()
                    ;
                    continue;
                }if (tag == 80) {
                    ret.weak=input.readBool()
                    ;
                    continue;
                }if (tag == 7994) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.uninterpretedOption) == null) {
                        ret.uninterpretedOption= new ArrayList();
                    }ret.uninterpretedOption.add((com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO t) throws IOException {
        int size = 0;Enum f_1=null;
        if (!CodedConstant.isNull(t.ctype)) {
            f_1=t.ctype;
        }if (!CodedConstant.isNull(t.ctype))
        {
            size+= CodedOutputStream.computeEnumSize(1,f_1.ordinal());
        }
        Boolean f_2=null;
        if (!CodedConstant.isNull(t.packed)) {
            f_2=t.packed;
        }if (!CodedConstant.isNull(t.packed))
        {
            size+= CodedOutputStream.computeBoolSize(2,f_2.booleanValue());
        }
        Boolean f_3=null;
        if (!CodedConstant.isNull(t.deprecated)) {
            f_3=t.deprecated;
        }if (!CodedConstant.isNull(t.deprecated))
        {
            size+= CodedOutputStream.computeBoolSize(3,f_3.booleanValue());
        }
        Boolean f_5=null;
        if (!CodedConstant.isNull(t.lazy)) {
            f_5=t.lazy;
        }if (!CodedConstant.isNull(t.lazy))
        {
            size+= CodedOutputStream.computeBoolSize(5,f_5.booleanValue());
        }
        Boolean f_10=null;
        if (!CodedConstant.isNull(t.weak)) {
            f_10=t.weak;
        }if (!CodedConstant.isNull(t.weak))
        {
            size+= CodedOutputStream.computeBoolSize(10,f_10.booleanValue());
        }
        List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOption)) {
            f_999=t.uninterpretedOption;
        }if (!CodedConstant.isNull(t.uninterpretedOption))
        {
            size+=CodedConstant.computeListSize(999,f_999, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO t, CodedOutputStream output) throws IOException {
        Enum f_1=null;
        if (!CodedConstant.isNull(t.ctype)) {
            f_1=t.ctype;
        }Boolean f_2=null;
        if (!CodedConstant.isNull(t.packed)) {
            f_2=t.packed;
        }Boolean f_3=null;
        if (!CodedConstant.isNull(t.deprecated)) {
            f_3=t.deprecated;
        }Boolean f_5=null;
        if (!CodedConstant.isNull(t.lazy)) {
            f_5=t.lazy;
        }Boolean f_10=null;
        if (!CodedConstant.isNull(t.weak)) {
            f_10=t.weak;
        }List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOption)) {
            f_999=t.uninterpretedOption;
        }if (f_1!=null){output.writeEnum(1, f_1.ordinal());
        }if (f_2!=null){output.writeBool(2, f_2.booleanValue());
        }if (f_3!=null){output.writeBool(3, f_3.booleanValue());
        }if (f_5!=null){output.writeBool(5, f_5.booleanValue());
        }if (f_10!=null){output.writeBool(10, f_10.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.ctype=Enum.valueOf(DescriptorProtos.FieldOptions.CType.class, CodedConstant.getEnumName(DescriptorProtos.FieldOptions.CType.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 16) {
                    ret.packed=input.readBool()
                    ;
                    continue;
                }if (tag == 24) {
                    ret.deprecated=input.readBool()
                    ;
                    continue;
                }if (tag == 40) {
                    ret.lazy=input.readBool()
                    ;
                    continue;
                }if (tag == 80) {
                    ret.weak=input.readBool()
                    ;
                    continue;
                }if (tag == 7994) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.uninterpretedOption) == null) {
                        ret.uninterpretedOption= new ArrayList();
                    }ret.uninterpretedOption.add((com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.FieldOptionsPOJO.class);
        return (this.descriptor = descriptor);
    }
}
