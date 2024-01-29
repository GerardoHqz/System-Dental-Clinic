package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dentist extends Person implements Serializable{
    
    //private int id_dentist;
    private String speciality;
    @OneToOne
    private Users user;
    @OneToOne
    private Schedule schedule;
    @OneToMany(mappedBy="dentist")
    private List<Shift>shifts;

    public Dentist() {
    }

    public Dentist(String speciality, Users user, Schedule schedule, List<Shift> shifts, int id_, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(id_, dni, name, lastname, telephone, direction, birthday);
        this.speciality = speciality;
        this.user = user;
        this.schedule = schedule;
        this.shifts = shifts;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
    
}
