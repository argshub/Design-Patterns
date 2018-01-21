/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.NullObject;
import Behavioral.NullObject.Form.Password;
import Behavioral.NullObject.Form.NullInput;
import Behavioral.NullObject.Form.NumberInput;
import Behavioral.NullObject.Form.Text;
import Behavioral.NullObject.Form.Inputs;

/**
 *
 * @author argshub
 */
public class HTMLForm {
    
    private String allInputs;
    
    public HTMLForm() {
        this.allInputs = "<form name=\"myForm\">";
    }
    
    public void generateInputs(String formType, String inputName) {
        Inputs inputs = null;
        switch(formType.toUpperCase()) {
            case "TEXT":
                inputs = new Text();
                break;
            case "NUMBER":
                inputs = new NumberInput();
                break;
            case "PASSWORD":
                inputs = new Password();
                break;
            default:
                inputs = new NullInput();
                break;
        }
        this.allInputs += inputs.getInputData(inputName);
    }
    
    public String getForm() {
        return this.allInputs + "</form>";
    }
}
