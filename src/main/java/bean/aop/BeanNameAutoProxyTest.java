package bean.aop;

import model.aop.OrderService;
import model.aop.UserService;
import model.aop.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 * BeanNameAutoProxy 方式配置生成代理，匹配beanName自动生成代理
 *
 */
public class BeanNameAutoProxyTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/BeanNameAutoProxyTest.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");

        OrderService orderService = (OrderService)classPathXmlApplicationContext.getBean("orderService");

        userService.createUser("aa");

        userService.queryUser();



        orderService.createOrder("bb");
        orderService.queryOrder();

    }
}
