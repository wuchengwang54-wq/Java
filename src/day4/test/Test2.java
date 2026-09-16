package day4.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();//这里不能写int类型，必须写int对应的包装类Integer

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

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
