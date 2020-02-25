package bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 * 创建bean的源码分析
 *
 *  1.创建单例实例
 *
 *    创建的流程
 *
 *    a.先去缓存中获取对应BeanName的单例对象
 *    b.添加这个bean为创建中的bean---singletonsCurrentlyInCreation
 *    c.通过BeanFactory，也就是工厂去创建这个bean
 *    d.bean被创建成功，将这个Bean对应的创建的创建中映射移除---singletonsCurrentlyInCreation
 *    e.加入到单例缓存中(singletonObjects)，从提前传入的缓存中移除(earlySingletonObjects)，添加已经注册的BeanName(registeredSingletons)
 *
 *    创建的具体过程
 *
 *    a.
 */
public class CreateBeanTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("get_bean.xml");

        Object user = classPathXmlApplicationContext.getBean("user");

        System.out.println(user);
    }

}
