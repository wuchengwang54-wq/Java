package day5.Static.a01staticdemo2;

public class TestDemo {
    public static void main(String[] args){
        //测试工具类中的两个方法是否正确
        int [] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5, 3.7, 2.2, 3.2};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);


    }
}
