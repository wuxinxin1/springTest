package model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student {

    public Student() {
        System.out.println("实例化Student");
    }

    //测试beanPostProcessor
    public void initMethod(){
        System.out.println("Student initMethod");
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
