/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.adt;

import digiconnect.interfaces.QueueInterface;

/**
 * Waiting queue for managing residents waiting to be assessed
 * Implements QueueInterface to define the necessary behaviors for the Queue ADT
 * Backed by SLL - Follows FIFO principle
 * @author tonyn
 */
public class AssessmentQueue implements QueueInterface {
    
    private Node head;
    private Node curr;
    private int size;
    
    // Constructor for setting up an empty queue
    public AssessmentQueue() {
        head = null;
        curr = null;
        size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    // Returns true if the queue is empty, otherwise false
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            // Queue is empty
            return true;
        } else {
            // Queue has something in it
            return false;
        }
    }
    // Removes and returns the element from the front of the queue
    // Moves the head pointer to the next node
    @Override
    public Object dequeue() {
        if (head == null) {
            return null;
        }else {
            Object element = head.getElement();
//            Node temp = head;
            head = head.getNext();
            size--;
            return element;
        }
    }
    // Returns the element to the front of the queue without removing it
    @Override
    public Object frontOfQueue() {
        if (head == null) {
            return null;
        }else {
            return head;
        }
    }
    
    // Adds a new element to the rear of the queue
    // If empty, new node becomes the head
    // Otherwise it traverses to the end and appends the new node
    @Override
    public void enqueue(Object element) {
        // Set up new node using the object passed in
        Node newNode = new Node(element, null);
       if (head == null) { 
           head = newNode;
       } else {
          
           // Move to the end of the queue
           setCurrent(size);
           curr.setNext(newNode);
       }
       size++;
    }
    
    // Traverses the list to set curr to the node at index
    // Used by enqueue()
    private void setCurrent(int index) {
        curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }
    
    // Prints all the elements in the queue rom front to rear
    @Override
    public void printQueue() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
    
    // Returns all elements in the queue as a string
    public String getQueueAsString() {
        String str = "";
        Node tempNode = head;
        while (tempNode != null) {
            str = str + tempNode.getElement().toString() + "\n";
            tempNode = tempNode.getNext();
        }
        return str;
    }
    
}
