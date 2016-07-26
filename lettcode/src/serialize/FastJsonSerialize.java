package serialize;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FastJsonSerialize {

    
    
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
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
        
        //序列化  
        Long t1 = System.currentTimeMillis();
        String text = JSON.toJSONString(friends);  
        System.out.println("fastJson serialize: " +(System.currentTimeMillis() - t1) + "ms; 总大小：" + text.getBytes().length);
        
        //反序列化  
//        User ins1 = JSON.parseObject(text, User.class);
        
    }
}
