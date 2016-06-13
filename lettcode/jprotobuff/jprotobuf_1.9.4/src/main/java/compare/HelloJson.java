package compare;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/1/25
 * Time: 上午9:44
 */
public class HelloJson implements Serializable{
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
