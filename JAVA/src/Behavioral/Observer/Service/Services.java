/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer.Service;

import Behavioral.Observer.Clients.SMSClient;
/**
 *
 * @author argshub
 */
public interface Services {
    
    public void subscribe(SMSClient client);
    public void unsubscribe(SMSClient client);
    public void update(String message);
}
