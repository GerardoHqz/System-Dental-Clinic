package logic;

public class Controller {
    ControllerPersistence controlPersis = new ControllerPersistence();
    
    public void creatUser(String username, String password, String role){
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setRol(role);
        controlPersis.createUser(user);
    }
}
