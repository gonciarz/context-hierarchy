package com.foo.components;

public interface PersistenceService {

    void upsert(String json);
    void insert(String json);
    void select(String json);
    void drop();

}
