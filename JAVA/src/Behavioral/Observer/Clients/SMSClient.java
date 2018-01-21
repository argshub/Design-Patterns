/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Observer.Clients;

/**
 *
 * @author argshub
 */
public interface SMSClient {
    
    public void subscribe();
    public void unsubscribe();
    public void update(String message);
    public void send();
}
