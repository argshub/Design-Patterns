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
package Creational.Builder.GUI.Framework;

/**
 *
 * @author argshub
 */
public class GUIFramework {
    
    private String topHeader, leftNavigation, rightNavigation, footer, content;
    
    public GUIFramework() {
        this.topHeader = this.leftNavigation = this.rightNavigation = this.footer = this.content = "";
    }
    
    public void setHeader(int width, int height, String content) {
        System.out.println("Top Header of Width: " + width + " & height: " + height + " & Content: " + content);
    }
    
    public void setLeftNavigation(int width, int height, String content) {
        System.out.println("Left Navigation of Width: " + width + " & height: " + height + " & Content: " + content);
    }
    
    public void setRightNavigation(int width, int height, String content) {
        System.out.println("Right Navigation of Width: " + width + " & height: " + height + " & Content: " + content);
    }
    
    public void setContent(int width, int height, String content) {
        System.out.println("Content of Width: " + width + " & height: " + height + " & Content: " + content);
    }
    
    public void setFooter(int width, int height, String content) {
        System.out.println("Footer of Width: " + width + " & height: " + height + " & Content: " + content);
    }
}