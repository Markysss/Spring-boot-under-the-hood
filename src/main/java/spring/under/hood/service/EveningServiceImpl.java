package spring.under.hood.service;

import org.springframework.stereotype.Service;
import spring.under.hood.annotation.Trimming;

import javax.annotation.PostConstruct;

@Trimming
@Service
public class EveningServiceImpl implements EveningService {

    public String url;

    @Override
    @PostConstruct
    public String doCall() {
        return "calling...";
    }

    @Override
    public String doProcessData() {
        return "process...";
    }
}
