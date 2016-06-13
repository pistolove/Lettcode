package jprotobuf185;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/24
 * Time: 10:09
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloJson$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<com.test.HelloJson> {
    private Descriptors.Descriptor descriptor;

    public HelloJson$$JProtoBufClass() {
    }

    public byte[] encode(com.test.HelloJson t) throws IOException {
        int size = 0;Integer f_1=null;

        Long stime_jpb_encode = System.currentTimeMillis();
        if (!CodedConstant.isNull(t.getId())) {
            Long etime_jpb_encode = System.currentTimeMillis();
            System.out.println("jprotobuf 1.8.5 CodedConstant.writeToList：" + (etime_jpb_encode - stime_jpb_encode));

            f_1=t.getId();
        }

        if (!CodedConstant.isNull(t.getId()))
        {
            size+= CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }

        ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName()))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak()))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }

        List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (!CodedConstant.isNull(t.getPhone()))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.STRING,false,null);
        }

        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);

        if (f_1!=null){output.writeInt32(1, f_1.intValue());
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.STRING,f_4);
        }
        return result;
    }
    public com.test.HelloJson decode(byte[] bb) throws IOException {
        com.test.HelloJson ret = new com.test.HelloJson();CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.setId(input.readInt32())
                    ;
                    continue;
                }if (tag == 18) {
                    ret.setName(input.readString())
                    ;
                    continue;
                }if (tag == 26) {
                    ret.setSpeak(input.readString())
                    ;
                    continue;
                }if (tag == 34) {
                    if ((ret.getPhone()) == null) {
                        List __list = new ArrayList();
                        ret.setPhone(__list);
                    }(ret.getPhone()).add(input.readString());
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public int size(com.test.HelloJson t) throws IOException {
        int size = 0;Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }if (!CodedConstant.isNull(t.getId()))
        {
            size+= CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName()))
        {
            size+= CodedOutputStream.computeBytesSize(2,f_2);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak()))
        {
            size+= CodedOutputStream.computeBytesSize(3,f_3);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (!CodedConstant.isNull(t.getPhone()))
        {
            size+=CodedConstant.computeListSize(4,f_4, FieldType.STRING,false,null);
        }
        return size;
    }
    public void writeTo(com.test.HelloJson t, CodedOutputStream output) throws IOException {
        Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = ByteString.copyFromUtf8(t.getName());
        }ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = ByteString.copyFromUtf8(t.getSpeak());
        }List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (f_1!=null){output.writeInt32(1, f_1.intValue());
        }if (f_2!=null){output.writeBytes(2, f_2);
        }if (f_3!=null){output.writeBytes(3, f_3);
        }if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.STRING,f_4);
        }}
    public com.test.HelloJson readFrom(CodedInputStream input) throws IOException {
        com.test.HelloJson ret = new com.test.HelloJson();try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 8) {
                    ret.setId(input.readInt32())
                    ;
                    continue;
                }if (tag == 18) {
                    ret.setName(input.readString())
                    ;
                    continue;
                }if (tag == 26) {
                    ret.setSpeak(input.readString())
                    ;
                    continue;
                }if (tag == 34) {
                    if ((ret.getPhone()) == null) {
                        List __list = new ArrayList();
                        ret.setPhone(__list);
                    }(ret.getPhone()).add(input.readString());
                    continue;
                }input.skipField(tag);
            }} catch (InvalidProtocolBufferException e) {throw e;} catch (IOException e) {throw e;}return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(com.test.HelloJson.class);
        return (this.descriptor = descriptor);
    }
}
