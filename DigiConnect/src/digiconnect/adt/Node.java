/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.adt;

/**
 * Represents a single node in a linked list
 * Each node hols data and reference to the 
 * next node in the chain
 * @author tonyn
 */
public class Node {
    
    // Data stored in the node
    private Object element;
    
    // Reference to the next node in the list
    private Node next;
    
    // Constructor that creates a node with element and references next node
    public Node(Object e, Node n) {
        element = e;
        next = n;
    }
    // Returns the data stored in this node
    public Object getElement() {
        return element;
    }
    
    // Sets the data stored in this node
    public void setElement(Object element) {
        this.element = element;
    }

    // Returns the next node in the linked list
    public Node getNext() {
        return next;
    }

    // Sets the next node in the linked list
    public void setNext(Node next) {
        this.next = next;
    }   
}
