package logic;

import persistence.DentistJpaController;
import persistence.PacientJpaController;
import persistence.PersonJpaController;
import persistence.ScheduleJpaController;
import persistence.SecretaryJpaController;
import persistence.ShiftJpaController;
import persistence.UsersJpaController;

public class ControllerPersistence {
    
    DentistJpaController dentistJPA = new DentistJpaController();
    PacientJpaController pacientJPA = new PacientJpaController();
    PersonJpaController personJPA = new PersonJpaController();
    ScheduleJpaController scheduleJPA = new ScheduleJpaController();
    SecretaryJpaController secretaryJPA = new SecretaryJpaController();
    ShiftJpaController shiftJPA = new ShiftJpaController();
    UsersJpaController usersJPA = new UsersJpaController();

    public ControllerPersistence() {
    }
     
    
    void createUser(Users user) {
        usersJPA.create(user);
    }
    
    
}
