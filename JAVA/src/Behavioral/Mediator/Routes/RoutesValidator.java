/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator.Routes;

/**
 *
 * @author argshub
 */
public class RoutesValidator {
    private String controller, method;
    
    public RoutesValidator() {
        this.controller = this.method = "";
    }
    
    public void loadRoutesData(String routesPath) {
        System.out.println("Loading Routes Information for "+ routesPath);
    }
    
    public void validateRoutes() {
        System.out.println("Validating Routes Data");
    }

    public String getController() {
        return "HomeController";
    }
    
    public String getMethodName() {
        return "index";
    }
    
    public String getMiddlewareName() {
        return "auth";
    }

    public String getRequestMethod() {
        return "GET";
    }
}
