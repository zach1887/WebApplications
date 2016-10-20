/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(urlPatterns = {"/TallyInvitation"})
public class RSVP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RSVP</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RSVP at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    ArrayList<String> peopleRSVPd = new ArrayList<>();

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String personWhosComing = request.getParameter("name");
        String rsvp = request.getParameter("rsvp");

        String msg = "";

        if ("ja".equals(rsvp)) {     //  this works because the literal "da" is first
            if (personWhosComing != null && !personWhosComing.equals("")) {
                msg = "Cool... but bring food.  And maybe a few drinks as well, " + personWhosComing;
                peopleRSVPd.add(personWhosComing);
            } else {
                msg = "Hey, mystery man... can't RSVP without a name!";
            }

        } else if ("nein".equals(rsvp)) {
            msg = "Fine, whatever.... catch ya later";
        } else {
            request.setAttribute("badInput", true);
            msg = "Something didn't work.  Please try again.";
        }
        request.setAttribute("partyList", peopleRSVPd);
        request.setAttribute("msgInABottle", msg);
        // FORWARD THE REQUEST 
//        RequestDispatcher forwarder = request.getRequestDispatcher("response.jsp");
//        forwarder.forward(request, response);

        request.getRequestDispatcher("response.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
