package day8.Final;

//final修饰的变量起名字都要大写
//核心：常量记录的数据是不能改变的

public class Test {
    public static void main(String[] args){
        /*final修饰方法：
            表明该方法是最终方法，不能被重写
        final修饰类：
            表明该类是最终类，不能被继承
        final修饰变量：
            叫做常量，只能被赋值一次*/

//        final int a = 10;//这里的a不能被修改
//        System.out.println(a);//10
//        //a = 2;

        final double PI = 3.14;

        //创建对象
        //final修饰的引用数据类型：记录的地址值不能改变，内部的属性值还是可以改变的
        final Student S = new Student("张三", 23);
        S.setName("李四");
        S.setAge(18);


        //数组
        final int[] ARR = {1, 2, 3, 4, 5};
        ARR[0] = 10;
        ARR[1] = 20;

        //遍历数组
        for(int i = 0; i < ARR.length; i++){
            System.out.println(ARR[i]);
        }
    }
    


    /*final class Fu{
        public final void show(){
            System.out.println("父类的show方法");
        }
    }*/

    /*class Zi extends Fu{
        //show//发现不能被重写
    }*/
}
