/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.VirtualMemory.Application;
import Behavioral.VirtualMemory.Error.ApplicationError;
/**
 *
 * @author argshub
 */
public class VirtualMemoryTest {
    
    
    public static void main(String arg[]) {
        Application app = new Application();
        app.setConfigError();
        app.setURIError();
        app.setAnotherError();
        
        ApplicationError.printAllErrors();
    }
}
