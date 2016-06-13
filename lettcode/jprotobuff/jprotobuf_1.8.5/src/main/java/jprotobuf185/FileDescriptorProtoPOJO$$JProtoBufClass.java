package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:22
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDescriptorProtoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.pkg)) {
            f_2 = ByteString.copyFromUtf8(t.pkg);
        }if (!CodedConstant.isNull(t.pkg))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.dependencies)) {
            f_3=t.dependencies;
        }if (!CodedConstant.isNull(t.dependencies))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.STRING,false,null);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.messageTypes)) {
            f_4=t.messageTypes;
        }if (!CodedConstant.isNull(t.messageTypes))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.OBJECT,false,null);
        }
        List f_5=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_5=t.enumTypes;
        }if (!CodedConstant.isNull(t.enumTypes))
        {
            size+=CodedConstant.computeListSize(5,f_5, FieldType.OBJECT,false,null);
        }
        List f_6=null;
        if (!CodedConstant.isNull(t.services)) {
            f_6=t.services;
        }if (!CodedConstant.isNull(t.services))
        {
            size+=CodedConstant.computeListSize(6,f_6, FieldType.OBJECT,false,null);
        }
        List f_7=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_7=t.extensions;
        }if (!CodedConstant.isNull(t.extensions))
        {
            size+=CodedConstant.computeListSize(7,f_7, FieldType.OBJECT,false,null);
        }
        Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(8,f_8, FieldType.OBJECT,false,null);
        }
        Object f_9=null;
        if (!CodedConstant.isNull(t.sourceCodeInfo)) {
            f_9=t.sourceCodeInfo;
        }if (!CodedConstant.isNull(t.sourceCodeInfo))
        {
            size+=CodedConstant.computeSize(9,f_9, FieldType.OBJECT,false,null);
        }
        List f_10=null;
        if (!CodedConstant.isNull(t.publicDependency)) {
            f_10=t.publicDependency;
        }if (!CodedConstant.isNull(t.publicDependency))
        {
            size+=CodedConstant.computeListSize(10,f_10, FieldType.INT32,false,null);
        }
        List f_11=null;
        if (!CodedConstant.isNull(t.weakDependency)) {
            f_11=t.weakDependency;
        }if (!CodedConstant.isNull(t.weakDependency))
        {
            size+=CodedConstant.computeListSize(11,f_11, FieldType.INT32,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.STRING,f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.OBJECT,f_4);
        }if (f_5!=null){CodedConstant.writeToList(output,5,FieldType.OBJECT,f_5);
        }if (f_6!=null){CodedConstant.writeToList(output,6,FieldType.OBJECT,f_6);
        }if (f_7!=null){CodedConstant.writeToList(output,7,FieldType.OBJECT,f_7);
        }if (f_8!=null){CodedConstant.writeObject(output,8,FieldType.OBJECT,f_8, false);
        }if (f_9!=null){CodedConstant.writeObject(output,9,FieldType.OBJECT,f_9, false);
        }if (f_10!=null){CodedConstant.writeToList(output,10,FieldType.INT32,f_10);
        }if (f_11!=null){CodedConstant.writeToList(output,11,FieldType.INT32,f_11);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
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
                    ret.pkg=input.readString()
                    ;
                    continue;
                }if (tag == 26) {
                    if ((ret.dependencies) == null) {
                        ret.dependencies= new ArrayList();
                    }ret.dependencies.add(input.readString());
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.messageTypes) == null) {
                        ret.messageTypes= new ArrayList();
                    }ret.messageTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 42) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.enumTypes) == null) {
                        ret.enumTypes= new ArrayList();
                    }ret.enumTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 50) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.ServiceDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.services) == null) {
                        ret.services= new ArrayList();
                    }ret.services.add((com.baidu.bjf.remoting.protobuf.descriptor.ServiceDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 58) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensions) == null) {
                        ret.extensions= new ArrayList();
                    }ret.extensions.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 66) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 74) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.sourceCodeInfo=(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 80) {
                    if ((ret.publicDependency) == null) {
                        ret.publicDependency= new ArrayList();
                    }ret.publicDependency.add(input.readInt32());
                    continue;
                }if (tag == 88) {
                    if ((ret.weakDependency) == null) {
                        ret.weakDependency= new ArrayList();
                    }ret.weakDependency.add(input.readInt32());
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO t) throws IOException {
        int size = 0;ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }if (!CodedConstant.isNull(t.name))
        {
            size+= CodedOutputStream.computeBytesSize(1,f_1);
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.pkg)) {
            f_2 = ByteString.copyFromUtf8(t.pkg);
        }if (!CodedConstant.isNull(t.pkg))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        List f_3=null;
        if (!CodedConstant.isNull(t.dependencies)) {
            f_3=t.dependencies;
        }if (!CodedConstant.isNull(t.dependencies))
        {
            size+=CodedConstant.computeListSize(3,f_3, FieldType.STRING,false,null);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.messageTypes)) {
            f_4=t.messageTypes;
        }if (!CodedConstant.isNull(t.messageTypes))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.OBJECT,false,null);
        }
        List f_5=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_5=t.enumTypes;
        }if (!CodedConstant.isNull(t.enumTypes))
        {
            size+=CodedConstant.computeListSize(5,f_5, FieldType.OBJECT,false,null);
        }
        List f_6=null;
        if (!CodedConstant.isNull(t.services)) {
            f_6=t.services;
        }if (!CodedConstant.isNull(t.services))
        {
            size+=CodedConstant.computeListSize(6,f_6, FieldType.OBJECT,false,null);
        }
        List f_7=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_7=t.extensions;
        }if (!CodedConstant.isNull(t.extensions))
        {
            size+=CodedConstant.computeListSize(7,f_7, FieldType.OBJECT,false,null);
        }
        Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }if (!CodedConstant.isNull(t.options))
        {
            size+=CodedConstant.computeSize(8,f_8, FieldType.OBJECT,false,null);
        }
        Object f_9=null;
        if (!CodedConstant.isNull(t.sourceCodeInfo)) {
            f_9=t.sourceCodeInfo;
        }if (!CodedConstant.isNull(t.sourceCodeInfo))
        {
            size+=CodedConstant.computeSize(9,f_9, FieldType.OBJECT,false,null);
        }
        List f_10=null;
        if (!CodedConstant.isNull(t.publicDependency)) {
            f_10=t.publicDependency;
        }if (!CodedConstant.isNull(t.publicDependency))
        {
            size+=CodedConstant.computeListSize(10,f_10, FieldType.INT32,false,null);
        }
        List f_11=null;
        if (!CodedConstant.isNull(t.weakDependency)) {
            f_11=t.weakDependency;
        }if (!CodedConstant.isNull(t.weakDependency))
        {
            size+=CodedConstant.computeListSize(11,f_11, FieldType.INT32,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO t, CodedOutputStream output) throws IOException {
        ByteString f_1=null;
        if (!CodedConstant.isNull(t.name)) {
            f_1 = ByteString.copyFromUtf8(t.name);
        }ByteString f_2=null;
        if (!CodedConstant.isNull(t.pkg)) {
            f_2 = ByteString.copyFromUtf8(t.pkg);
        }List f_3=null;
        if (!CodedConstant.isNull(t.dependencies)) {
            f_3=t.dependencies;
        }List f_4=null;
        if (!CodedConstant.isNull(t.messageTypes)) {
            f_4=t.messageTypes;
        }List f_5=null;
        if (!CodedConstant.isNull(t.enumTypes)) {
            f_5=t.enumTypes;
        }List f_6=null;
        if (!CodedConstant.isNull(t.services)) {
            f_6=t.services;
        }List f_7=null;
        if (!CodedConstant.isNull(t.extensions)) {
            f_7=t.extensions;
        }Object f_8=null;
        if (!CodedConstant.isNull(t.options)) {
            f_8=t.options;
        }Object f_9=null;
        if (!CodedConstant.isNull(t.sourceCodeInfo)) {
            f_9=t.sourceCodeInfo;
        }List f_10=null;
        if (!CodedConstant.isNull(t.publicDependency)) {
            f_10=t.publicDependency;
        }List f_11=null;
        if (!CodedConstant.isNull(t.weakDependency)) {
            f_11=t.weakDependency;
        }if (f_1!=null){output.writeBytes(1, f_1);
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){CodedConstant.writeToList(output,3,FieldType.STRING,f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.OBJECT,f_4);
        }if (f_5!=null){CodedConstant.writeToList(output,5,FieldType.OBJECT,f_5);
        }if (f_6!=null){CodedConstant.writeToList(output,6,FieldType.OBJECT,f_6);
        }if (f_7!=null){CodedConstant.writeToList(output,7,FieldType.OBJECT,f_7);
        }if (f_8!=null){CodedConstant.writeObject(output,8,FieldType.OBJECT,f_8, false);
        }if (f_9!=null){CodedConstant.writeObject(output,9,FieldType.OBJECT,f_9, false);
        }if (f_10!=null){CodedConstant.writeToList(output,10,FieldType.INT32,f_10);
        }if (f_11!=null){CodedConstant.writeToList(output,11,FieldType.INT32,f_11);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO();try {
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
                    ret.pkg=input.readString()
                    ;
                    continue;
                }if (tag == 26) {
                    if ((ret.dependencies) == null) {
                        ret.dependencies= new ArrayList();
                    }ret.dependencies.add(input.readString());
                    continue;
                }if (tag == 34) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.messageTypes) == null) {
                        ret.messageTypes= new ArrayList();
                    }ret.messageTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.DescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 42) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.enumTypes) == null) {
                        ret.enumTypes= new ArrayList();
                    }ret.enumTypes.add((com.baidu.bjf.remoting.protobuf.descriptor.EnumDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 50) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.ServiceDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.services) == null) {
                        ret.services= new ArrayList();
                    }ret.services.add((com.baidu.bjf.remoting.protobuf.descriptor.ServiceDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 58) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.extensions) == null) {
                        ret.extensions= new ArrayList();
                    }ret.extensions.add((com.baidu.bjf.remoting.protobuf.descriptor.FieldDescriptorProtoPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 66) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.options=(com.baidu.bjf.remoting.protobuf.descriptor.FileOptionsPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 74) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    ret.sourceCodeInfo=(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO) codec.readFrom(input)
                    ;
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }if (tag == 80) {
                    if ((ret.publicDependency) == null) {
                        ret.publicDependency= new ArrayList();
                    }ret.publicDependency.add(input.readInt32());
                    continue;
                }if (tag == 88) {
                    if ((ret.weakDependency) == null) {
                        ret.weakDependency= new ArrayList();
                    }ret.weakDependency.add(input.readInt32());
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.FileDescriptorProtoPOJO.class);
        return (this.descriptor = descriptor);
    }
}
