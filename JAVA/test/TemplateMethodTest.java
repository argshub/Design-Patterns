/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.TemplateMethod.*;
/**
 *
 * @author argshub
 */
public class TemplateMethodTest {
    
    
    public static void main(String arg[]) {
        Games game;
        game = new PlayerOne();
        game.play();
        
        game = new PlayerTwo();
        game.play();
    }
    
}
