/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory.Products.ProductsCPU;

/**
 *
 * @author argshub
 */
public class LaptopCPU implements CPU {
    
    
    @Override
    public void getCPU() {
        System.out.println("Laptop CPU");
    }
}
