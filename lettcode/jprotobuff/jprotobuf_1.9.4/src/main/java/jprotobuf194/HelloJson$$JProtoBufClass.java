package jprotobuf194;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/3/23
 * Time: 14:57
 */

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.CodedConstant;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.google.protobuf.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloJson$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<compare.HelloJson> {
    private Descriptors.Descriptor descriptor;

    public HelloJson$$JProtoBufClass() {
    }

    public byte[] encode(compare.HelloJson t) throws IOException {
        Long stime_jpb_encode = System.currentTimeMillis();
        int size = 0;Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            Long etime_jpb_encode = System.currentTimeMillis();
            System.out.println("jprotobuf 1.9.4 CodedConstant.writeToList：" + (etime_jpb_encode - stime_jpb_encode));

            f_1=t.getId();
        }if (!CodedConstant.isNull(t.getId())){
            size += CodedOutputStream.computeInt32Size(1,f_1.intValue());

        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName())){
            size += CodedOutputStream.computeBytesSize(2,f_2);

        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak())){
            size += CodedOutputStream.computeBytesSize(3,f_3);

        }
        List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (!CodedConstant.isNull(t.getPhone())){
            size += CodedConstant.computeListSize(4,f_4, FieldType.STRING,false,ProtobufProxy.OUTPUT_PATH.get());

        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        writeTo(t, output);
        return result;
    }
    public compare.HelloJson decode(byte[] bb) throws IOException {
        CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        compare.HelloJson ret = new compare.HelloJson();
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
                }
                if (tag == 18) {
                    ret.setName(input.readString())
                    ;
                    continue;
                }
                if (tag == 26) {
                    ret.setSpeak(input.readString())
                    ;
                    continue;
                }
                if (tag == 34) {
                    if ((ret.getPhone()) == null) {
                        List __list = new ArrayList();
                        ret.setPhone(__list);
                    }
                    (ret.getPhone()).add(input.readString());
                    continue;
                }
                input.skipField(tag);
            }
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        return ret;
    }
    public int size(compare.HelloJson t) throws IOException {
        int size = 0;
        Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }if (!CodedConstant.isNull(t.getId())){
            size += CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }
        ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName())){
            size += CodedOutputStream.computeBytesSize(2,f_2);
        }
        ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak())){
            size += CodedOutputStream.computeBytesSize(3,f_3);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (!CodedConstant.isNull(t.getPhone())){
            size += CodedConstant.computeListSize(4,f_4, FieldType.STRING,false,ProtobufProxy.OUTPUT_PATH.get());
        }
        return size;
    }
    public void writeTo(compare.HelloJson t, CodedOutputStream output) throws IOException {
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
        }
        if (f_2!=null){output.writeBytes(2, f_2);
        }
        if (f_3!=null){output.writeBytes(3, f_3);
        }
        if (f_4!=null){CodedConstant.writeToList(output,4,FieldType.STRING,f_4);
        }}
    public compare.HelloJson readFrom(CodedInputStream input) throws IOException {
        compare.HelloJson ret = new compare.HelloJson();
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
                }
                if (tag == 18) {
                    ret.setName(input.readString())
                    ;
                    continue;
                }
                if (tag == 26) {
                    ret.setSpeak(input.readString())
                    ;
                    continue;
                }
                if (tag == 34) {
                    if ((ret.getPhone()) == null) {
                        List __list = new ArrayList();
                        ret.setPhone(__list);
                    }
                    (ret.getPhone()).add(input.readString());
                    continue;
                }
                input.skipField(tag);
            }
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        return ret;
    }
    public Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(compare.HelloJson.class);
        return (this.descriptor = descriptor);
    }
}
