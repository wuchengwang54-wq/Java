package day1.test1;

public class GrilFriendTest {
    public static void main(String[] args){
        //创建女朋友的对象
        GrilFriend gf1 = new GrilFriend();
        //赋值
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
