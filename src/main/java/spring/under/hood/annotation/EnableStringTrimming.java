package spring.under.hood.annotation;


import org.springframework.context.annotation.Import;
import spring.under.hood.util.StringTrimmingConfiguration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(StringTrimmingConfiguration.class)
public @interface EnableStringTrimming {
}
