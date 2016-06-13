package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 09:57
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;

public class ExtensionRangePOJO$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO> {
    private Descriptors.Descriptor descriptor;
    public byte[] encode(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO t) throws IOException {
        int size = 0;Integer f_1=null;
        if (!CodedConstant.isNull(t.start)) {
            f_1=t.start;
        }if (!CodedConstant.isNull(t.start))
        {
            size+= CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }
        Integer f_2=null;
        if (!CodedConstant.isNull(t.end)) {
            f_2=t.end;
        }if (!CodedConstant.isNull(t.end))
        {
            size+= CodedOutputStream.computeInt32Size(2,f_2.intValue());
        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        if (f_1!=null){output.writeInt32(1, f_1.intValue());
        }if (f_2!=null){output.writeInt32(2, f_2.intValue());
        }return result;
    }
    public com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO decode(byte[] bb) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.start=input.readInt32()
                    ;
                    continue;
                }if (tag == 16) {
                    ret.end=input.readInt32()
                    ;
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO t) throws IOException {
        int size = 0;Integer f_1=null;
        if (!CodedConstant.isNull(t.start)) {
            f_1=t.start;
        }if (!CodedConstant.isNull(t.start))
        {
            size+= CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }
        Integer f_2=null;
        if (!CodedConstant.isNull(t.end)) {
            f_2=t.end;
        }if (!CodedConstant.isNull(t.end))
        {
            size+= CodedOutputStream.computeInt32Size(2,f_2.intValue());
        }
        return size;
    }
    public void writeTo(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO t, CodedOutputStream output) throws IOException {
        Integer f_1=null;
        if (!CodedConstant.isNull(t.start)) {
            f_1=t.start;
        }Integer f_2=null;
        if (!CodedConstant.isNull(t.end)) {
            f_2=t.end;
        }if (f_1!=null){output.writeInt32(1, f_1.intValue());
        }if (f_2!=null){output.writeInt32(2, f_2.intValue());
        }}
    public com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO readFrom(CodedInputStream input) throws IOException {
        com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO ret = new com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.start=input.readInt32()
                    ;
                    continue;
                }if (tag == 16) {
                    ret.end=input.readInt32()
                    ;
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.baidu.bjf.remoting.protobuf.descriptor.ExtensionRangePOJO.class);
        return (this.descriptor = descriptor);
    }
}
