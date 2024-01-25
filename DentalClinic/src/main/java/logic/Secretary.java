package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretary extends Person{
    
    //private int id_secretary;
    private String sector;
    @OneToOne
    private Users user;

    public Secretary() {
    }

    public Secretary(String sector, Users user, int id_, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(id_, dni, name, lastname, telephone, direction, birthday);
        this.sector = sector;
        this.user = user;
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
