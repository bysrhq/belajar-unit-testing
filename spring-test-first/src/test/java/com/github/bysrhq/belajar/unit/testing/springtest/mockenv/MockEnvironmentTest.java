/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.springtest.mockenv;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author bysrhq
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MockAppConfig.class)
@TestPropertySource({"classpath:com/github/bysrhq/belajar/unit/testing/springtest/mockenv/mockenvironmenttest.properties"})
@ActiveProfiles("test")
public class MockEnvironmentTest {
    @Autowired
    Environment env;
    
    @Test
    public void verifyProperty() {
        System.out.print(env.getProperty("love.name"));
        System.out.print("----------------------------------------");
    }
    
}
