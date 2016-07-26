package serialize;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialize {
    public static void start() throws JsonProcessingException {
        User u = new User();
        List<User> friends = new ArrayList<>();
        u.setUserName("张三");
        u.setPassWord("123456");
        u.setUserInfo("张三是一个很牛逼的人");
        u.setFriends(friends);

        User f1 = new User();
        f1.setUserName("李四");
        f1.setPassWord("123456");
        f1.setUserInfo("李四是一个很牛逼的人");

        User f2 = new User();
        f2.setUserName("王五");
        f2.setPassWord("123456");
        f2.setUserInfo("王五是一个很牛逼的人");

        friends.add(f1);
        friends.add(f2);
        
        Long t1 = System.currentTimeMillis();
        ObjectMapper mapper = new ObjectMapper();
        byte[] writeValueAsBytes = mapper.writeValueAsBytes(u);
        System.out.println("json deserialize: " + (System.currentTimeMillis() - t1) + "ms;总大小：" + writeValueAsBytes.length);
    }
}
