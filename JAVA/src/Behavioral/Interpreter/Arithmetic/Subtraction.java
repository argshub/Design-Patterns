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
public class Subtraction extends NumericArithmetic {
    
    public Subtraction(int x, int y) {
        super(x, y);
    }
    
    
    @Override
    public int interpret() {
        return super.x - super.y;
    }
}
