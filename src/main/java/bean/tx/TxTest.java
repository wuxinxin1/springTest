package bean.tx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("tx/TxTest.xml");

        LoginService bean = classPathXmlApplicationContext.getBean(LoginService.class);

        bean.login("root","123456");

        try {
            bean.modifyPassword("root","567");
        }catch (Exception e){
            System.out.println("抛出异常:"+e.getMessage());
        }

        bean.login("root","123456");

        System.out.println(bean);
    }

}
