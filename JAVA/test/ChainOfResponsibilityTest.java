/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.ChainOfResponsibility.*;
/**
 *
 * @author argshub
 */
public class ChainOfResponsibilityTest {
    
    public static void main(String arg[]) {
        MediaPlayer mp3Player, aviPlayer, mkvPlayer;
        mp3Player = new MP3Player();
        aviPlayer = new AVIPlayer();
        mkvPlayer = new MKVPlayer();
        mp3Player.setHandler(aviPlayer);
        aviPlayer.setHandler(mkvPlayer);
        
        mp3Player.play("Hello", "MKV");
        mp3Player.play("numb", "AVI");
        mp3Player.play("last dance", "MP3");
        mp3Player.play("Just When i Needed", "MP4");
    }
    
}
