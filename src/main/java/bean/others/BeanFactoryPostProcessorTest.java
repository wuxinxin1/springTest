package bean.others;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试 BeanFactoryPostProcessor
 *
 *  我们看到BeanFactoryPostProcessor很明显是容器在将注册完所有的Bean以后可以对我们的容器做一些修改
 *
 *
 *  这里的BeanFactory指的就是 DefaultListableBeanFactory
 */
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessorTest: BeanFactoryPostProcessor的作用就是在容器初始化后，对容器最最后的后置(修改)处理 ");

        BeanDefinition welcome = beanFactory.getBeanDefinition("welcome");

        welcome.getPropertyValues().add("name","liujing");
    }

    public static void main(String[] args) {
       // ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean_factory_post_processor_bean.xml");



        //beanFactory其实在实例化前很多东西还是要先依赖ApplicationContext(上下文真正含义)的，所以很多特性可以先设置好，再去手动refresh来启动容器，比如BeanFactoryPostProcessor
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();

        classPathXmlApplicationContext.setConfigLocation("bean_factory_post_processor_bean.xml");

        classPathXmlApplicationContext.addBeanFactoryPostProcessor(new BeanFactoryPostProcessor() {
            public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
                System.out.println("直接添加在上下文中的BeanFactoryPostProcessor");
            }
        });

        classPathXmlApplicationContext.refresh();
    }
}
