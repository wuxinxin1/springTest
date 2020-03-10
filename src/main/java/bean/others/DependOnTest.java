package bean.others;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试bean的depend-on属性
 *
 *  1.使用dependentBeanMap用来存储依赖关系
 */
public class DependOnTest{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("depend_on_bean.xml");
    }
}
