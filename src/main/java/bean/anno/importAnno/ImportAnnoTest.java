package bean.anno.importAnno;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuxinxin
 *
 */
public class ImportAnnoTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        for(String s:beanDefinitionNames){
            System.out.println(s);
        }

    }

}



