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
import logic.Pacient;

@WebServlet(name = "SvPatient", urlPatterns = {"/SvPatient"})
public class SvPatient extends HttpServlet {

    Controller controller = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Pacient> list_patients = new ArrayList<Pacient>();
        list_patients = controller.getPatients();

        HttpSession mysession = request.getSession();
        mysession.setAttribute("patients", list_patients);

        response.sendRedirect("showPatients.jsp");

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
        String blood_type = request.getParameter("bloodType");
        boolean hasInsurance = "SI".equalsIgnoreCase(security_social);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");;
        Date birthday = null;
        try {
            birthday = sdf.parse(birthdayString);   
        } catch (ParseException ex) {
            Logger.getLogger(SvPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(birthdayString);
        System.out.println(birthday);
        
        controller.createPatient(dni,name,lastname,telephone,direction,birthday,hasInsurance,blood_type);
        
        response.sendRedirect("highPatient.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
