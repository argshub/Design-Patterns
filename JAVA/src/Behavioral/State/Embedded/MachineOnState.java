/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.State.Embedded;
import Behavioral.State.Machine;
/**
 *
 * @author argshub
 */
public class MachineOnState implements MachineState {
    
    private Machine machine;
    
    public MachineOnState(Machine machine) {
        this.machine = machine;
    }
    
    @Override
    public void click() {
        System.out.println("Shutdown the machine");
        this.machine.setState(this.machine.getOffState());
    }
    
}
