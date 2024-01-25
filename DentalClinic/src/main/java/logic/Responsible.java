package logic;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsible extends Person{
    
    //private int id_responsable;
    private String relationship;

    public Responsible() {
    }

    public Responsible(String relationship, int id_, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(id_, dni, name, lastname, telephone, direction, birthday);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
}
