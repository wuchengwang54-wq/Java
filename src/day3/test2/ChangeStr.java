package day3.test2;

public class ChangeStr {
    public static void main(String[] args){
        String strA = "abcde";
        String strB = "cdeab";

        //旋转字符串
        strA = rotate(strA);

        //运行方法进行比较
        boolean result = check(strA, strB);

        //输出
        System.out.println(result);
    }

    public static String rotate(String str){
        //获取子左侧的那个字符
        char first = str.charAt(0);
        //获取剩余的字符串
        String end = str.substring(1);

        return end + first;
    }

    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

}
