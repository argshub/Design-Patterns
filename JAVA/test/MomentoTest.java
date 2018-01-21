/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Momento.BitMapImage;
import Behavioral.Memento.CareTaker.BitMapCareTaker;
/**
 *
 * @author argshub
 */
public class MomentoTest {
    
    
    public static void main(String arg[]) {
        
        BitMapImage bitMap = new BitMapImage(100.0, 100.0, new BitMapCareTaker());
        bitMap.save();
        bitMap.resize(200.0, 200.0);
        bitMap.save();
        bitMap.resize(300.0, 300.0);
        bitMap.undo();
        bitMap.undo();
        
    }
}
