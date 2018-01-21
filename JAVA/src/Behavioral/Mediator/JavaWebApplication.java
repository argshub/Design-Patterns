/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator;

import Behavioral.Mediator.URI.URIValidator;
import Behavioral.Mediator.Routes.RoutesValidator;
import Behavioral.Mediator.Controller.AppController;
import Behavioral.Mediator.Middleware.MiddlewareProvider;
import Behavioral.Mediator.Request.RequestProvider;
/**
 *
 * @author argshub
 */
public class JavaWebApplication implements WebApplication {
    
    private URIValidator uri; 
    private RoutesValidator routes;
    private AppController app;
    private MiddlewareProvider middleware;
    private RequestProvider request;
    
    public JavaWebApplication() {
        this.uri = new URIValidator();
        this.routes = new RoutesValidator();
        this.app = new AppController();
        this.middleware = new MiddlewareProvider();
        this.request = new RequestProvider();
    }
    
    @Override
    public void validate() {
        this.uri.validateURI();
        this.routes.loadRoutesData(this.uri.getURIPath());
        this.routes.validateRoutes();
        this.app.validateController(this.routes.getController());
        this.app.validateMethod(this.routes.getMethodName());
        this.middleware.validateMiddleware(this.routes.getMiddlewareName());
    }
    
    
    @Override
    public void run() {
        this.validate();
        this.request.provideService(this.routes.getController(), this.routes.getMethodName(), this.routes.getRequestMethod());
    }
    
}
