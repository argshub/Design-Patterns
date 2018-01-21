/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Command.Command.*;
import Behavioral.Command.Invoker.*;
import Behavioral.Command.Reciever.*;
/**
 *
 * @author argshub
 */
public class CommandTest {
    
    
    public static void main(String arg[]) {
        Light light = new Light();
        LightOn lightOn = new LightOn(light);
        LightOff lightOff = new LightOff(light);
        Switch lightSwitch = new Switch(lightOn, lightOff);
        
        lightSwitch.down();
        lightSwitch.ups();
        lightSwitch.down();
        
    }
}
