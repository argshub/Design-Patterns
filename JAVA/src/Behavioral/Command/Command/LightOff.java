/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Command.Command;
import Behavioral.Command.Reciever.Light;
/**
 *
 * @author argshub
 */
public class LightOff  implements CommandInterface {
    
    public Light light;
    
    public LightOff(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        this.light.off();
    }
}
