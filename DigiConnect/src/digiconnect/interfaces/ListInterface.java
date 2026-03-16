/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digiconnect.interfaces;

/**
 * Items can be accessed, added or removed from any position in this list
 * Backed by a SLL with head, curr and prev pointers
 * @author tonyn
 */
public interface ListInterface {
    
    // Returns true if list is empty, otherwise false
    public boolean isEmpty();
    
    // Returns the number of elements in the list
    public int size();
    
    // Returns the element at the given position
    public Object get(int index);
    
    // Removes the element at he index position
    public void remove(int index);
    
    // Add an element at index position
    public void add(Object theElement, int index);
    
    // Adds an element to the end of the list
    public void add(Object theElement);
    
    // Prints all the elements in the list
    public void printList(); 
}
