/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Interpreter.JavaInterpreter;
/**
 *
 * @author argshub
 */
public class InterpreterTest {
    
    
    public static void main(String arg[]) {
        JavaInterpreter java = new JavaInterpreter();
        java.interpretExpression("3 8 9 10 5 + - * /");
    }
}
