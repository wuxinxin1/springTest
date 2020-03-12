package bean.aop;

import model.aop.OrderService;
import model.aop.UserService;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 * 注解方式使用spring aop
 *
 */
public class AspectjTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/AspectjTest.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");

        userService.createUser("aa");

        userService.queryUser();
    }

}
