/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Visitor.Visitors.*;
import Behavioral.Visitor.Elements.*;
/**
 *
 * @author argshub
 */
public class VisitorTest {

    
    public static void main(String arg[]) {
        Element element = new ConcreteElement();
        Visitor visitor = new ConcreteVisitor();
        System.out.println("Before Visiting:  "+ element.getContent());
        element.accept(visitor);
        System.out.println("After Visiting:  "+ element.getContent());
    }
}

