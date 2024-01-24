package logic;

public class Schedule {
    
    private int id_schedule;
    private String start_time;
    private String finish_time;

    public Schedule() {
    }

    public Schedule(int id_schedule, String start_time, String finish_time) {
        this.id_schedule = id_schedule;
        this.start_time = start_time;
        this.finish_time = finish_time;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(String finish_time) {
        this.finish_time = finish_time;
    }
    
}
