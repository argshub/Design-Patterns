/*
* MIT License
* Copyright (c) 2017 argshub
*
*Permission is hereby granted, free of charge, to any person obtaining a copy
*of this software and associated documentation files (the "Software"), to deal
*in the Software without restriction, including without limitation the rights
*to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*copies of the Software, and to permit persons to whom the Software is
*furnished to do so, subject to the following conditions:

*The above copyright notice and this permission notice shall be included in all
*copies or substantial portions of the Software.
*
*THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*SOFTWARE.
 */
package Creational.LazyFactory;
import Creational.LazyFactory.Input.*;
import java.util.HashMap;
/**
 *
 * @author argshub
 */
public class Form {
    
    private String form;
    
    private HashMap<InputTypes, Inputs> inputs;
    
    public Form() {
        this.form = "<form name=\"myForm\">";
        inputs =  new HashMap();
    }
    
    public void generateInput(InputTypes inputTypes, String name) {
        Inputs input = null;
        if(inputs.get(inputTypes) != null) {
            input = inputs.get(inputTypes);
        } else {
            switch(inputTypes) {
                case TEXT:
                    input = new TextInput();
                    break;
                case NUMBER:
                    input = new NumberInput();
                    break;
                case PASSWORD:
                    input = new PasswordInput();
                    break;
            }
            inputs.put(inputTypes, input);
        }
        this.form += input.getInputData(name);
    }
    
    public String getForm() {
        return this.form;
    }
}
