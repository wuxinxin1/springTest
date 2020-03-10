package model;

public class Account {

    private AutoWareBean autoWareBean;

    public Account(AutoWareBean autoWareBean) {
        this.autoWareBean = autoWareBean;
    }

    public Account() {
        System.out.println("初始化account");
    }

    private void ini() {
        System.out.println("ini===account");
    }

    private void des() {
        System.out.println("des===account");
    }
}
