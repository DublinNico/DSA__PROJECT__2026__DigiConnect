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
    
    private String deviceType;

    public Beginner(String deviceType, int id, String name, String address, int age, int phone, String digitalBarrier, String status) {
        super(id, name, address, age, phone, digitalBarrier, status);
        this.deviceType = deviceType;
    }
    
    @Override
    public String getSkillTier(){
        return "Beginner";
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Device: " + deviceType;
    }
    
        
}
