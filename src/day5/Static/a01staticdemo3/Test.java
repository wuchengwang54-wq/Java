package day5.Static.a01staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        //创建一个和用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();
        //创建三个学生对象
        Student u1 = new Student("张三", 18, "男");
        Student u2 = new Student("李四", 19, "男");
        Student u3 = new Student("王五", 20, "女");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
