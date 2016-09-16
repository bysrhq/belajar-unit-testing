/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.springtest.mockenv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 *
 * @author bysrhq
 */
@Configuration
@PropertySource({"classpath:com/github/bysrhq/belajar/unit/testing/springtest/mockenv/mockenvironment.properties"})
public class MockAppConfig {
    @Autowired
    private Environment environment;
    
    @Bean(name = "message")
    @Profile("prod")
    public String getMessage() {
        return environment.getProperty("love.name");
    }
    
}
