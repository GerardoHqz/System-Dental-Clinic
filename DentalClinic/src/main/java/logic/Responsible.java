package logic;

import java.util.Date;

public class Responsible extends Person{
    
    private int id_responsable;
    private String relationship;

    public Responsible() {
    }

    public Responsible(int id_responsable, String relationship, String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        super(dni, name, lastname, telephone, direction, birthday);
        this.id_responsable = id_responsable;
        this.relationship = relationship;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
}
