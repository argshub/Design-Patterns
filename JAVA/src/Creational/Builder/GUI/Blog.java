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
package Creational.Builder.GUI;

/**
 *
 * @author argshub
 */
public class Blog extends GraphicalUserInterface {
    
    public Blog() {
        super();
    }
    
    @Override
    public void setHeader(String content) {
        super.gui.setHeader(200, 200, content);
    }
    
    
    @Override
    public void setLeftNavigation(String content) {
        super.gui.setLeftNavigation(50, 50, content);
    }
    
    @Override
    public void setRightNavigation(String content) {
        
    }
    
    @Override
    public void setContent(String content) {
        super.gui.setContent(150, 150, content);
    }
    
    @Override
    public void setFooter(String content) {
        super.gui.setFooter(200, 200, content);
    }
    
}
