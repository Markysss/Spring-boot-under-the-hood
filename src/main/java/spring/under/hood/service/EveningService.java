package spring.under.hood.service;

import javax.annotation.PostConstruct;

public interface EveningService {
    @PostConstruct
    String doCall();

    String doProcessData();
}
