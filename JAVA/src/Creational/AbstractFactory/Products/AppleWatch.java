/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory.Products;

import Creational.AbstractFactory.Products.ProductsBody.Body;
import Creational.AbstractFactory.Products.ProductsBody.WatchBody;
import Creational.AbstractFactory.Products.ProductsCPU.CPU;
import Creational.AbstractFactory.Products.ProductsCPU.WatchCPU;
import Creational.AbstractFactory.Products.ProductsDisplay.Display;
import Creational.AbstractFactory.Products.ProductsDisplay.WatchDisplay;

/**
 *
 * @author argshub
 */
public class AppleWatch implements AppleProducts {
    @Override
    public Body body() {
        return new WatchBody();
    }
    
    
    @Override
    public Display display() {
        return new WatchDisplay();
    }
    
    @Override
    public CPU cpu() {
        return new WatchCPU();
    }
    
    @Override
    public void assemble() {
        System.out.println("Assembling Apple Watch");
        this.cpu().getCPU();
        this.display().getDisplay();
        this.body().getBody();
    }
}
