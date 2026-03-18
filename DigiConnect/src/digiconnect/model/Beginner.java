/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.model;

/**
 *
 * @author tonyn
 */
public class Beginner extends Resident {
    
    public Beginner(int id, String name, String address, int age, int phone, String digitalBarrier, String status) {
    super(id, name, address, age, phone, digitalBarrier, status);
    }
    
    @Override
    public String getSkillTier() {
        return("Beginner");
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
