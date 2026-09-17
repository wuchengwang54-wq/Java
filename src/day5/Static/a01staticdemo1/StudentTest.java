package day5.Static.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args){
        //新增：老师的姓名
        Student.teacherName = "阿伟老师";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");


        s1.study();
        s1.show();

        Student s2 = new Student();
        s1.setName("李四");
        s1.setAge(22);
        s1.setGender("女");

        s2.study();
        s2.show();
    }
}
