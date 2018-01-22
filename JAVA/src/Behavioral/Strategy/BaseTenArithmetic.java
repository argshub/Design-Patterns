/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Strategy;
import Behavioral.Strategy.Arithmetic.NumericArithmetic;
import Behavioral.Strategy.Exceptions.StrategyNotSetException;
/**
 *
 * @author argshub
 */
public class BaseTenArithmetic {
   
    private NumericArithmetic arithmetic;
    
    public BaseTenArithmetic() {
        this.arithmetic = null;
    }
    
    public void setStrategy(NumericArithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }
    
    public void compute(int x, int y) throws StrategyNotSetException {
        if(this.arithmetic == null) throw new StrategyNotSetException("Strategy Not Set");
        int result;
        result = this.arithmetic.compute(x, y);
        System.out.println("Result: " + result);
    }
}
