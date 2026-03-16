/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digiconnect.model;

/**
 *
 * @author tonyn
 */
public class Developing extends Resident {
    
    private String targetSkill;
    // skill the resident is working with

    public Developing(int id, String name, String address, int age, int phone, String digitalBarrier, String status) {
        super(id, name, address, age, phone, digitalBarrier, status);
        this.targetSkill = targetSkill;
    }
    
    @Override
    public String getSkillTier(){
        return "Developing";
    }

    public String getTargetSkill() {
        return targetSkill;
    }

    public void setTargetSkill(String targetSkill) {
        this.targetSkill = targetSkill;
    }
    
    @Override
    public String toString() {
      return super.toString() + " | Target Skill: " + targetSkill;
    }  
}
