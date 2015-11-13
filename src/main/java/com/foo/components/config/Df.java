package com.foo.components.config;

import com.foo.components.PersistenceService;
import org.springframework.stereotype.Component;

@Component
public class Df implements PersistenceService {

    @Override
    public void upsert(String json) {
        System.out.println("upsert");
    }

    @Override
    public void insert(String json) {
        System.out.println("insert");
    }

    @Override
    public void select(String json) {
        System.out.println("select");
    }

    @Override
    public void drop() {
        System.out.println("drop");
    }
}
