package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controller;
import logic.Dentist;

@WebServlet(name = "SvDentist", urlPatterns = {"/SvDentist"})
public class SvDentist extends HttpServlet {
    
    Controller controller = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Dentist> list_dentist = new ArrayList<Dentist>();
        list_dentist = controller.getDentists();
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("dentist",list_dentist);
        
        response.sendRedirect("showDentist.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String specialty = request.getParameter("specialty");
        String telephone = request.getParameter("telephone");
        String direction = request.getParameter("direction");
        
        controller.createDentist(dni,name,lastname,specialty,telephone,direction);
        
        response.sendRedirect("highDentist.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
