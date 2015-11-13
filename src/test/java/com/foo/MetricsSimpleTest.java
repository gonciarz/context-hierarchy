package com.foo;


import com.foo.commons.BaseTest;
import com.foo.components.Metrics;
import com.foo.components.PersistenceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MetricsSimpleTest extends BaseTest {

    @Autowired
    public Metrics metrics;

    @Autowired
    public PersistenceService persistenceService;

    @Before
    public void setUp() {
        persistenceService.drop();
    }

    @Test
    public void testMetrics() {
        Assert.assertNotNull(metrics);
        System.out.println(metrics.getInterval());
    }


}
