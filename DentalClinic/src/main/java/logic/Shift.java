package logic;

import java.util.Date;

public class Shift {
    
    private int id_shift;
    private Date shift_date;
    private String shift_hour;
    private String reason;

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
