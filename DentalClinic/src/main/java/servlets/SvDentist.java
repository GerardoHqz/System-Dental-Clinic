package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String birthdayString = request.getParameter("birthday");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = sdf.parse(birthdayString);   
        } catch (ParseException ex) {
            Logger.getLogger(SvPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        controller.createDentist(dni,name,lastname,specialty,telephone,direction,birthday);
        
        response.sendRedirect("highDentist.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
