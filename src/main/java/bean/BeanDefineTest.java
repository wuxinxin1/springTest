package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *  bean的xml解析为 BeanDefine中，各个字段的含义对应到标签中
 *
 *
 */
public class BeanDefineTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean_define_bean.xml");

        Object user = classPathXmlApplicationContext.getBean("account");

        System.out.println(user);

        classPathXmlApplicationContext.destroy();
    }

}
