/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Visitor.Elements;
import Behavioral.Visitor.Visitors.Visitor;
/**
 *
 * @author argshub
 */
public class ConcreteElement implements Element {
    
    private String content;
    public ConcreteElement() {
        this.content = "Original Content ";
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
   public void addContent(String content) {
       this.content = content;
   }
   
   @Override
   public String getContent() {
       return this.content;
   }
}
