package bean.aop;

import model.aop.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 * ProxyFactoryBean方式配置生成代理
 *
 * 1.ProxyFactoryBean实际上是一个BeanFactory类型，和其他BeanFactory没什么两样
 * 2.通过BeanFactory创建的bean都是独立存储的，存在容器的factoryBeanObjectCache 而不是像普通的bean一样存在singletonObjects
 * 2.ProxyFactoryBean只不过这个BeanFactory的getObject实现是去创建一个代理对象
 * 3
 */
public class AopTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/aop_bean.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("proxyFactoryBean");


        userService.createUser("aa");

        userService.queryUser();

    }
}
