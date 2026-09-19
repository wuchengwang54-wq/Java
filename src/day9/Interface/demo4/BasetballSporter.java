package day9.Interface.demo4;

public class BasetballSporter extends Sporter{

    public BasetballSporter() {
    }

    public BasetballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
