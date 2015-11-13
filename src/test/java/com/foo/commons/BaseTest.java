package com.foo.commons;

import com.foo.commons.conifg.TestAppConfig;
import com.foo.components.config.Df;
import com.foo.components.config.MetricsConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
        @ContextConfiguration(name = "common", classes = {TestAppConfig.class}),
        @ContextConfiguration(name = "metrics", classes = {MetricsConfig.class}),
        @ContextConfiguration(name = "persistenceService", classes = {Df.class}),
})
public abstract class BaseTest {

    @Autowired
    protected ApplicationContext context;

}
