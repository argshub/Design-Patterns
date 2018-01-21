package Behavioral.Observer.Clients;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Behavioral.Observer.Service.Services;
/**
 *
 * @author argshub
 */
public class HoroscopeNotificationServiceClient implements SMSClient {
    private Services service;
    
    private int number;
    private String message;
    
    public HoroscopeNotificationServiceClient(Services service, int number) {
        this.service = service;
        this.number = number;
        this.message = "";
    }
    
    @Override
    public void subscribe() {
        this.service.subscribe(this);
    }
    
    @Override
    public void unsubscribe() {
        this.service.unsubscribe(this);
    }
    
    @Override
    public void update(String message) {
        this.message = message;
    }
    
    @Override
    public void send() {
        System.out.println("Sending Message to " + this.number + " and Message " + this.message);
    }
    
}
