package bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试getBean流程梳理
 * 1.ClassPathXmlApplicationContext作为一个上下文，会先去获取BeanFactory对象
 * 2.获取到{@link org.springframework.beans.factory.support.DefaultListableBeanFactory}，
 *   然后会调用DefaultListableBeanFactory的getBean,也就是真正获取bean还是去BeanFactory中获取
 * 3.getBean的执行逻辑
 *   a.将name转换为BeanName
 *     1.将存在&的name去除&前缀
 *     2.查看是否存在别名的情况，查看是不是这个name只是一个别名，到aliMap中获取真的BeanName
 *   b.从容器缓存中根据beanName获取当这个Bean,很明显第一次是获取不到的（懒加载机制）
 *     1.在获取bean的时候有解决循环依赖问题，
 *       循环依赖就是A对象创建的时候依赖B，B实例化也依赖A，那么在实例化B的时候因为A已经在创建中，直接引用创建中的A实例化完之后，继续实例化
 *      2.singletonObjects用于存放完全实例化好的对象，earlySingletonObjects用于存放还在创建中的对象，用于解决循环依赖
 *
 *   c.处理单例的循环依赖问题，多例无法处理
 *   d.到父容器根据beanName查找这个Bean
 *   e.合并子容器和父容器的bean的定义信息
 *     1.因为标签是支持parent属性，指定一个标签bean定义的信息，那么是完全继承他的属性，可以进行覆盖
 *   f.检查是否有依赖注入，有的话要先初始化依赖的Bean
 *   g.创建不同类型的Bean,单例或者多例
 * @author wuxinxin
 */
public class GetBeanest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("get_bean.xml");

        Object user = classPathXmlApplicationContext.getBean("user");

        Object user_child = classPathXmlApplicationContext.getBean("user-child");

        Object user1 = classPathXmlApplicationContext.getBean("userFactory");

        Object userFactory = classPathXmlApplicationContext.getBean("&userFactory");

        System.out.println(user);

        System.out.println(user_child);

        System.out.println(user1);

        System.out.println(userFactory);
    }

}
