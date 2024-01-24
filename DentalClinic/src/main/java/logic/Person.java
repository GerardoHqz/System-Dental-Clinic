package logic;

import java.util.Date;

public class Person {
    
    private String dni;
    private String name;
    private String lastname;
    private String telephone;
    private String direction;
    private Date birthday;

    public Person() {
    }

    public Person(String dni, String name, String lastname, String telephone, String direction, Date birthday) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
        this.direction = direction;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}
