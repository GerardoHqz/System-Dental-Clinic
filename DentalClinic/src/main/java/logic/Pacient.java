package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pacient extends Person implements Serializable{
    
    //private int id_patient;
    private Boolean social_security;
    private String blood_type;
    @OneToOne
    private Responsible responsible;
    @OneToMany(mappedBy="pacient")
    private List<Shift> shifts;

    public Pacient() {
    }

    public Pacient(Boolean social_security, String blood_type, Responsible responsible, List<Shift> shifts, int id_, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(id_, dni, name, lastname, telephone, direction, birthday);
        this.social_security = social_security;
        this.blood_type = blood_type;
        this.responsible = responsible;
        this.shifts = shifts;
    }

    public Boolean getSocial_security() {
        return social_security;
    }

    public void setSocial_security(Boolean social_security) {
        this.social_security = social_security;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
    
 
}
