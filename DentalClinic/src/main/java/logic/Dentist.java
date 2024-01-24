package logic;

import java.util.Date;
import java.util.List;

public class Dentist extends Person{
    
    private int id_dentist;
    private String speciality;
    private Users user;
    private Schedule schedule;

    public Dentist() {
    }

    public Dentist(int id_dentist, String speciality, Users user, Schedule schedule, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(dni, name, lastname, telephone, direction, birthday);
        this.id_dentist = id_dentist;
        this.speciality = speciality;
        this.user = user;
        this.schedule = schedule;
    }

    public int getId_dentist() {
        return id_dentist;
    }

    public void setId_dentist(int id_dentist) {
        this.id_dentist = id_dentist;
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
    
    
    
}
