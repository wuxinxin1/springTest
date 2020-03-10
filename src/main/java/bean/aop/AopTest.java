package bean.aop;

import model.aop.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试bean的depend-on属性
 *
 *  1.使用dependentBeanMap用来存储依赖关系
 */
public class AopTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/aop_bean.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");


        userService.createUser("aa");

    }
}
