package com.ashok.test.springIntro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "Production")
public class ProdDB implements  DB {
    public String getData() {
        return "Prod Data";
    }

}
