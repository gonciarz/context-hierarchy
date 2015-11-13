package com.foo;

import com.foo.commons.BaseTest;
import com.foo.commons.TestMetricsConfig;
import com.foo.commons.TestPersistenceService;
import com.foo.components.PersistenceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@ContextHierarchy({
        @ContextConfiguration(name = "metrics", classes = {TestMetricsConfig.class}),
        @ContextConfiguration(name = "persistenceService", classes = {ContextConfig.class}),
})
public class MockedLoadTest extends BaseTest {

    @Autowired
    public TestPersistenceService persistenceService;

    @Before
    public void setUp() {
        persistenceService.drop();
    }

    @Test
    public void testStorage() {
        persistenceService.insert("aaa");
        persistenceService.upsert("bbb");
        persistenceService.select("ccc");
        Assert.assertNotNull(persistenceService);
    }

}

@Configuration
class ContextConfig {

    @Bean
    PersistenceService getPersistenceService() {
        return new TestPersistenceService();
    }

}
