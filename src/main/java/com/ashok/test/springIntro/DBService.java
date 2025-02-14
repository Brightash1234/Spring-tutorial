package com.ashok.test.springIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    DB db;
    String getData() {
        return db.getData();
    }

}
