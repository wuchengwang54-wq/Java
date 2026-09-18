package day8.polymorphism.demo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    //行为
//    public void KeepPet(Dog dog, String sth){
//        System.out.println("年龄为"+age+"岁的老"+name+"了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
//        dog.eat(sth);
//    }
//
//    public void KeepCat(Cat cat, String sth){
//        System.out.println("年龄为"+age+"岁的老"+name+"了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的狗");
//        cat.eat(sth);
//    }

    public void KeepPet(Animal a, String sth) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的老" + name + "了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
            d.eat(sth);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的老" + name + "了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的狗");
            c.eat(sth);
        } else {
            System.out.println("没有这种动物");
        }
    }

}
