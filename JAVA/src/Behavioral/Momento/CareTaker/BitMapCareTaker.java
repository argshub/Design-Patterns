/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Memento.CareTaker;
import Behavioral.Memento.Moments.Momento;
import java.util.Stack;
/**
 *
 * @author argshub
 */
public class BitMapCareTaker {
    
    private Stack<Momento> stack;
    
    public BitMapCareTaker() {
        this.stack = new Stack();
    }
    
    public void setMomento(Momento momento) {
        stack.push(momento);
    }
    
    public Momento getMomento() {
        return stack.pop();
    }
    
}
