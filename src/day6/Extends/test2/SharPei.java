package day6.Extends.test2;

public class SharPei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
