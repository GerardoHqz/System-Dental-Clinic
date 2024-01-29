package logic;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.DentistJpaController;
import persistence.PacientJpaController;
import persistence.PersonJpaController;
import persistence.ScheduleJpaController;
import persistence.SecretaryJpaController;
import persistence.ShiftJpaController;
import persistence.UsersJpaController;
import persistence.exceptions.NonexistentEntityException;

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

    List<Users> getusers() {
        return usersJPA.findUsersEntities();
    }

    void deleteUser(int id_user) {
        try {
            usersJPA.destroy(id_user);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Users getUser(int id_user) {
        return usersJPA.findUsers(id_user);
    }

    void updateUser(Users user) {
        try {
            usersJPA.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<Dentist> getDentists() {
        List<Dentist> dentistList = dentistJPA.findDentistEntities();
        System.out.println("Dentist List: " + dentistList);
        return dentistList;
        //return dentistJPA.findDentistEntities();
    }

    void createDentist(Dentist dentist) {
        dentistJPA.create(dentist);
    }

    Dentist getDentist(int id_dentist) {
        return dentistJPA.findDentist(id_dentist);
    }

    void updateDentist(Dentist dentist) {
        try {
            dentistJPA.edit(dentist);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteDentist(int id_dentist) {
        try {
            dentistJPA.destroy(id_dentist);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<Pacient> getPatients() {
        return pacientJPA.findPacientEntities();
    }

    void createPatient(Pacient patient) {
        pacientJPA.create(patient);
    }

    void deletePatient(int id_patient) {
        try {
            pacientJPA.destroy(id_patient);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Pacient getPatients(int id_patient) {
        return pacientJPA.findPacient(id_patient);
    }

    void updatePatient(Pacient patient) {
        try {
            pacientJPA.edit(patient);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
