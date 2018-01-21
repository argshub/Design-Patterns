/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Iterator;
import Behavioral.Iterator.Iter.*;
/**
 *
 * @author argshub
 */
public class SinglyLinkedList<T> implements Iterables {
    
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void insert(final T element) {
        Node newNode = new Node(element);
        if(this.head == null) this.head = newNode;
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    
    public void remove() {
        if(this.head == null) return;
        else this.head = this.head.next;
    }
    
    @Override
    public Iterator iterator() {
        return new SinglyLinkedListIterator(this.head);
    }
    
    private class Node {
        private Node next;
        private T element;
        
        private Node(final T element) {
            this.element = element;
            this.next = null;
        }
    }
    
    private class SinglyLinkedListIterator implements Iterator<T> {
        
        private Node cursor;
        
        private SinglyLinkedListIterator(Node node) {
            this.cursor = node;
        }
        
        @Override
        public boolean hasNext() {
            return this.cursor != null ? true : false;
        }
        
        @Override
        public T next() {
            T element = this.cursor.element;
            this.cursor = this.cursor.next;
            return element;
        }
        
    }
    
}
