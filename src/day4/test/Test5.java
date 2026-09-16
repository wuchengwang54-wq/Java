package day4.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        //创建一个集合，用来存入三个对象
        ArrayList<User> list = new ArrayList<>();

        //创建三个用户对象
        User u1 = new User("北京", "张三", "2210");
        User u2 = new User("上海", "李四", "2211");
        User u3 = new User("广州", "王五", "2212");

        //将三个对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("输入要找的人的id：");
        Scanner sc = new Scanner(System.in);
        String userId = sc.next();

        //定义一个方法来查找id对应的用户
        boolean result = findUser(userId, list);
        System.out.println(result);
    }

    public static boolean findUser(String str, ArrayList<User> list){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            if(str.equals(list.get(i).getId())){
                return true;
            }
        }

        return false;

    }

}
