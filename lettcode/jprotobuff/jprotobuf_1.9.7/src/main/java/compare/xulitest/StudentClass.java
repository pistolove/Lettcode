package compare.xulitest;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/20
 * Time: 下午6:30
 */
public class StudentClass {
    @Protobuf(fieldType = FieldType.OBJECT,required = false,order = 1)
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
