/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator.URI;

/**
 *
 * @author argshub
 */
public class URIValidator {
    private String uri;
    
    public URIValidator() {
        System.out.println("Loading URI Info");
        this.uri = "https://facebook.com/hello";
    }
    
    public void validateURI() {
        System.out.println("Validation URI Data");
    }
    
    public String getURIPath() {
        return "home";
    }
}
