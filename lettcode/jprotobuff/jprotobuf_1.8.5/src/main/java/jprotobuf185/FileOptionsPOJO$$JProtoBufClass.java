package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 10:05
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOptionsPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.javaPackage)) {
            f_1 = ByteString.copyFromUtf8(t.javaPackage);
        }if (!CodedConstant.isNull(t.javaPackage))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_8=null;
        if (!CodedConstant.isNull(t.javaOuterClassname)) {
            f_8 = ByteString.copyFromUtf8(t.javaOuterClassname);
        }if (!CodedConstant.isNull(t.javaOuterClassname))
        {
            size+= CodedOutputStream.computeBytesSize(8,f_8);
        }
        Enum f_9=null;
        if (!CodedConstant.isNull(t.optimizeFor)) {
            f_9=t.optimizeFor;
        }if (!CodedConstant.isNull(t.optimizeFor))
        {
            size+= CodedOutputStream.computeEnumSize(9,((com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode) f_9).value());
        }
        Boolean f_10=null;
        if (!CodedConstant.isNull(t.javaMultipleFiles)) {
            f_10=t.javaMultipleFiles;
        }if (!CodedConstant.isNull(t.javaMultipleFiles))
        {
            size+= CodedOutputStream.computeBoolSize(10,f_10.booleanValue());
        }
        ByteString f_11=null;
        if (!CodedConstant.isNull(t.goPackage)) {
            f_11 = ByteString.copyFromUtf8(t.goPackage);
        }if (!CodedConstant.isNull(t.goPackage))
        {
            size+= CodedOutputStream.computeBytesSize(11,f_11);
        }
        Boolean f_16=null;
        if (!CodedConstant.isNull(t.ccGenericServices)) {
            f_16=t.ccGenericServices;
        }if (!CodedConstant.isNull(t.ccGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(16,f_16.booleanValue());
        }
        Boolean f_17=null;
        if (!CodedConstant.isNull(t.javaGenericServices)) {
            f_17=t.javaGenericServices;
        }if (!CodedConstant.isNull(t.javaGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(17,f_17.booleanValue());
        }
        Boolean f_18=null;
        if (!CodedConstant.isNull(t.pyGenericServices)) {
            f_18=t.pyGenericServices;
        }if (!CodedConstant.isNull(t.pyGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(18,f_18.booleanValue());
        }
        Boolean f_20=null;
        if (!CodedConstant.isNull(t.javaGenerateEqualsAndHash)) {
            f_20=t.javaGenerateEqualsAndHash;
        }if (!CodedConstant.isNull(t.javaGenerateEqualsAndHash))
        {
            size+= CodedOutputStream.computeBoolSize(20,f_20.booleanValue());
        }
        List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOptions)) {
            f_999=t.uninterpretedOptions;
        }if (!CodedConstant.isNull(t.uninterpretedOptions))
        {
            size+=CodedConstant.computeListSize(999,f_999, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_8!=null){output.writeBytes(8, f_8);
        }if (f_9!=null){output.writeEnum(9, ((com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode) f_9).value());
        }if (f_10!=null){output.writeBool(10, f_10.booleanValue());
        }if (f_11!=null){output.writeBytes(11, f_11);
        }if (f_16!=null){output.writeBool(16, f_16.booleanValue());
        }if (f_17!=null){output.writeBool(17, f_17.booleanValue());
        }if (f_18!=null){output.writeBool(18, f_18.booleanValue());
        }if (f_20!=null){output.writeBool(20, f_20.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    ret.javaPackage=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    ret.javaOuterClassname=input.readString()
                    ;
                    continue;
                }if (tag == 72) {
                    ret.optimizeFor=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 80) {
                    ret.javaMultipleFiles=input.readBool()
                    ;
                    continue;
                }if (tag == 90) {
                    ret.goPackage=input.readString()
                    ;
                    continue;
                }if (tag == 128) {
                    ret.ccGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 136) {
                    ret.javaGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 144) {
                    ret.pyGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 160) {
                    ret.javaGenerateEqualsAndHash=input.readBool()
                    ;
                    continue;
                }if (tag == 7994) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.uninterpretedOptions) == null) {
                        ret.uninterpretedOptions= new ArrayList();
                    }ret.uninterpretedOptions.add((com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.javaPackage)) {
            f_1 = ByteString.copyFromUtf8(t.javaPackage);
        }if (!CodedConstant.isNull(t.javaPackage))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_8=null;
        if (!CodedConstant.isNull(t.javaOuterClassname)) {
            f_8 = ByteString.copyFromUtf8(t.javaOuterClassname);
        }if (!CodedConstant.isNull(t.javaOuterClassname))
        {
            size+= CodedOutputStream.computeBytesSize(8,f_8);
        }
        Enum f_9=null;
        if (!CodedConstant.isNull(t.optimizeFor)) {
            f_9=t.optimizeFor;
        }if (!CodedConstant.isNull(t.optimizeFor))
        {
            size+= CodedOutputStream.computeEnumSize(9,((com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode) f_9).value());
        }
        Boolean f_10=null;
        if (!CodedConstant.isNull(t.javaMultipleFiles)) {
            f_10=t.javaMultipleFiles;
        }if (!CodedConstant.isNull(t.javaMultipleFiles))
        {
            size+= CodedOutputStream.computeBoolSize(10,f_10.booleanValue());
        }
        ByteString f_11=null;
        if (!CodedConstant.isNull(t.goPackage)) {
            f_11 = ByteString.copyFromUtf8(t.goPackage);
        }if (!CodedConstant.isNull(t.goPackage))
        {
            size+= CodedOutputStream.computeBytesSize(11,f_11);
        }
        Boolean f_16=null;
        if (!CodedConstant.isNull(t.ccGenericServices)) {
            f_16=t.ccGenericServices;
        }if (!CodedConstant.isNull(t.ccGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(16,f_16.booleanValue());
        }
        Boolean f_17=null;
        if (!CodedConstant.isNull(t.javaGenericServices)) {
            f_17=t.javaGenericServices;
        }if (!CodedConstant.isNull(t.javaGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(17,f_17.booleanValue());
        }
        Boolean f_18=null;
        if (!CodedConstant.isNull(t.pyGenericServices)) {
            f_18=t.pyGenericServices;
        }if (!CodedConstant.isNull(t.pyGenericServices))
        {
            size+= CodedOutputStream.computeBoolSize(18,f_18.booleanValue());
        }
        Boolean f_20=null;
        if (!CodedConstant.isNull(t.javaGenerateEqualsAndHash)) {
            f_20=t.javaGenerateEqualsAndHash;
        }if (!CodedConstant.isNull(t.javaGenerateEqualsAndHash))
        {
            size+= CodedOutputStream.computeBoolSize(20,f_20.booleanValue());
        }
        List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOptions)) {
            f_999=t.uninterpretedOptions;
        }if (!CodedConstant.isNull(t.uninterpretedOptions))
        {
            size+=CodedConstant.computeListSize(999,f_999, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.javaPackage)) {
            f_1 = ByteString.copyFromUtf8(t.javaPackage);
        }ByteString f_8=null;
        if (!CodedConstant.isNull(t.javaOuterClassname)) {
            f_8 = ByteString.copyFromUtf8(t.javaOuterClassname);
        }Enum f_9=null;
        if (!CodedConstant.isNull(t.optimizeFor)) {
            f_9=t.optimizeFor;
        }Boolean f_10=null;
        if (!CodedConstant.isNull(t.javaMultipleFiles)) {
            f_10=t.javaMultipleFiles;
        }ByteString f_11=null;
        if (!CodedConstant.isNull(t.goPackage)) {
            f_11 = ByteString.copyFromUtf8(t.goPackage);
        }Boolean f_16=null;
        if (!CodedConstant.isNull(t.ccGenericServices)) {
            f_16=t.ccGenericServices;
        }Boolean f_17=null;
        if (!CodedConstant.isNull(t.javaGenericServices)) {
            f_17=t.javaGenericServices;
        }Boolean f_18=null;
        if (!CodedConstant.isNull(t.pyGenericServices)) {
            f_18=t.pyGenericServices;
        }Boolean f_20=null;
        if (!CodedConstant.isNull(t.javaGenerateEqualsAndHash)) {
            f_20=t.javaGenerateEqualsAndHash;
        }List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOptions)) {
            f_999=t.uninterpretedOptions;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_8!=null){output.writeBytes(8, f_8);
        }if (f_9!=null){output.writeEnum(9, ((com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode) f_9).value());
        }if (f_10!=null){output.writeBool(10, f_10.booleanValue());
        }if (f_11!=null){output.writeBytes(11, f_11);
        }if (f_16!=null){output.writeBool(16, f_16.booleanValue());
        }if (f_17!=null){output.writeBool(17, f_17.booleanValue());
        }if (f_18!=null){output.writeBool(18, f_18.booleanValue());
        }if (f_20!=null){output.writeBool(20, f_20.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    ret.javaPackage=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    ret.javaOuterClassname=input.readString()
                    ;
                    continue;
                }if (tag == 72) {
                    ret.optimizeFor=Enum.valueOf(com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode.class, CodedConstant.getEnumName(com.baidu.bjf.remoting.protobuf.descriptor.OptimizeMode.values(),input.readEnum()))
                    ;
                    continue;
                }if (tag == 80) {
                    ret.javaMultipleFiles=input.readBool()
                    ;
                    continue;
                }if (tag == 90) {
                    ret.goPackage=input.readString()
                    ;
                    continue;
                }if (tag == 128) {
                    ret.ccGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 136) {
                    ret.javaGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 144) {
                    ret.pyGenericServices=input.readBool()
                    ;
                    continue;
                }if (tag == 160) {
                    ret.javaGenerateEqualsAndHash=input.readBool()
                    ;
                    continue;
                }if (tag == 7994) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.uninterpretedOptions) == null) {
                        ret.uninterpretedOptions= new ArrayList();
                    }ret.uninterpretedOptions.add((com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO.class);
        return (this.descriptor = descriptor);
    }
}
