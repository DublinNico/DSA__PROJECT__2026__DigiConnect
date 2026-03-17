/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.adt;

import digiconnect.interfaces.ListInterface;
import digiconnect.model.Resident;
import java.util.ArrayList;

/**
 * List for storing all registered residents
 * Implements ListInterface
 * Back by an ArrayList
 * Supports full CRUD operations
 * @author tonyn
 */
public class ResidentList implements ListInterface {
    
    // ArrayList to store all registered residents
    private ArrayList<Resident> residents;
    
    // Constructor for setting up en empty ResidentList
    public ResidentList() {
        residents = new ArrayList<>();
    }
    
    // Returns true if the list is empty, otherwise false
    @Override
   public boolean isEmpty() {
       return residents.isEmpty();
   }
    // Returns the number of residents currently in the list
    @Override
    public int size() {
        return residents.size();
    }
    
    // Returns the resident at given index
    //@param int index position
    //@return Resident object
    @Override 
    public Object get(int index) {
        // Array is zero-based so subtract 1 from index
        return residents.get(index - 1);
    }
    
    // Remove a resident at given index
    // @param int index position
    @Override
    public void remove(int index) {
        residents.remove(index - 1);
    }
    
    // Add a resident at specific index
    @Override
    public void add(Object theElement, int index) {
        // Cast object to resident
        Resident resident = (Resident) theElement;
        residents.add(index - 1, resident);
    }
    
    // Add a resident to the start of the list
    @Override
    public void add(Object theElement) {
        // Cast object to resident
        Resident resident = (Resident) theElement;
        residents.add(resident);
    }
    
    // Prints all the residents in the list
    @Override
    public void printList() {
        // Loop through all the residents and print each one
        for (int i = 0; i < residents.size(); i++) {
            System.out.println(residents.get(i).toString());
        }
    }
    
    // Updates a resident at a given index
    public void upate(int index, Resident resident) {
         // ArrayList is zero-based so subtract 1 from index
        residents.set(index - 1, resident);
    }
    
}
