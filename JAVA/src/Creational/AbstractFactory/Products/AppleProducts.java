/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory.Products;
import Creational.AbstractFactory.Products.ProductsBody.Body;
import Creational.AbstractFactory.Products.ProductsCPU.CPU;
import Creational.AbstractFactory.Products.ProductsDisplay.Display;
/**
 *
 * @author argshub
 */
public interface AppleProducts {
    
    public Body body();
    public Display display();
    public CPU cpu();
    public void assemble();
}
