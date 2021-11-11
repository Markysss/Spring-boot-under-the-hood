package spring.under.hood;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(PolicemanImpl.class).sayWhereIWork();


    }
}
