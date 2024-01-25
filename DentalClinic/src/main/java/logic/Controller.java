package logic;

public class Controller {
    ControllerPersistence controlPersis = new ControllerPersistence();
    
    public void creatUser(int id_,String username, String password, String role){
        Users user = new Users(id_,username,password,role);
        controlPersis.createUser(user);
    }
}
