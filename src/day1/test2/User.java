package day1.test2;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User() {
    }
    //带全部参数

    public User(String username, String password, String email, String gender, int age) {
        this.username = password;
        this.password = username;
        this.email = email;
        this.age = age;
    }


    //get和set方法
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

}
