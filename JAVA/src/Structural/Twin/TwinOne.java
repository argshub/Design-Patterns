/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.Twin;

/**
 *
 * @author argshub
 */
public class TwinOne extends ParentOne {
    
    private TwinTwo twin;
    
    public TwinOne() {
        twin = new TwinTwo();
    }
    
    public void methodThree() {
        twin.methodThree();
    }
    
}
