/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator.Request;

/**
 *
 * @author argshub
 */
public class RequestProvider {

    public void provideService(String controller, String methodName, String requestMethod) {
        System.out.println("Service Providing with: " + "Controller: " + controller + "Method: " + methodName + "Request method: " + requestMethod);
   }
    
}
