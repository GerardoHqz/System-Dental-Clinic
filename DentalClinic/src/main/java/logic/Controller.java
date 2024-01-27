package logic;

import java.util.List;

public class Controller {
    ControllerPersistence controlPersis = new ControllerPersistence();
    
    public void creatUser(String username, String password, String role){
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
}
