/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.adt;

import digiconnect.interfaces.ListInterface;

/**
 *
 * @author tonyn
 */
public class SinglyLinkedList implements ListInterface {
    
    // Reference to the first node in the list
    private Node head;
    
    // Reference to the current node
    private Node curr;
    
    // Reference to the previous node
    private Node prev;
    
    // Number of elements in the list
    private int size;
    
    // Constructo that create an empty SLL
    // Set to null as there are no nodes yet
    public SinglyLinkedList() {
        head = null;
        curr = null;
        prev = null;
        size = 0;
    }
    
    // Returns true if the list is empty, otherwise false
    // Checks if size is 0
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }
    
    // Returns the number of elements in the list
    @Override
    public int size() {
        return size;
    }
    
    // Traverses the list and sets curr to the node at the index and prev to its predecessor
    // Used by add(), remove() and get()
    private void setCurrent(int index) {
        int i;
        prev = null;
        curr = head;
        // Loops through the list until it reaches the index
        for (i = 1; i < index; i++) {
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    // Returns the elemtn stored in the index position
    // Uses setCurrent() to traverse to the correct node
    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr.getElement();
    }
    
    // Adds an element at a specific index position.
    // If index is 1, the new node becomes the head
    // Otherwise setCurrent() finds the correct position and the new
    // node is entered between prev and curr
    @Override
    public void add(Object theElement, int index) {
        // Special case adding at the end of the list
        if (index == 1) {
            Node newNode = new Node(theElement, head);
            head = newNode;   
        }else {
            // Traverse to the correct position
            setCurrent(index);
            // Create new node pointing to curr
            Node newNode = new Node(theElement, curr);
            // Link prev to the new node
            prev.setNext(newNode);
        }
        
        // (DON'T FORGET) Increase the size counter
        size = size + 1;
    }
    
    // Adds an element to the end of the list
    // Calls add() with index set to size +1
    @Override
    public void add(Object theElement) {
        add(theElement, size + 1);
    }
    
    // Removes the element at the index position
    // Special case if index is 1 the head is moved to the next node
    // Otherwise setcurrent() finds the correct position and prev is 
    // linked to the node after curr, removing curr
    @Override
    public void remove(int index) {
        // Special case removing the head of the list
        if (index == 1) {
            head = head.getNext();
        }else {
            // Traverse to the correct position
            setCurrent(index);
            // Skip over curr to remove it from chain
            prev.setNext(curr.getNext());
        }
        // Decrese the size counter
        size = size -1;  
    }   
    // Treveses the entire list from head to null
    // Prints the string representation of each element
    @Override
    public void printList() {
        Node aNode = head;
        // Loop until it reaches the end of the list
        while (aNode !=null) {
            System.out.println(aNode.getElement().toString());
            aNode = aNode.getNext();
        }
    }
}
