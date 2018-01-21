/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Interpreter;
import Behavioral.Interpreter.Arithmetic.*;
import java.util.Stack;
/**
 *
 * @author argshub
 */
public class JavaInterpreter {
    
    public JavaInterpreter() {}
    
    public void interpretExpression(String expression) {
        Stack<Integer> stack = new Stack();
        for (String ch: expression.split(" ")) {
            if(this.isOperator(ch)) {
                   NumericArithmetic numeric = this.getArithmetic(ch, stack.pop(), stack.pop());
                   stack.push(numeric.interpret());
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        System.out.println(stack.pop());
    }
    
    private boolean isOperator(String ch) {
        if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) return true;
        return false;
    }
    
    private NumericArithmetic getArithmetic(String ch, int x, int y) {
        switch(ch) {
            case "-":
                return new Subtraction(x, y);
            case "*":
                return new Multiplication(x, y);
            case "/":
                return new Division(x, y);
            default:
                return new Addition(x, y);
        }
    }
}
