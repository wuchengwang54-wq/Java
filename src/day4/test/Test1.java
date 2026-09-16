package day4.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("点赞");
        list.add("收藏");
        list.add("投币");
        list.add("转发");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.println(list.get(i));
            } else {
                System.out.println(list.get(i) + ", ");
            }
        }
    }
}
