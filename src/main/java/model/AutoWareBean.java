package model;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 测试属性注入
 */
public class AutoWareBean {

    public AutoWareBean(int p1, String p2,Account account) {
        this.p1 = p1;
        this.p2 = p2;
        this.account=account;
    }

    public AutoWareBean(int p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private int p1;

    private String p2;

    private Account account;

    public void init(){
        System.out.println("AutoWareBean init");
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "AutoWareBean{" +
                "p1=" + p1 +
                ", p2='" + p2 + '\'' +
                ", account=" + account +
                '}';
    }
}
