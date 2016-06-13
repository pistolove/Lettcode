package compare.xulitest;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/20
 * Time: 下午8:12
 */
import com.google.protobuf.*;
import java.io.IOException;
import com.baidu.bjf.remoting.protobuf.utils.*;
import java.lang.reflect.*;
import com.baidu.bjf.remoting.protobuf.*;
import java.util.*;
public class StudentClass$$JProtoBufClass implements com.baidu.bjf.remoting.protobuf.Codec<StudentClass> {
    private com.google.protobuf.Descriptors.Descriptor descriptor;
    public byte[] encode(StudentClass t) throws IOException {
        int size = 0;
        List f_1=null;
        if (!CodedConstant.isNull(t.getStudents())) {
            f_1=t.getStudents();
        }if (!CodedConstant.isNull(t.getStudents())){
            size += CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,ProtobufProxy.OUTPUT_PATH.get());

        }
        final byte[] result = new byte[size];
        final CodedOutputStream output = CodedOutputStream.newInstance(result);
        writeTo(t, output);
        return result;
    }
    public StudentClass decode(byte[] bb) throws IOException {
        CodedInputStream input = CodedInputStream.newInstance(bb, 0, bb.length);
        StudentClass ret = new StudentClass();
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(Student.class, false,ProtobufProxy.OUTPUT_PATH.get());
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.getStudents()) == null) {
                        List __list = new ArrayList();
                        ret.setStudents(__list);
                    }
                    (ret.getStudents()).add((Student) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
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
    public int size(StudentClass t) throws IOException {
        int size = 0;
        List f_1=null;
        if (!CodedConstant.isNull(t.getStudents())) {
            f_1=t.getStudents();
        }if (!CodedConstant.isNull(t.getStudents())){
            size += CodedConstant.computeListSize(1,f_1, FieldType.OBJECT,false,ProtobufProxy.OUTPUT_PATH.get());
        }
        return size;
    }
    public void writeTo(StudentClass t, CodedOutputStream output) throws IOException {
        List f_1=null;
        if (!CodedConstant.isNull(t.getStudents())) {
            f_1=t.getStudents();
        }if (f_1!=null){
            CodedConstant.writeToList(output,1,FieldType.OBJECT,f_1);
        }}
    public StudentClass readFrom(CodedInputStream input) throws IOException {
        StudentClass ret = new StudentClass();
        try {
            boolean done = false;
            Codec codec = null;
            while (!done) {
                int tag = input.readTag();
                if (tag == 0) { break;}
                if (tag == 10) {
                    codec = ProtobufProxy.create(Student.class, false,ProtobufProxy.OUTPUT_PATH.get());
                    int length = input.readRawVarint32();
                    final int oldLimit = input.pushLimit(length);
                    if ((ret.getStudents()) == null) {
                        List __list = new ArrayList();
                        ret.setStudents(__list);
                    }
                    (ret.getStudents()).add((Student) codec.readFrom(input));
                    input.checkLastTagWas(0);
                    input.popLimit(oldLimit);
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
        com.google.protobuf.Descriptors.Descriptor descriptor = CodedConstant.getDescriptor(StudentClass.class);
        return (this.descriptor = descriptor);
    }
}
