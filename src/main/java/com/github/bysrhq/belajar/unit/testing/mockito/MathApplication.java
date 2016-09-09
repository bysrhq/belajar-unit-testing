/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.unit.testing.mockito;

/**
 *
 * @author bysrhq
 */
public class MathApplication {
    private CalculatorService calcService;

    public void setCalcService(CalculatorService calcService) {
        this.calcService = calcService;
    }
    
    public double add(double operandOne, double operandTwo) {
//        return calcService.add(operandOne, operandTwo);
        return operandOne + operandTwo;
    }
}
