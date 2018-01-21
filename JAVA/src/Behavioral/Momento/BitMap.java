/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Momento;

/**
 *
 * @author argshub
 */
public interface BitMap {
    
    public void save();
    public void undo();
    public void resize(double width, double height);
}
