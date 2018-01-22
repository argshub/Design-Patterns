/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.VirtualMemory;
import Behavioral.VirtualMemory.Error.ApplicationError;
/**
 *
 * @author argshub
 */
public class Application {
    
    public void setConfigError() {
        ApplicationError.setError("config", "Invalid Configuration");
    }
    
    public void setURIError() {
        ApplicationError.setError("uri", "Invalid URI ");
    }
    
    public void setAnotherError() {
        ApplicationError.setError("another", "Another Error");
    }
    
}
