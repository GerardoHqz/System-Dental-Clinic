package logic;

import java.util.Date;
import java.util.List;

public class Pacient extends Person{
    
    private int id_patient;
    private Boolean social_security;
    private String blood_type;
    private Responsible responsible;
    private List<Shift> shifts;

    public Pacient() {
    }

    public Pacient(int id_patient, Boolean social_security, String blood_type, Responsible responsible, List<Shift> shifts, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(dni, name, lastname, telephone, direction, birthday);
        this.id_patient = id_patient;
        this.social_security = social_security;
        this.blood_type = blood_type;
        this.responsible = responsible;
        this.shifts = shifts;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
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
