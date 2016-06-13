package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:30
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UninterpretedOptionPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO t) throws IOException {
        int size = 0;List f_2=null;
        if (!CodedConstant.isNull(t.names)) {
            f_2=t.names;
        }if (!CodedConstant.isNull(t.names))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.identifierValue)) {
            f_3 = ByteString.copyFromUtf8(t.identifierValue);
        }if (!CodedConstant.isNull(t.identifierValue))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }
        Long f_4=null;
        if (!CodedConstant.isNull(t.positiveIntValue)) {
            f_4=t.positiveIntValue;
        }if (!CodedConstant.isNull(t.positiveIntValue))
        {
            size+= CodedOutputStream.computeInt64Size(4,f_4.longValue());
        }
        Long f_5=null;
        if (!CodedConstant.isNull(t.negativeIntValue)) {
            f_5=t.negativeIntValue;
        }if (!CodedConstant.isNull(t.negativeIntValue))
        {
            size+= CodedOutputStream.computeInt64Size(5,f_5.longValue());
        }
        Double f_6=null;
        if (!CodedConstant.isNull(t.doubleValue)) {
            f_6=t.doubleValue;
        }if (!CodedConstant.isNull(t.doubleValue))
        {
            size+= CodedOutputStream.computeDoubleSize(6,f_6.doubleValue());
        }
        ByteString f_7=null;
        if (!CodedConstant.isNull(t.stringValue)) {
            f_7 = ByteString.copyFromUtf8(t.stringValue);
        }if (!CodedConstant.isNull(t.stringValue))
        {
            size+= CodedOutputStream.computeBytesSize(7,f_7);
        }
        ByteString f_8=null;
        if (!CodedConstant.isNull(t.aggregateValue)) {
            f_8 = ByteString.copyFromUtf8(t.aggregateValue);
        }if (!CodedConstant.isNull(t.aggregateValue))
        {
            size+= CodedOutputStream.computeBytesSize(8,f_8);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){output.writeInt64(4, f_4.longValue());
        }if (f_5!=null){output.writeInt64(5, f_5.longValue());
        }if (f_6!=null){output.writeDouble(6, f_6.doubleValue());
        }if (f_7!=null){output.writeBytes(7, f_7);
        }if (f_8!=null){output.writeBytes(8, f_8);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 18) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.NamePartPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.names) == null) {
                        ret.names= new ArrayList();
                    }ret.names.add((com.baidu.bjf.remoting.protobuf.descriptor.NamePartPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    ret.identifierValue=input.readString()
                    ;
                    continue;
                }if (tag == 32) {
                    ret.positiveIntValue=input.readInt64()
                    ;
                    continue;
                }if (tag == 40) {
                    ret.negativeIntValue=input.readInt64()
                    ;
                    continue;
                }if (tag == 49) {
                    ret.doubleValue=input.readDouble()
                    ;
                    continue;
                }if (tag == 58) {
                    ret.stringValue=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    ret.aggregateValue=input.readString()
                    ;
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO t) throws IOException {
        int size = 0;List f_2=null;
        if (!CodedConstant.isNull(t.names)) {
            f_2=t.names;
        }if (!CodedConstant.isNull(t.names))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.identifierValue)) {
            f_3 = ByteString.copyFromUtf8(t.identifierValue);
        }if (!CodedConstant.isNull(t.identifierValue))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }
        Long f_4=null;
        if (!CodedConstant.isNull(t.positiveIntValue)) {
            f_4=t.positiveIntValue;
        }if (!CodedConstant.isNull(t.positiveIntValue))
        {
            size+= CodedOutputStream.computeInt64Size(4,f_4.longValue());
        }
        Long f_5=null;
        if (!CodedConstant.isNull(t.negativeIntValue)) {
            f_5=t.negativeIntValue;
        }if (!CodedConstant.isNull(t.negativeIntValue))
        {
            size+= CodedOutputStream.computeInt64Size(5,f_5.longValue());
        }
        Double f_6=null;
        if (!CodedConstant.isNull(t.doubleValue)) {
            f_6=t.doubleValue;
        }if (!CodedConstant.isNull(t.doubleValue))
        {
            size+= CodedOutputStream.computeDoubleSize(6,f_6.doubleValue());
        }
        ByteString f_7=null;
        if (!CodedConstant.isNull(t.stringValue)) {
            f_7 = ByteString.copyFromUtf8(t.stringValue);
        }if (!CodedConstant.isNull(t.stringValue))
        {
            size+= CodedOutputStream.computeBytesSize(7,f_7);
        }
        ByteString f_8=null;
        if (!CodedConstant.isNull(t.aggregateValue)) {
            f_8 = ByteString.copyFromUtf8(t.aggregateValue);
        }if (!CodedConstant.isNull(t.aggregateValue))
        {
            size+= CodedOutputStream.computeBytesSize(8,f_8);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO t, CodedOutputStream output) throws IOException {
        List f_2=null;
        if (!CodedConstant.isNull(t.names)) {
            f_2=t.names;
        }ByteString f_3=null;
        if (!CodedConstant.isNull(t.identifierValue)) {
            f_3 = ByteString.copyFromUtf8(t.identifierValue);
        }Long f_4=null;
        if (!CodedConstant.isNull(t.positiveIntValue)) {
            f_4=t.positiveIntValue;
        }Long f_5=null;
        if (!CodedConstant.isNull(t.negativeIntValue)) {
            f_5=t.negativeIntValue;
        }Double f_6=null;
        if (!CodedConstant.isNull(t.doubleValue)) {
            f_6=t.doubleValue;
        }ByteString f_7=null;
        if (!CodedConstant.isNull(t.stringValue)) {
            f_7 = ByteString.copyFromUtf8(t.stringValue);
        }ByteString f_8=null;
        if (!CodedConstant.isNull(t.aggregateValue)) {
            f_8 = ByteString.copyFromUtf8(t.aggregateValue);
        }if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){output.writeInt64(4, f_4.longValue());
        }if (f_5!=null){output.writeInt64(5, f_5.longValue());
        }if (f_6!=null){output.writeDouble(6, f_6.doubleValue());
        }if (f_7!=null){output.writeBytes(7, f_7);
        }if (f_8!=null){output.writeBytes(8, f_8);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 18) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.NamePartPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.names) == null) {
                        ret.names= new ArrayList();
                    }ret.names.add((com.baidu.bjf.remoting.protobuf.descriptor.NamePartPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    ret.identifierValue=input.readString()
                    ;
                    continue;
                }if (tag == 32) {
                    ret.positiveIntValue=input.readInt64()
                    ;
                    continue;
                }if (tag == 40) {
                    ret.negativeIntValue=input.readInt64()
                    ;
                    continue;
                }if (tag == 49) {
                    ret.doubleValue=input.readDouble()
                    ;
                    continue;
                }if (tag == 58) {
                    ret.stringValue=input.readString()
                    ;
                    continue;
                }if (tag == 66) {
                    ret.aggregateValue=input.readString()
                    ;
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.UninterpretedOptionPOJO.class);
        return (this.descriptor = descriptor);
    }
}
