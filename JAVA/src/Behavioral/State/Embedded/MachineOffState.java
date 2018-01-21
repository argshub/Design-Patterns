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
public class MachineOffState implements MachineState {
    
    private Machine machine;
    
    public MachineOffState(Machine machine) {
        this.machine = machine;
    }
    
    @Override
    public void click() {
        System.out.println("Machine is Started to Work");
        this.machine.setState(this.machine.getOnState());
    }
    
}
