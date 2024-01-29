package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        String security_social = request.getParameter("insurance");
        String blood_type = request.getParameter("bloodType");
        boolean insurance = false;
        if ("SI".equalsIgnoreCase(security_social)) {
            insurance = true;
        }
        
        String responsible = request.getParameter("responsible");
        
        controller.createPatient(dni,name,lastname,telephone,direction,insurance,blood_type,responsible);
        
        response.sendRedirect("highPatient.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
