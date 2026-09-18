package day7.test1;

public class EmployeeTest {
    public static void main(String[] args){
        Manager m = new Manager("wuchengwang", "张三", 15000, 8000);
        System.out.println(m.getId() + m.getName() + m.getSalary() + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("menghuang");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + c.getName() + c.getSalary());
        c.work();
        c.eat();
    }
}
