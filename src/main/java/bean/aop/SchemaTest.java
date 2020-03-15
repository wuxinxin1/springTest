package bean.aop;

import model.aop.UserService;
import org.aopalliance.aop.Advice;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 * 注解方式使用spring aop
 *
 *   1.根据标签<aop:pointcut/>会在容器中添加{@link org.springframework.aop.aspectj.AspectJExpressionPointcut}类型的PointCut的beanDefine
 *   2.标签 <aop:config>只是一个标志性的标签，标识这里面是aop的配置，里面子标签告诉他配置了什么pointCut和相关的{@link org.springframework.aop.Advisor}
 *   3.如果发现是aop的配置标签，那么会使用{@link org.springframework.aop.config.AopNamespaceHandler}进行解析标签
 *     a.首先直接添加一个BeanDefine,那么是什么类型的呢，就是创建代理对象的BeanDefine，AspectJAwareAdvisorAutoProxyCreator
 *     b.然后就是通过 <aop:aspect/> 里面配置的通知，会解析为不同的Advisor(AspectJPointcutAdvisor),Advisor里面会持有pointCut和advice
 */
public class SchemaTest {

    public static  void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop/schmaTest.xml");

        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");

        userService.createUser("aa");

    }

}
