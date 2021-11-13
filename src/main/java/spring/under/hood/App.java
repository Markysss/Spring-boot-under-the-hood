package spring.under.hood;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.under.hood.config.RootConfiguration;
import spring.under.hood.service.EveningService;
import spring.under.hood.service.EveningServiceImpl;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(RootConfiguration.class);
        var eveningService = context.getBean("eveningService", EveningService.class);
        eveningService.doCall();
        eveningService.doProcessData();

    }
}
