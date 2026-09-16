package day4.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //键盘录入学生的信息并添加到集合当中
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入学生姓名；");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();

            //将姓名和年龄赋值到学生中
            s.setName(name);
            s.setAge(age);

            //把学生对象加入到集合当中
            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
