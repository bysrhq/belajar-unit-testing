/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.springtest.tel;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

/**
 *
 * @author bysrhq
 */
public class SysOutTextExecutionListener implements TestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("In beforeTestClass for : " + testContext.getTestClass());
    }

    @Override
    public void prepareTestInstance(TestContext testContext) throws Exception {
        System.out.println("In prepareTestInstance : " + testContext.getTestInstance());
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("In beforeThestMethod : " + testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println("In afterTestMethod : " + testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        ApplicationContext ctx = testContext.getApplicationContext();
        
        System.out.println("In afterTestClass for class : " +testContext.getTestClass());
    }
    
}
