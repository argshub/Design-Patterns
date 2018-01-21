/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.State;

import Behavioral.State.Embedded.*;

/**
 *
 * @author argshub
 */
public class Machine implements MachineState {
    
    private MachineState state;
    private MachineState onState;
    private MachineState offState;
    
    public Machine() {
       this.state = offState =  new MachineOffState(this);
       onState =  new MachineOnState(this);
    }
    
    @Override
    public void click() {
        this.state.click();
    }
    
    public void setState(MachineState state) {
        this.state = state;
    }
    
    public MachineState getOnState() {
        return this.onState;
    }
    
    public MachineState getOffState() {
        return this.offState;
    }
    
}
