package compare.xulitest;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/2/20
 * Time: 下午6:31
 */
public class Student {
    @Protobuf(fieldType = FieldType.INT32,required = false,order = 1)
    private Integer id;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 2)
    private String name;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 3)
    private String speak;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 4)
    private List<String> phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
}
