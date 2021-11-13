package spring.under.hood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.under.hood.annotation.EnableStringTrimming;
import spring.under.hood.service.EveningServiceImpl;

@Configuration
@EnableStringTrimming
public class RootConfiguration {

    @Bean
    public EveningServiceImpl eveningService() {
        return new EveningServiceImpl();
    }
}
