package bean.factory;

import model.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *  测试 factoryBean
 * @author wuxinxin
 *
 *  使用factoryBean来创建bean ,可以控制单例还是多例
 */
public class FactoryBeanTest implements FactoryBean<Student> {

    public Student getObject() throws Exception {
        return new Student();
    }

    public Class<?> getObjectType() {
        return Student.class;
    }

    //控制单例还是多例
    public boolean isSingleton() {
        return true;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("factory_bean.xml");

        System.out.println(classPathXmlApplicationContext.getBean("factoryBean"));
       /* System.out.println(classPathXmlApplicationContext.getBean("factoryBean"));

        System.out.println(classPathXmlApplicationContext.getBean("factoryBean"));

        //这种方式，如果是单例，那么他的属性即使是多例，也还是单例---解决办法是lookup-method
        Student student = (Student)classPathXmlApplicationContext.getBean("student");

        System.out.println(student);
        System.out.println(student.getAddress());

        System.out.println(student.getAddress());*/

    }
}
