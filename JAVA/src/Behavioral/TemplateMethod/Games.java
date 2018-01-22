/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.TemplateMethod;

/**
 *
 * @author argshub
 */
public abstract class Games {
    abstract public String setName();
    abstract public int setID();
    public void play() {
        System.out.println("Playing Games, Name: " + this.setName() + " & ID: " + this.setID());
    }
}
