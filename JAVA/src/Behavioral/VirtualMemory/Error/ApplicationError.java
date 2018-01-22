/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.VirtualMemory.Error;
import java.util.HashMap;
/**
 *
 * @author argshub
 */
public class ApplicationError {
    
    private static HashMap<String, String> errors = new HashMap();
    private ApplicationError() {}
    
    public static void setError(String key, String value) {
        errors.put(key, value);
    }
    
    public static String getError(String key) {
        return errors.get(key);
    }
    
    public static void printAllErrors() {
        for(String key: errors.keySet()) {
            System.out.printf("Error Key: %s & value: %s\n", key, getError(key));
        }
    }
}
