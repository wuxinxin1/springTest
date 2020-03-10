package bean.others;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试循环依赖
 */
public class CircularDependency {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("circular_dependency_bean.xml");

        Object father = classPathXmlApplicationContext.getBean("father");

        Object mother = classPathXmlApplicationContext.getBean("mother");
    }
}
