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
public class MP3Player implements MediaPlayer {
    
    private MediaPlayer media;
    
    public MP3Player() {
        this.media = null;
    }
    
    @Override
    public void setHandler(MediaPlayer media) {
        this.media = media;
    }
    
    @Override
    public void play(String fileName, String fileType) {
        if(fileType.equals("MP3")) {
            System.out.println("Playing fileName: " + fileName + " & fileType: " + fileType);
        } else if(this.media != null) {
            this.media.play(fileName, fileType);
        } else {
            System.out.println("No Player Can Play this Song");
        }
    }
}
