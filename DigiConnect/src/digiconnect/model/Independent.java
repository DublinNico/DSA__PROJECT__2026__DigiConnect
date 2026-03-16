/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.model;

/**
 *
 * @author tonyn
 */
public class Independent extends Resident {
    
    private String completedProgramme;

    public Independent(String completedProgramme, int id, String name, String address, int age, int phone, String digitalBarrier, String status) {
        super(id, name, address, age, phone, digitalBarrier, status);
        this.completedProgramme = completedProgramme;
    }
    
    @Override
    public String getSkillTier() {
        return "Independent";
    }

    public String getCompletedProgramme() {
        return completedProgramme;
    }

    public void setCompletedProgramme(String completedProgramme) {
        this.completedProgramme = completedProgramme;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Completed Programme " + completedProgramme;
    }

    
}
