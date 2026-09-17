package day6.Extends.test1;

public class Test {
    public static void main(String[] args){
        //创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.eat();;
        rd.drink();
        rd.catchMouse();

        //创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();

    }
}
