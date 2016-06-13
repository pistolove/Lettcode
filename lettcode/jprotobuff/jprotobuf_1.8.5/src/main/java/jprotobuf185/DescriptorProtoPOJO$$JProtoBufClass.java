package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:33
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        List f_2=null;
        if (!CodedConstant.isNull(t.fields)) {
            f_2=t.fields;
        }if (!CodedConstant.isNull(t.fields))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.nestedTypes)) {
            f_3=t.nestedTypes;
        }if (!CodedConstant.isNull(t.nestedTypes))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.OBJECT,false,null);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_4=t.enumTypes;
        }if (!CodedConstant.isNull(t.enumTypes))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.OBJECT,false,null);
        }
        List f_5=null;
        if (!CodedConstant.isNull(t.extensionRanges)) {
            f_5=t.extensionRanges;
        }if (!CodedConstant.isNull(t.extensionRanges))
        {
            size+=CodedConstant.computeListSize(5,f_5, FieldType.OBJECT,false,null);
        }
        List f_6=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_6=t.extensions;
        }if (!CodedConstant.isNull(t.extensions))
        {
            size+=CodedConstant.computeListSize(6,f_6, FieldType.OBJECT,false,null);
        }
        List f_7=null;
        if (!CodedConstant.isNull(t.options)) {
            f_7=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeListSize(7,f_7, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.OBJECT,f_4);
        }if (f_5!=null){CodedConstant.writeToList(output,5,FieldType.OBJECT,f_5);
        }if (f_6!=null){CodedConstant.writeToList(output,6,FieldType.OBJECT,f_6);
        }if (f_7!=null){CodedConstant.writeToList(output,7,FieldType.OBJECT,f_7);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
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
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.fields) == null) {
                        ret.fields= new ArrayList();
                    }ret.fields.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.nestedTypes) == null) {
                        ret.nestedTypes= new ArrayList();
                    }ret.nestedTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.enumTypes) == null) {
                        ret.enumTypes= new ArrayList();
                    }ret.enumTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 42) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensionRanges) == null) {
                        ret.extensionRanges= new ArrayList();
                    }ret.extensionRanges.add((com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 50) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensions) == null) {
                        ret.extensions= new ArrayList();
                    }ret.extensions.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 58) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.MessageOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.MessageOptionsPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        List f_2=null;
        if (!CodedConstant.isNull(t.fields)) {
            f_2=t.fields;
        }if (!CodedConstant.isNull(t.fields))
        {
            size+=CodedConstant.computeListSize(2,f_2, FieldType.OBJECT,false,null);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.nestedTypes)) {
            f_3=t.nestedTypes;
        }if (!CodedConstant.isNull(t.nestedTypes))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.OBJECT,false,null);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_4=t.enumTypes;
        }if (!CodedConstant.isNull(t.enumTypes))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.OBJECT,false,null);
        }
        List f_5=null;
        if (!CodedConstant.isNull(t.extensionRanges)) {
            f_5=t.extensionRanges;
        }if (!CodedConstant.isNull(t.extensionRanges))
        {
            size+=CodedConstant.computeListSize(5,f_5, FieldType.OBJECT,false,null);
        }
        List f_6=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_6=t.extensions;
        }if (!CodedConstant.isNull(t.extensions))
        {
            size+=CodedConstant.computeListSize(6,f_6, FieldType.OBJECT,false,null);
        }
        List f_7=null;
        if (!CodedConstant.isNull(t.options)) {
            f_7=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeListSize(7,f_7, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }List f_2=null;
        if (!CodedConstant.isNull(t.fields)) {
            f_2=t.fields;
        }List f_3=null;
        if (!CodedConstant.isNull(t.nestedTypes)) {
            f_3=t.nestedTypes;
        }List f_4=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_4=t.enumTypes;
        }List f_5=null;
        if (!CodedConstant.isNull(t.extensionRanges)) {
            f_5=t.extensionRanges;
        }List f_6=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_6=t.extensions;
        }List f_7=null;
        if (!CodedConstant.isNull(t.options)) {
            f_7=t.options;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){CodedConstant.writeToList(output,2,FieldType.OBJECT,f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.OBJECT,f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.OBJECT,f_4);
        }if (f_5!=null){CodedConstant.writeToList(output,5,FieldType.OBJECT,f_5);
        }if (f_6!=null){CodedConstant.writeToList(output,6,FieldType.OBJECT,f_6);
        }if (f_7!=null){CodedConstant.writeToList(output,7,FieldType.OBJECT,f_7);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO();try {
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
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.fields) == null) {
                        ret.fields= new ArrayList();
                    }ret.fields.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 26) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.nestedTypes) == null) {
                        ret.nestedTypes= new ArrayList();
                    }ret.nestedTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.enumTypes) == null) {
                        ret.enumTypes= new ArrayList();
                    }ret.enumTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 42) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensionRanges) == null) {
                        ret.extensionRanges= new ArrayList();
                    }ret.extensionRanges.add((com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 50) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensions) == null) {
                        ret.extensions= new ArrayList();
                    }ret.extensions.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 58) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.MessageOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.options) == null) {
                        ret.options= new ArrayList();
                    }ret.options.add((com.baidu.bjf.remoting.protobuf.descriptor.MessageOptionsPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
