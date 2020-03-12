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
 * 3.ProxyFactoryBean只不过这个BeanFactory的getObject实现是去创建一个代理对象
 * 4.ProxyFactoryBean是个单例工厂，所以只会创建一个指定类型的对象的代理对象；
 *   如果还需要别的对象的代理对象，那么还要再加入一个ProxyFactoryBean的工厂，然后创建别的类型的代理对象
 * 5.ProxyFactoryBean被生成的代理在创建就已经固定好了，每次调用不同的方法都会代理，是类级别的
 * 6.ProxyFactoryBean可以进行配置logArgsAdviceAdvisor里面的mappedNames来进行确认对哪些方法进行切入
 *
 */
public class ProxyFactoryBeanAopTest2 {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/ProxyFactoryBeanAopTest2.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userServiceProxy");


        userService.createUser("aa");

        userService.queryUser();
    }
}
