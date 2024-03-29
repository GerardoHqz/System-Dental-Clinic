package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Controller;

@WebServlet(name = "SvDeleteDentist", urlPatterns = {"/SvDeleteDentist"})
public class SvDeleteDentist extends HttpServlet {

    Controller controller =  new Controller();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_dentist = Integer.parseInt(request.getParameter("id"));
        
        controller.deleteDentist(id_dentist);
        
        response.sendRedirect("SvDentist");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
