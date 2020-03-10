package model;

public class User {

    public User() {
        System.out.println("实例化User");
    }

    //测试beanPostProcessor
    public void initMethod(){
        System.out.println("User initMethod");
    }

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
