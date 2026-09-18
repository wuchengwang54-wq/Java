package day8.polymorphism.demo2;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为

    @Override
    public void eat(String sth) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的小狗两只前腿死死的抱住" + sth + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
