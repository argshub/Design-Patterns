/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory;

import Creational.AbstractFactory.Products.*;
/**
 *
 * @author argshub
 */
public class AppleFactory {
    
    public AppleFactory() {
        
    }
    
    public void createNewPhone() {
        AppleProducts product  = new AppleIPhone();
        product.assemble();
    }
    
    public void createNewWatch() {
        AppleProducts product  = new AppleWatch();
        product.assemble();
    }
    
    public void createNewLaptop() {
        AppleProducts product  = new AppleLaptop();
        product.assemble();
    }
}
