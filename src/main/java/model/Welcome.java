package model;

public class Welcome {

    private int id;

    private String name;

    public Welcome() {
        System.out.println("Welcome 无参构造");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ini(){
        System.out.println("welcome 初始化");
    }

    @Override
    public String toString() {
        return "Welcome{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
