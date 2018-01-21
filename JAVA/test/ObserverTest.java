/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Observer.Service.*;
import Behavioral.Observer.Clients.*;
/**
 *
 * @author argshub
 */
public class ObserverTest {
    
    
    public static void main(String arg[]) {
        Services service = new HoroscopeNotificationService();
        SMSClient client1 = new HoroscopeNotificationServiceClient(service, 390273);
        client1.subscribe();
        SMSClient client2 = new HoroscopeNotificationServiceClient(service, 123456);
         client2.subscribe();
        SMSClient client3 = new HoroscopeNotificationServiceClient(service, 654321);
         client3.subscribe();
        SMSClient client4 = new HoroscopeNotificationServiceClient(service, 67890);
         client4.subscribe();
        SMSClient client5 = new HoroscopeNotificationServiceClient(service, 9876);
         client5.subscribe();
        SMSClient client6 = new HoroscopeNotificationServiceClient(service, 756565);
         client6.subscribe();
        SMSClient client7 = new HoroscopeNotificationServiceClient(service, 353644);
         client7.subscribe();
        SMSClient client8 = new HoroscopeNotificationServiceClient(service, 342522);
         client8.subscribe();
        
        service.update("Hello World");
    }
}
