/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author bysrhq
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@TestExecutionListeners({SysOutTextExecutionListener.class})
public class SystOutTextExecutionTest {
    
    @Test
    public void someTest() {
        System.out.println("Execute some test.");
    }
    
    @Test
    public void someOtherTest() {
    System.out.println("Execute some other test.");
    }
    
}
