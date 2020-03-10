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
 *    a.解析bean的class类型，检查method overrides(lookup-method)是否存在方法重载,可以提前做好标记
 *    b.调用doCreateBean方法去创建Bean
 *      1.先从factoryBeanInstanceCache获取相关工厂  ？
 *      2.创建一个原始的bean，创建方式有三种（工厂，构造，无参），具体使用哪一种，取决于你bean的定义 还没有对参数进行填充
 *      3.为了解决循环依赖问题，而去做的一些操作，添加工厂对象到 singletonFactories 缓存中
 *      4.对创建的bean进行填充属性，使用bean加载到的定义信息
 *
 *
 *
 *
 */
public class CreateBeanTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("get_bean.xml");

        Object user = classPathXmlApplicationContext.getBean("user");

        System.out.println(user);
    }

}
