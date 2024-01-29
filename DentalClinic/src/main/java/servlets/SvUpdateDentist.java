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
import logic.Dentist;

@WebServlet(name = "SvUpdateDentist", urlPatterns = {"/SvUpdateDentist"})
public class SvUpdateDentist extends HttpServlet {

    Controller controller = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_dentist = Integer.parseInt(request.getParameter("id"));
        
        Dentist dentist = controller.getDentist(id_dentist);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("update",dentist);
        
        response.sendRedirect("updateDentist.jsp");
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
        
        Dentist dentist = (Dentist) request.getSession().getAttribute("update");
        
        dentist.setDni(dni);
        dentist.setName(name);
        dentist.setLastname(lastname);
        dentist.setSpeciality(specialty);
        dentist.setTelephone(telephone);
        dentist.setDirection(direction);
        
        controller.updateDentist(dentist);
        
        response.sendRedirect("SvDentist");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
