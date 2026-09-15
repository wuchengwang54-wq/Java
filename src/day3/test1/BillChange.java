package day3.test1;

import java.util.Scanner;

public class BillChange {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);

        int bill;

        //判断金额是否有效
        while (true) {
            System.out.println("请输入一个金额：");
            bill = sc.nextInt();
            if (bill >= 0 && bill <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        //将金额中的数子分离出来
        //定义一个变量，用来表示钱的大小
        String moneyStr = "";

        while (true) {
            int ge = bill % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            bill /= 10;

            if (bill == 0) {
                break;
            }
        }

        //3.在前面补零，补齐7位
        int count = 7 - moneyStr.length();

        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }

        System.out.println(result);

    }

    //定义一个方法把数字变为大写的中文
    public static String getCapitalNumber(int number) {
        //定义一个数组，让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        return arr[number];
    }

}


