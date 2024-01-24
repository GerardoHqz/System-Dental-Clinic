package logic;

import java.util.Date;

public class Secretary extends Person{
    
    private int id_secretary;
    private String sector;
    private Users user;

    public Secretary() {
    }

    public Secretary(int id_secretary, String sector, Users user, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(dni, name, lastname, telephone, direction, birthday);
        this.id_secretary = id_secretary;
        this.sector = sector;
        this.user = user;
    }

    public int getId_secretary() {
        return id_secretary;
    }

    public void setId_secretary(int id_secretary) {
        this.id_secretary = id_secretary;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
    
}
