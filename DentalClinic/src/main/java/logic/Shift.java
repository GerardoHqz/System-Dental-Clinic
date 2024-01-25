package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Shift implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_shift;
    private Date shift_date;
    private String shift_hour;
    private String reason;
    @ManyToOne
    @JoinColumn(name="id_shift")
    private Dentist dentist;
    @ManyToOne
    @JoinColumn(name="id_shift")
    private Pacient pacient;
    
    
    public Shift() {
    }

    public Shift(int id_shift, Date shift_date, String shift_hour, String reason) {
        this.id_shift = id_shift;
        this.shift_date = shift_date;
        this.shift_hour = shift_hour;
        this.reason = reason;
    }

    public int getId_shift() {
        return id_shift;
    }

    public void setId_shift(int id_shift) {
        this.id_shift = id_shift;
    }

    public Date getShift_date() {
        return shift_date;
    }

    public void setShift_date(Date shift_date) {
        this.shift_date = shift_date;
    }

    public String getShift_hour() {
        return shift_hour;
    }

    public void setShift_hour(String shift_hour) {
        this.shift_hour = shift_hour;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
