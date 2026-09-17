package day5.Static.a01staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //定义一个参照物
        int max = list.get(0).getAge();

        //循环遍历集合
        for (int i = 1; i < list.size(); i++) {
            //i索引 list.get(i)元素/学生对象  我们还需要getAge获取到年龄之后在进行比较
            int age = list.get(i).getAge();
            if(age > max){
                max = age;
            }
        }
        return max;
    }
}
