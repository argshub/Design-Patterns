/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.State.Machine;
import Behavioral.State.Embedded.*;
/**
 *
 * @author argshub
 */
public class StateTest {
    
    
    public static void main(String arg[]) {
        Machine machine = new Machine();
        MachineState state = new MachineOnState(machine);
        state = new MachineOffState(machine);
        
        machine.click();
        machine.click();
        machine.click();
        machine.click();
        machine.click();
    }
    
}
