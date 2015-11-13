package com.foo.commons;

import com.foo.components.PersistenceService;

public class TestPersistenceService implements PersistenceService {

    @Override
    public void upsert(String json) {
        System.out.println("test upsert");
    }

    @Override
    public void insert(String json) {
        System.out.println("test insert");
    }

    @Override
    public void select(String json) {
        System.out.println("test select");
    }

    @Override
    public void drop() {
        System.out.println("test drop");
    }
}
