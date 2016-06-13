package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 10:04
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

public class SourceCodeInfoPOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO t) throws IOException {
        int size = 0;List f_1=null;
        if (!CodedConstant.isNull(t.locations)) {
            f_1=t.locations;
        }if (!CodedConstant.isNull(t.locations))
        {
            size+=CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,null);
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){CodedConstant.writeToList(output,1,FieldType.OBJECT,f_1);
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.LocationPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.locations) == null) {
                        ret.locations= new ArrayList();
                    }ret.locations.add((com.baidu.bjf.remoting.protobuf.descriptor.LocationPOJO) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO t) throws IOException {
        int size = 0;List f_1=null;
        if (!CodedConstant.isNull(t.locations)) {
            f_1=t.locations;
        }if (!CodedConstant.isNull(t.locations))
        {
            size+=CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,null);
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO t, CodedOutputStream output) throws IOException {
        List f_1=null;
        if (!CodedConstant.isNull(t.locations)) {
            f_1=t.locations;
        }if (f_1!=null){CodedConstant.writeToList(output,1,FieldType.OBJECT,f_1);
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.descriptor.LocationPOJO.class, false,null);
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.locations) == null) {
                        ret.locations= new ArrayList();
                    }ret.locations.add((com.baidu.bjf.remoting.protobuf.descriptor.LocationPOJO) codec.readFrom(input));
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
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.SourceCodeInfoPOJO.class);
        return (this.descriptor = descriptor);
    }
}