/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer.Service;

import java.util.ArrayList;
import Behavioral.Observer.Clients.SMSClient;

/**
 *
 * @author argshub
 */
public class HoroscopeNotificationService implements Services {
    
    private ArrayList<SMSClient> clients;
    
    public HoroscopeNotificationService() {
        this.clients = new ArrayList();
    }
    
    @Override
    public void subscribe(SMSClient client) {
        this.clients.add(client);
    }
    
    @Override
    public void unsubscribe(SMSClient client) {
        this.clients.remove(client);
    }
    
    @Override
    public void update(String message) {
        this.notifyAllUsers(message);
    }
    
    private void notifyAllUsers(String message) {
        for (SMSClient client: this.clients){
            client.update(message);
            client.send();
        }
    }   
}
