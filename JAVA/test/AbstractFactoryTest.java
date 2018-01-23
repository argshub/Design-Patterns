/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Creational.AbstractFactory.AppleFactory;
/**
 *
 * @author argshub
 */
public class AbstractFactoryTest {
    
    
    public static void main(String arg[]) {
        AppleFactory factory = new AppleFactory();
        factory.createNewPhone();
        factory.createNewWatch();
        factory.createNewLaptop();
    }
}
