/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author argshub
 */
public interface MediaPlayer {
    
    public void play(String fileName, String fileType);
    public void setHandler(MediaPlayer media);
    
}
