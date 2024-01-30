package logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {

    ControllerPersistence controlPersis = new ControllerPersistence();

    //USERS
    public void creatUser(String username, String password, String role) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setRol(role);
        controlPersis.createUser(user);
    }

    public List<Users> getUsers() {
        return controlPersis.getusers();
    }

    public void deleteUser(int id_user) {
        controlPersis.deleteUser(id_user);
    }

    public Users getUser(int id_user) {
        return controlPersis.getUser(id_user);
    }

    public void updateUser(Users user) {
        controlPersis.updateUser(user);
    }

    // DENTISTS
    public List<Dentist> getDentists() {
        return controlPersis.getDentists();
    }

    public void createDentist(String dni, String name, String lastname, String specialty, String telephone, String direction, Date birthday) {
        Dentist dentist = new Dentist();
        dentist.setDni(dni);
        dentist.setName(name);
        dentist.setLastname(lastname);
        dentist.setSpeciality(specialty);
        dentist.setTelephone(telephone);
        dentist.setDirection(direction);
        dentist.setBirthday(birthday);
        controlPersis.createDentist(dentist);
    }

    public Dentist getDentist(int id_dentist) {
        return controlPersis.getDentist(id_dentist);
    }

    public void updateDentist(Dentist dentist) {
        controlPersis.updateDentist(dentist);
    }

    public void deleteDentist(int id_dentist) {
        controlPersis.deleteDentist(id_dentist);
    }

    //PATIENTS
    public List<Pacient> getPatients() {
        return controlPersis.getPatients();
    }

    public void createPatient(String dni, String name, String lastname, String telephone, String direction, Date birthday, boolean insurance, String blood_type) {
        Pacient patient = new Pacient();
        patient.setDni(dni);
        patient.setName(name);
        patient.setLastname(lastname);
        patient.setTelephone(telephone);
        patient.setDirection(direction);
        patient.setBirthday(birthday);
        patient.setSocial_security(insurance);
        patient.setBlood_type(blood_type);

        controlPersis.createPatient(patient);
    }

    public void deletePatient(int id_patient) {
        controlPersis.deletePatient(id_patient);
    }

    public Pacient getPatient(int id_patient) {
        return controlPersis.getPatients(id_patient);
    }

    public void updatePatient(Pacient patient) {
        controlPersis.updatePatient(patient);
    }

    //LOGIN
    public boolean checkLogin(String username, String password) {
        List<Users> users_list = new ArrayList<Users>();
        users_list = controlPersis.getusers();
        
        boolean band = false;
        
        for (Users usu : users_list) {
            if (usu.getUsername().equals(username)) {
                if(usu.getPassword().equals(password))
                    band = true;
            }
        }
        
        return band;
    }
}
