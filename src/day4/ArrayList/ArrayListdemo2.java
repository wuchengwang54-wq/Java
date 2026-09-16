package day4.ArrayList;

import java.util.ArrayList;

public class ArrayListdemo2 {
    public static void main(String[] args){

        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //删除元素
//        boolean result = list.remove("aaa");
//        System.out.println(result);
//        System.out.println(list);

//        String str = list.remove(3);//会返回原集合中索引为3的字符串
//        System.out.println(str);
//        System.out.println(list);

        //修改元素
        String result = list.set(1, "ddd");//返回被覆盖的元素
        System.out.println(result);
        System.out.println(list);

        //查询元素
        String s = list.get(2);
        System.out.println(s);

        //遍历
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
