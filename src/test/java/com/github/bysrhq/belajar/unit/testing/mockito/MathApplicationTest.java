/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author bysrhq
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
    @InjectMocks
    private MathApplication mathApplication;
    @Mock
    private CalculatorService calcService;
    
    @Test
    public void addTest() {
        Mockito.when(calcService.add(10.0, 20.0)).thenReturn(30.0);
        
        Assert.assertEquals(30.0, mathApplication.add(10.0, 20.0), 0);

        Mockito.verify(calcService).add(10.0, 20.0);
        
    }
}
