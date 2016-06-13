package compare.xulitest;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/20
 * Time: 下午6:32
 */
public class xulimain {

    public static void main(String[] args) {
        try{
            Long stime_jpb_create = System.currentTimeMillis();
            Codec<StudentClass> studentClassCodec = ProtobufProxy.create(StudentClass.class, false);
            Long etime_jpb_end = System.currentTimeMillis();
            System.out.println("jprotobuf  create 耗时："+ (etime_jpb_end-stime_jpb_create) + "ms");

            StudentClass helloCons = new StudentClass();
            List<Student> helloJsonList = new ArrayList<Student>();
            for(int i = 0;i < 5000;i++){
                Student student = new Student();
                student.setId(12);
                student.setName("xuli");
                student.setSpeak("hello");
                List<String> phones = new ArrayList<String>();
                phones.add("15311496253");
                student.setPhone(phones);
                helloJsonList.add(student);

            }
            helloCons.setStudents(helloJsonList);

            Long stime_jpb_encode = System.currentTimeMillis();
            byte[] bytes = studentClassCodec.encode(helloCons);
            Long etime_jpb_encode = System.currentTimeMillis();
            System.out.println("jprotobuf序列化耗时："+ (etime_jpb_encode-stime_jpb_encode) + "ms;总大小："+bytes.length);
            Long stime_jpb_decode = System.currentTimeMillis();
            StudentClass studentdecode = studentClassCodec.decode(bytes);
            Long etime_jpb_decode = System.currentTimeMillis();
            System.out.println("jprotobuf反序列化耗时："+ (etime_jpb_decode-stime_jpb_decode) + "ms");


        } catch (Exception e){

            int i = 0;
        }
    }
}
