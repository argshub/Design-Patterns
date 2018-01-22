/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Strategy.BaseTenArithmetic;
import Behavioral.Strategy.Arithmetic.*;
import Behavioral.Strategy.Exceptions.StrategyNotSetException;
/**
 *
 * @author argshub
 */
public class StrategyTest {
    
    
    
    public static void main(String arg[]) {
        try {
            BaseTenArithmetic baseTen = new BaseTenArithmetic();
            baseTen.setStrategy(new Addition());
            baseTen.compute(10, 10);
            
            baseTen.setStrategy(new Subtraction());
            baseTen.compute(10, 10);
            
            baseTen.setStrategy(new Multiplication());
            baseTen.compute(10, 10);
            
            baseTen.setStrategy(new Division());
            baseTen.compute(10, 10);
        } catch(StrategyNotSetException excep) {
            System.out.println(excep.getMessage());
        }
    }
}
