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
public interface Element {
    
    
    public void accept(Visitor visitor);
    public void addContent(String content);
    public String getContent();
    
}
