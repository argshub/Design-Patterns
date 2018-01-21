/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Memento.Moments;

/**
 *
 * @author argshub
 */
public class Momento {
    
    private double width, height;
    
    public Momento(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
}
