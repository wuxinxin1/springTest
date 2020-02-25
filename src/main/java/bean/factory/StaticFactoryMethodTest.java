package bean.factory;

import model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *   静态工厂方法
 *   @author wuxinxin
 *
 *   指定一个静态方法当做创建bean的静态方法,但是获取的就是单例对象
 */
public class StaticFactoryMethodTest {

    public static User getUser(){
        return new User();
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("factory_method_bean.xml");

        System.out.println(classPathXmlApplicationContext.getBean("staticFactoryMethod"));

        System.out.println(classPathXmlApplicationContext.getBean("staticFactoryMethod"));

        //System.out.println(classPathXmlApplicationContext.getBean("&staticFactoryMethod"));
    }

}
