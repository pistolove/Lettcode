package test;


import com.api.login.LoginMessage;
import com.api.tutorial.AddressBookProtos.AddressBook;
import com.api.tutorial.AddressBookProtos.Person;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：15/12/18
 * Time: 下午3:21
 */
public class testpb {
    public static void main(String[] args) {

        try{
            /**三种文件级别的区别测试**/
            //SPEED
            com.api.login.LoginMessage.MyMessage.Builder messageBuilder = com.api.login.LoginMessage.MyMessage.newBuilder();
            messageBuilder.setId(10);
//            messageBuilder.setPasswd("password");
//            messageBuilder.addRanks(1);
//            messageBuilder.addRanks(2);
//            messageBuilder.addRanks(3);
            LoginMessage.MyMessage myMessage = messageBuilder.build();
            Long stime1 = System.currentTimeMillis();
            byte[] messageBuf = myMessage.toByteArray();
            //[8,10,18,8,112,97,115,115,119,111,114,100]
            //[8,-106,1,18,8,112,97,115,115,119,111,114,100]
            //8=00001000
            //18=00010010
            //00001000
            //[8,10,18,8,112,97,115,115,119,111,114,100,24,1,24,2,24,3]
            //[8,10,18,8,112,97,115,115,119,111,114,100,26,3,1,2,3]
            Long etime1 = System.currentTimeMillis();
            System.out.println("myMessage 11 encode time:" + (etime1-stime1) + "ms");
//            System.out.println("result buf 11:"+new String(messageBuf));
            System.out.println("SPEED MyMessage data string:" + myMessage.toString());

//            LoginMessage.MyMessage my = LoginMessage.MyMessage.parseFrom(messageBuf);
            //LITE_RUNTIME
            com.api.login2.LoginMessage.MyMessage.Builder messageBuilder2 = com.api.login2.LoginMessage.MyMessage.newBuilder();
            messageBuilder2.setId(10);
            messageBuilder2.setPasswd("password");
            com.api.login2.LoginMessage.MyMessage myMessage2 = messageBuilder2.build();
            Long stime2 = System.currentTimeMillis();
            byte[] messageBuf2 = myMessage2.toByteArray();
            Long etime2 = System.currentTimeMillis();
            System.out.println("myMessage 22 encode time:" + (etime2-stime2) + "ms");
//            System.out.println("result buf 22:"+new String(messageBuf2));
            System.out.println("LITE_RUNTIME myMessage2 data string:" + myMessage2.toString());
//
//            //CODE_SIZE
            com.api.login3.LoginMessage.MyMessage.Builder messageBuilder3 = com.api.login3.LoginMessage.MyMessage.newBuilder();
            messageBuilder3.setId(10);
            messageBuilder3.setPasswd("password");
            com.api.login3.LoginMessage.MyMessage myMessage3 = messageBuilder3.build();
            Long stime3 = System.currentTimeMillis();
            byte[] messageBuf3 = myMessage3.toByteArray();
            Long etime3 = System.currentTimeMillis();
            System.out.println("myMessage 33 encode time:" + (etime3-stime3) + "ms");
//            System.out.println("result buf 33:"+new String(messageBuf3));
            System.out.println("CODE_SIZE myMessage3 data string:" + myMessage3.toString());

            /***简单扩展类**/
//            MyFoo.Foo.Builder fooBuilder = MyFoo.Foo.newBuilder();
//            fooBuilder.setField1(12);
//            fooBuilder.setExtension(MyFoo.bar, 20);
//            fooBuilder.setExtension(MyFoo.str,"sssss");
//            MyFoo.Foo foo = fooBuilder.build();
//            byte[] fooByte = foo.toByteArray();
//            System.out.println("result buf fooBuilder:"+new String(fooByte));
//
//            ExtensionRegistry registry = ExtensionRegistry.newInstance();
//            MyFoo.registerAllExtensions(registry);
//            MyFoo.Foo foo2 = MyFoo.Foo.parseFrom(fooByte, registry);
//            int i = foo2.getField1();
//            int bar = foo2.getExtension(MyFoo.bar);
//            String str = foo2.getExtension(MyFoo.str);
//            System.out.println("foo decode data:field1="+i+";bar="+bar+";str="+str);

            /**嵌套类*/
            AddressBook.Builder addressBuilder = AddressBook.newBuilder();
            Person.Builder personBuilder = Person.newBuilder();
            personBuilder.setName("abc");
            personBuilder.setId(1);
//            personBuilder.setEmail("tom123@163.com");
//            Person.PhoneNumber.Builder phoneNumberBuilder = Person.PhoneNumber.newBuilder();
//            phoneNumberBuilder.setNumber("1");
//            phoneNumberBuilder.setType(Person.PhoneType.MOBILE);
//            Person.PhoneNumber phoneNumber = phoneNumberBuilder.build();
//            personBuilder.addPhone(phoneNumber);
//            personBuilder.addPhone(phoneNumber);
            Person person = personBuilder.build();
            addressBuilder.addPerson(person);

            AddressBook bookEncode = addressBuilder.build();
            byte[] buf = bookEncode.toByteArray();
            //[10,21,10,3,116,111,109,16,1,34,5,10,1,49,16,0,34,5,10,1,49,16,0]
            //[10,7,10,3,116,111,109,16,1]
            //[10,7,10,3,97,98,99,16,1]
//            System.out.println("result buf:"+new String(buf));
//            System.out.println("AddressBook data string:" + bookEncode.toString());

            AddressBook bookDecode = AddressBook.parseFrom(buf);


        } catch (Exception e){

        }
    }
}
