/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.adt;

import digiconnect.interfaces.StackInterface;

/**
 * Stack ADT for storing residents who have completed their sessions
 * Implements StackInterface
 * Backed by SLL -  follows LIFO principle
 * @author tonyn
 */
public class CompletedSessionStack implements StackInterface {
    
    private Node head;
    private Node curr;
    private int size;
    
    // Constructor for empty stack
    public CompletedSessionStack() {
        head = null;
        curr = null;
        size = 0;
    }
    // Returns true if the stack is empty, otherwise false
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            // Stack is empty
            return true;
        }else {
            // Stack contains at least 1 element
            return false;
        }
    }
    
    // Returns true if the stack is full, otherwide false
    // A linked list based stack is never full, grows dynamically 
    @Override
    public boolean isFull() {
        return false;
    }
    
    // Return the number of elements currently in the stack
    @Override 
    public int size() {
        return size;
    }
    
    // Adds new element onto the top of the stack
    // New node becomes the head
    // Previous head becomes the second element
    @Override
    public void push(Object newItem) {
        Node newNode = new Node(newItem, null);
        // If the stack is empty, new node become the head
        if (head == null) {
            head = newNode;
        }else {
            // Add to top, new node points to current head
            newNode.setNext(head);
            head = newNode;
        }
        // Increase size counter
        size++;
    }
    
    // Removes and returns th element from the top of the stack
    // Moves the head pointer to the next node
    // Java garbage collection removes old head
    @Override
    public Object pop() {
        if (head == null) {
            // Stack is empty, nothing to remove
            return null;
        } else {
            // Store the current head in a temp node
            Node temp = head;
            // Move head to the next node
            head = head.getNext();
            // Decrease the size counter
            size--;
            // Return the removed node
            return temp;
        }
    }
    
    // Returns the element at the top of the stack without removing it
    public Object peek() {
        if (head == null) {
            // Stack empty, nothing to peek at
            return null;
        }else {
            // Return the head element
            return head;
        }
    }
    
    // Prints all the elements in the stack from the top to bottom
    // Traverses from head to null
    public void printStack() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
    
    public String getStackAsString() {
    String str = "";
    Node tempNode = head;
    while (tempNode != null) {
        str = str + tempNode.getElement().toString() + "\n";
        tempNode = tempNode.getNext();
    }
    return str;
}
    
}
