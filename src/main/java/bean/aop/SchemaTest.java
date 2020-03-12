package bean.aop;

import model.aop.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 * 注解方式使用spring aop
 *
 */
public class SchemaTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/schmaTest.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");

        userService.createUser("aa");

        userService.queryUser();
    }

}
