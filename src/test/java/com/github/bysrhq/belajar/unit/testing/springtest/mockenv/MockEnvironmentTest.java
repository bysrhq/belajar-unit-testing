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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author bysrhq
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MockAppConfig.class})
public class MockEnvironmentTest {
    @Autowired
    ApplicationContext ctx;
    
    @Test
    public void environment() {
        System.out.print(ctx.getBean("message"));
    }
}
