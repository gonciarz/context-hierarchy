package com.foo;

import com.foo.commons.BaseTest;
import com.foo.commons.TestMetricsConfig;
import com.foo.components.Metrics;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.util.Assert;

@ContextHierarchy({
        @ContextConfiguration(name = "metrics", classes = {TestMetricsConfig.class})
})
public class MetricsAlternativeTest extends BaseTest {

    @Autowired
    public Metrics metrics;

    @Test
    public void testMetrics() {
        Assert.notNull(metrics);
        System.out.println(metrics.getInterval());
    }

}
