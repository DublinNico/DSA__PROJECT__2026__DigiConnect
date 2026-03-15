/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.model;

/**
 *
 * @author tonyn
 */
public abstract class Resident {
    private int id;
    private String name;
    private String address;
    private int age;
    private int phone;
    private String digitalBarrier;
    private String status;
    
    public Resident(int id, String name, String address, int age, int phone, String digitalBarrier, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.digitalBarrier = digitalBarrier;
        this.status = status;
    }
    
    // Abstract method all subclasses must override
    public abstract String getSkillTier();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public String getDigitalBarrier() {
        return digitalBarrier;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDigitalBarrier(String digitalBarrier) {
        this.digitalBarrier = digitalBarrier;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // toString
    @Override
    public String toString() {
        return "[" + id + "[" + name + " | " + getSkillTier() + " | " + status;
    }
    
}
