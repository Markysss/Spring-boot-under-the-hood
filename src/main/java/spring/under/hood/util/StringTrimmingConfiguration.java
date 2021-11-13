package spring.under.hood.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.under.hood.annotation.impl.TrimmedAnnotationBeanPostProcessor;

@Configuration
public class StringTrimmingConfiguration {

    @Bean
    public TrimmedAnnotationBeanPostProcessor trimmedAnnotationBeanPostProcessor() {
        return new TrimmedAnnotationBeanPostProcessor();
    }
}
