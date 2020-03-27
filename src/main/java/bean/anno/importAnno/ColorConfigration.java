package bean.anno.importAnno;

import bean.anno.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfigration {

    @Bean
    public Yellow yellow(){
        return new Yellow();
    }

}
