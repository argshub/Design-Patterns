/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.NullObject.Form;

/**
 *
 * @author argshub
 */
public class Text implements Inputs {
    
    @Override
    public String getInputData(String inputName) {
        return "<input type=\"text\" name=\"" + inputName + "\"/>\n"; 
    }
}
