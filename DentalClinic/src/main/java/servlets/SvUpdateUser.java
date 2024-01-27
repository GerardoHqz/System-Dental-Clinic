package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controller;
import logic.Users;

@WebServlet(name = "SvUpdateUser", urlPatterns = {"/SvUpdateUser"})
public class SvUpdateUser extends HttpServlet {
    
    Controller controller = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_user = Integer.parseInt(request.getParameter("id"));
        
        Users users = controller.getUser(id_user);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("update",users);
        
        response.sendRedirect("updateUsers.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        
        Users user = (Users) request.getSession().getAttribute("update");
        
        user.setUsername(username);
        user.setPassword(password);
        user.setRol(role);
        
        controller.updateUser(user);
        
        response.sendRedirect("SvUsers");
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
