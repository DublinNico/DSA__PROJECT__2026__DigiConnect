/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digiconnect.interfaces;

/**
 * Items are pushed and popped from the top of this list (LIFO)
 * Backed by a SLL with a head pointer
 * @author tonyn
 */
public interface StackInterface {
    
    // Returns true if list is empty, otherwise false
    public boolean isEmpty();
    
    // Returns true if the stack if fll, otherwise false
    public boolean ifFull();
    
    // Add an element to the top of the stack
    public void push(Object newItem);
    
    // Removes and returns the element from the top of the stack
    public Object pop();
    
    // Return the number os elements in the stack
    public int size();
}
