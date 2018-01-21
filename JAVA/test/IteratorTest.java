/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Behavioral.Iterator.SinglyLinkedList;
import Behavioral.Iterator.Iter.Iterator;
/**
 *
 * @author argshub
 */
public class IteratorTest {
    
    
    public static void main(String arg[]) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        for(int x = 0; x < 20; x++) list.insert(x * x);
        
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.printf("%d\t", iterator.next());
        }
        
    }
    
}
