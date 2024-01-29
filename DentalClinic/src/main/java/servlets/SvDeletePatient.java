package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Controller;

@WebServlet(name = "SvDeletePatient", urlPatterns = {"/SvDeletePatient"})
public class SvDeletePatient extends HttpServlet {

    Controller controller = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_patient = Integer.parseInt(request.getParameter("id"));
        
        controller.deletePatient(id_patient);
        
        response.sendRedirect("SvPatient");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
