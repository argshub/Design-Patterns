/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory.Products;
import Creational.AbstractFactory.Products.ProductsBody.*;
import Creational.AbstractFactory.Products.ProductsCPU.*;
import Creational.AbstractFactory.Products.ProductsDisplay.*;
/**
 *
 * @author argshub
 */
public class AppleIPhone implements AppleProducts {
    
    @Override
    public Body body() {
        return new PhoneBody();
    }
    
    
    @Override
    public Display display() {
        return new PhoneDisplay();
    }
    
    @Override
    public CPU cpu() {
        return new PhoneCPU();
    }
    
    @Override
    public void assemble() {
        System.out.println("Assembling Apple I Phone");
        this.cpu().getCPU();
        this.display().getDisplay();
        this.body().getBody();
    }
}
