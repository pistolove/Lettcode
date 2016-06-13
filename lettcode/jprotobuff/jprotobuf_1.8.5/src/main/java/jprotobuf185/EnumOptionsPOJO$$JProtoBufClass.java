package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:35
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

public class EnumOptionsPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO t) throws IOException {
        int size = 0;Boolean f_2=null;
        if (!CodedConstant.isNull(t.allowAlias)) {
            f_2=t.allowAlias;
        }if (!CodedConstant.isNull(t.allowAlias))
        {
            size+= CodedOutputStream.computeBoolSize(2,f_2.booleanValue());
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
        if (f_2!=null){output.writeBool(2, f_2.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 16) {
                    ret.allowAlias=input.readBool()
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
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO t) throws IOException {
        int size = 0;Boolean f_2=null;
        if (!CodedConstant.isNull(t.allowAlias)) {
            f_2=t.allowAlias;
        }if (!CodedConstant.isNull(t.allowAlias))
        {
            size+= CodedOutputStream.computeBoolSize(2,f_2.booleanValue());
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
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO t, CodedOutputStream output) throws IOException {
        Boolean f_2=null;
        if (!CodedConstant.isNull(t.allowAlias)) {
            f_2=t.allowAlias;
        }List f_999=null;
        if (!CodedConstant.isNull(t.uninterpretedOptions)) {
            f_999=t.uninterpretedOptions;
        }if (f_2!=null){output.writeBool(2, f_2.booleanValue());
        }if (f_999!=null){CodedConstant.writeToList(output,999,FieldType.OBJECT,f_999);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 16) {
                    ret.allowAlias=input.readBool()
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.EnumOptionsPOJO.class);
        return (this.descriptor = descriptor);
    }
}
