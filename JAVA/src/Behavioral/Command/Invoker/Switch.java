/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Command.Invoker;
import Behavioral.Command.Command.CommandInterface;
/**
 *
 * @author argshub
 */
public class Switch {
    
    private CommandInterface onCommand, offCommand;
    
    public Switch(CommandInterface onCommand, CommandInterface offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }
    
    public void ups() {
        this.offCommand.execute();
    }
    
    public void down() {
        this.onCommand.execute();
    }
}
