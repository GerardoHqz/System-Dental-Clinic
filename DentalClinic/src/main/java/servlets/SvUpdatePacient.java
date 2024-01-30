package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import logic.Pacient;

@WebServlet(name = "SvUpdatePacient", urlPatterns = {"/SvUpdatePacient"})
public class SvUpdatePacient extends HttpServlet {

    Controller controller = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_patient = Integer.parseInt(request.getParameter("id"));
        
        Pacient patient = controller.getPatient(id_patient);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("update",patient);
        
        response.sendRedirect("updatePatient.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String telephone = request.getParameter("telephone");
        String direction = request.getParameter("direction");
        String birthdayString = request.getParameter("birthday");
        String security_social = request.getParameter("insurance");
        boolean hasInsurance = "SI".equalsIgnoreCase(security_social);
        String blood_type = request.getParameter("bloodType");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = sdf.parse(birthdayString);   
        } catch (ParseException ex) {
            Logger.getLogger(SvPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Pacient patient = (Pacient) request.getSession().getAttribute("update");
        
        patient.setDni(dni);
        patient.setName(name);
        patient.setLastname(lastname);
        patient.setTelephone(telephone);
        patient.setDirection(direction);
        patient.setBirthday(birthday);
        patient.setSocial_security(hasInsurance);
        patient.setBlood_type(blood_type);
        
        controller.updatePatient(patient);
        
        response.sendRedirect("SvPatient");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
