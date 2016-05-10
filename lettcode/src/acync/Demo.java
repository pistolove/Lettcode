package acync;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        ConcreateWapper wapper = new ConcreateWapper();
        
        Map rq = new HashMap();
        rq.put(new UserRequest(), new UserResponse().getClass());
        wapper.setParams(UserEnum.ADD, null, rq);
        wapper.setParams(UserEnum.DELETE, null, rq);
        wapper.setParams(UserEnum.UPDATE, null, rq);
        
        FutureTpDao ft = new FutureTpDao();
        Map<IEnum, Object> userData = ft.getHttpData(wapper);
        
        UserResponse response = (UserResponse) userData.get(UserEnum.ADD);
        
        System.err.println(response);
    }
}
