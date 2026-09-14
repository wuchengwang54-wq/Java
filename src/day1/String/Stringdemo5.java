package day1.String;

import java.util.Scanner;

public class Stringdemo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String new_str = ChangeStr(str);
        System.out.println(new_str);
    }

    //定义一个方法
    public static String ChangeStr(String str){
        String reslut = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            //System.out.println(c);
            reslut = reslut + c;
        }

        return reslut;
    }
}
