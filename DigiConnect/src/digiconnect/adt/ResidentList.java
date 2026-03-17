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
        // Initialise the ArrayList
        residents = new ArrayList<>();
    }
    
    // Returns true if the list is empty, otherwise false
    // Uses built in ArrayList isEmpty() method
    @Override
   public boolean isEmpty() {
       return residents.isEmpty();
   }
    // Returns the number of residents currently in the list
    // Uses built in ArrayList size() method
    @Override
    public int size() {
        return residents.size();
    }
    
    // Returns the resident at given index
    // Array is zero-based so subtract 1 from index
    //@param int index position
    //@return Resident object
    @Override 
    public Object get(int index) {
        // Subtract 1 to convert from 1-based to 0-based index
        // Array Lists start counting from 0 not 1
        // EG, User asks for resident at position 1, subtract 1 to get index 0
        return residents.get(index - 1);
    }
    
    // Remove a resident at given index
    // @param int index position
    @Override
    public void remove(int index) {
        // ArrayList is zero-based so subtract 1 from index
        residents.remove(index - 1);
    }
    
    // Add a resident at specific index
    // Downcasts Object to resident
    // @param Object theElement, int index position
    @Override
    public void add(Object theElement, int index) {
        // Cast object to resident
        Resident resident = (Resident) theElement;
        // ArrayList is zero-based so subtract 1 from index
        residents.add(index - 1, (Resident) theElement);
    }
    
    // Add a resident to the end of the list
    // @param Object theElement
    @Override
    public void add(Object theElement) {
        // Downcasts Object to Resident
        residents.add((Resident) theElement);    
    }
    
    // Updates the resident at the given index position
    // Downcasts Object to Resident
    // ArrayList is zero-based so subtract 1 from index
    // @param int index position, Resident object
    public void printList(int index, Resident resident) {
        residents.set(index - 1, resident);    
    }
    
    // Prints all residents in the list
    // Uses a for loop to traverse the ArrayList
    // @return String of all residents
    @Override
    public void printList() {
        String str = new String();
        if (residents.isEmpty()) {
            str = str.concat("Empty");
        }else {
            // Loop through all residents in the ArrayList
            for (int i = 0; i < residents.size(); i++) {
                // Add each residen's toString to the string
                str = str.concat(residents.get(i).toString());
                // Add a separator between each resident
                str = str.concat(" ; ");
            }
        }
        // Print final string to console
        System.out.println(str);
    }
    
}
