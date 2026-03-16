/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digiconnect.interfaces;

/**
 * Items in this list enter at the back and leave from the front.(FIFO)
 * Backed up by an SSL with a head pointer.
 * @author tonyn
 */
public interface QueueInterface {
    
    // Returns true if list is empty, otherwise false    
    public boolean isEmpty();    
    
    // Returns the number of elements in the queue
    public int size();
    
    // Returns the element at the front without removing it
    public Object frontElement();
    
     // Adds an element to the rear of the queue
    public void enqueue(Object element);
    
    // Removes and returns the element from the front of the queue
    public Object dequeue();   
}
