/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Momento;;

import Behavioral.Memento.CareTaker.BitMapCareTaker;
import Behavioral.Memento.Moments.Momento;
/**
 *
 * @author argshub
 */
public class BitMapImage implements BitMap {
   
    private double width, height;
    
    private BitMapCareTaker careTaker;
    
    public BitMapImage(double width, double height, BitMapCareTaker careTaker) {
        this.width = width;
        this.height = height;
        this.careTaker = careTaker;
    }
    
    @Override
    public void save() {
        this.careTaker.setMomento(new Momento(this.width, this.height));
        System.out.printf("Saving Current State, Width: %f & Height: %f\n", this.width, this.height);
    }
    
    @Override
    public void undo() {
        Momento momento = this.careTaker.getMomento();
        System.out.printf("Current State, Width: %f & Height: %f\n", this.width, this.height);
        this.width = momento.getWidth();
        this.height = momento.getHeight();
        System.out.printf("Restored State, Width: %f & Height: %f\n", this.width, this.height);
    }
    
    @Override
    public void resize(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
   
}
