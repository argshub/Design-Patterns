/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.NullObject.HTMLForm;
/**
 *
 * @author argshub
 */
public class NullObjectTest {
    
    public static void main(String arg[]) {
        HTMLForm form = new HTMLForm();
        form.generateInputs("TEXT", "firstName");
        form.generateInputs("TEXT", "lastName");
        form.generateInputs("TEXT", "userName");
        form.generateInputs("NUMBER", "HomeNumber");
        form.generateInputs("NUMBER", "ContactNumber");
        form.generateInputs("password", "userPassword");
        
        System.out.println(form.getForm());
        
    }
    
}
