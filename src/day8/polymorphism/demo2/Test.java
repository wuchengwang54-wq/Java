package day8.polymorphism.demo2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog d = new Dog(2, "黑");
        p.KeepPet(d, "骨头");

    }
}

