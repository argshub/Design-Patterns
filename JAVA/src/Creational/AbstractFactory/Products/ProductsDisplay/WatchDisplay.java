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
public class WatchDisplay implements Display {
    
    @Override
    public void getDisplay() {
        System.out.println("Watch Display");
    }
}
