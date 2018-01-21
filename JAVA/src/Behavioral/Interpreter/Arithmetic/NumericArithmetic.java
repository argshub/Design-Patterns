/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Interpreter.Arithmetic;

/**
 *
 * @author argshub
 */
public abstract class NumericArithmetic {
    
    protected int x, y;
    
    protected NumericArithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public int interpret();
}
