package com.foo.commons.conifg;


import com.foo.components.Transformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAppConfig {

    @Bean
    public Transformer getTransformer() {
        return new Transformer();
    }

}
