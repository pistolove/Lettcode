package compare.xulitest;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/21
 * Time: 下午3:09
 */
import com.google.protobuf.*;
import java.io.IOException;
import com.baidu.bjf.remoting.protobuf.utils.*;
import java.lang.reflect.*;
import com.baidu.bjf.remoting.protobuf.*;
import java.util.*;

public class Student$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<Student> {
    private com.google.protobuf.Descriptors.Descriptor descriptor;
    public byte[] encode(Student t) throws IOException {
        int size = 0;Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }if (!CodedConstant.isNull(t.getId())){
            size += com.google.protobuf.CodedOutputStream.computeInt32Size(1,f_1.intValue());

        }
        com.google.protobuf.ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = com.google.protobuf.ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName())){
            size += com.google.protobuf.CodedOutputStream.computeBytesSize(2,f_2);

        }
        com.google.protobuf.ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = com.google.protobuf.ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak())){
            size += com.google.protobuf.CodedOutputStream.computeBytesSize(3,f_3);

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
    public Student decode(byte[] bb) throws IOException {
        CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        Student ret = new Student();
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
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e;
        } catch (java.io.IOException e) {
            throw e;
        }
        return ret;
    }
    public int size(Student t) throws IOException {
        int size = 0;
        Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }if (!CodedConstant.isNull(t.getId())){
            size += com.google.protobuf.CodedOutputStream.computeInt32Size(1,f_1.intValue());
        }
        com.google.protobuf.ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = com.google.protobuf.ByteString.copyFromUtf8(t.getName());
        }if (!CodedConstant.isNull(t.getName())){
            size += com.google.protobuf.CodedOutputStream.computeBytesSize(2,f_2);
        }
        com.google.protobuf.ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = com.google.protobuf.ByteString.copyFromUtf8(t.getSpeak());
        }if (!CodedConstant.isNull(t.getSpeak())){
            size += com.google.protobuf.CodedOutputStream.computeBytesSize(3,f_3);
        }
        List f_4=null;
        if (!CodedConstant.isNull(t.getPhone())) {
            f_4=t.getPhone();
        }if (!CodedConstant.isNull(t.getPhone())){
            size += CodedConstant.computeListSize(4,f_4, FieldType.STRING,false,ProtobufProxy.OUTPUT_PATH.get());
        }
        return size;
    }
    public void writeTo(Student t, CodedOutputStream output) throws IOException {
        Integer f_1=null;
        if (!CodedConstant.isNull(t.getId())) {
            f_1=t.getId();
        }com.google.protobuf.ByteString f_2=null;
        if (!CodedConstant.isNull(t.getName())) {
            f_2 = com.google.protobuf.ByteString.copyFromUtf8(t.getName());
        }com.google.protobuf.ByteString f_3=null;
        if (!CodedConstant.isNull(t.getSpeak())) {
            f_3 = com.google.protobuf.ByteString.copyFromUtf8(t.getSpeak());
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
    public Student readFrom(CodedInputStream input) throws IOException {
        Student ret = new Student();
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
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e;
        } catch (java.io.IOException e) {
            throw e;
        }
        return ret;
    }
    public com.google.protobuf.Descriptors.Descriptor getDescriptor() throws IOException {
        if (this.descriptor != null) {
            return this.descriptor;
        }
        com.google.protobuf.Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(Student.class);
        return (this.descriptor = descriptor);
    }
}
