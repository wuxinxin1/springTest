package bean.others;

import model.AutoWareBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinxin
 *
 *  测试bean的depend-on属性
 *
 *  1.使用dependentBeanMap用来存储依赖关系
 */
public class AutoWareTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("auto_ware_bean.xml");

        Object autoWare = classPathXmlApplicationContext.getBean("autoWare");

        System.out.println(autoWare);

        System.out.println(((AutoWareBean)autoWare).getAccount());
    }
}
