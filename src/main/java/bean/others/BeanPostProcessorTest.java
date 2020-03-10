package bean.others;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试bean的后置处理器,可以添加多个会一一执行，在一个Bean创建完后，指定一个初始化方法，在这个初始化方法前后执行
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before " + beanName + " Initialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After " + beanName + " Initialization");
        return bean;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean_post_processor_bean.xml");

        //System.out.println(classPathXmlApplicationContext.getBean("student"));
    }
}
