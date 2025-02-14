package com.ashok.test.springIntro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "Development")
public class DevDB implements  DB {

    public String getData() {
        return "Dev Data";
    }
}
