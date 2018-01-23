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
package Structural.FlyWeight;
import java.util.HashMap;
import Structural.FlyWeight.CodeBase.*;
/**
 *
 * @author argshub
 */
public abstract class FlyWeight {
    
    private static HashMap<String, Code> codes = new HashMap();
    
    public static void execute(String codeType, String code) {
        Code codeBase = null;
        if(codes.containsKey(codeType)) codeBase = codes.get(codeType);
        else {
            switch(codeType) {
                case "CPP":
                    codeBase = new CPP();
                    break;
                case "JAVA":
                    codeBase = new Java();
                    break;
                case "PYTHON":
                    codeBase = new Python();
                    break;
            }
            codes.put(codeType, codeBase);
        }
        codeBase.execute(code);
    }
    
}
