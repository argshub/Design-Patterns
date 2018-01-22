/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory.Products.ProductsDisplay;

/**
 *
 * @author argshub
 */
public class PhoneDisplay implements Display {
    
    @Override
    public void getDisplay() {
        System.out.println("Phone Display");
    }
}
