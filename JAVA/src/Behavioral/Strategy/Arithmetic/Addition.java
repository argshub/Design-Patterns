/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Strategy.Arithmetic;

/**
 *
 * @author argshub
 */
public class Addition implements NumericArithmetic {
    
    
    @Override
    public int compute(int x, int y) {
        return x + y;
    }
}
