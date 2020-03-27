package bean.anno.importAnno;

import bean.anno.Red;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wuxinxin
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({Red.class,ColorConfigration.class,ColorImportSelector.class,ColorImportBeanDefinitionRegistrar.class})
public @interface EnableColor {
}
