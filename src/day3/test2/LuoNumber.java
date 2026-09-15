package day3.test2;

import java.util.Scanner;

public class LuoNumber {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);


        //判断录入字符串是否符合要求
        while (true) {
            String str = sc.next();
            if (str.length() > 9) {
                System.out.println("输入字符串错误");
            } else if (juedgestr(str)) {

                //遍历字符串，拿出来字符串中每一个数字
                String result = "";

                for(int i = 0; i < str.length(); i++){

                    result = result + numToLuo(str.charAt(i)) + "-" + str.charAt(i) + " ";

                }
                System.out.println(result);

            } else {
                System.out.println("输入字符串错误");
            }
        }


    }

    public static boolean juedgestr(String str) {
        //遍历字符串，判断每个字符是否为数字
        boolean temp = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            } else {
                temp = false;
            }
        }

        return temp;
    }

    public static String numToLuo(char s){
        int num = (int)(s - '0');
        String[] str = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};
        return str[num];
    }

}
