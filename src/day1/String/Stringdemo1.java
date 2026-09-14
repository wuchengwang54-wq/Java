package day1.String;

public class Stringdemo1 {
    public static void main(String[] args){
        //创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "abc";

        System.out.println(s1 == s2);

        //比较字符串对象中的内容是否相等
        boolean res1 = s1.equals(s2);
        System.out.println(res1);

        //比较字符串对象中的内容是否相等，忽略大小写
        boolean res2 = s1.equalsIgnoreCase(s2);
        System.out.println(res2);
    }
}
