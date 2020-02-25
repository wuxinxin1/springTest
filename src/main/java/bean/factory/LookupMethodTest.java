package bean.factory;

import model.Address;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试LookupMethod
 * 1.可以使单例的内部属性变为多例，直接注入容器，使用容器创建一个新的
 */
public class LookupMethodTest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Address address;

    public Address getAddress() {
        return applicationContext.getBean("address", Address.class);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("lookup_method_bean.xml");

        LookupMethodTest student = (LookupMethodTest)classPathXmlApplicationContext.getBean("lookupMethodTest");

        System.out.println(student);
        System.out.println(student.getAddress());

        System.out.println(student.getAddress());
    }
}
