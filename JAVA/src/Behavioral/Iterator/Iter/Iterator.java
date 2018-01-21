/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Iterator.Iter;

/**
 *
 * @author argshub
 */
public interface Iterator<T> {
    
    public T next();
    public boolean hasNext();
    
}
