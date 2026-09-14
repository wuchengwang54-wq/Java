package day1.String;

import java.util.Scanner;

public class Stringdemo2 {
    public static void main(String[] args) {
        //定义两个变量记录正确的用户名和密码
        String rightUername = "zhangsan";
        String rightPassword = "123456";

        //2.键盘录入用户名和密码

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入用户密码");
            String userPassword = sc.next();

            //比较
            if (userName.equals(rightUername) && userPassword.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                System.out.println("用户登录失败");
            }
        }
    }
}
