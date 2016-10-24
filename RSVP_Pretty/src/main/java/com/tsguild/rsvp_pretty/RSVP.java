/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.rsvp_pretty;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "RSVP", urlPatterns = {"/RSVP"})
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

    }

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
        String whosComing;
        String ifTheyreComing;
        String llamasBeingBrought;  // will eventually be parsed as an integer
        // then we need to GET the information from the parameters

        whosComing = request.getParameter("name");
        ifTheyreComing = request.getParameter("RSVP");
        llamasBeingBrought = request.getParameter("llamas");

        //Don't trust user input or the process could explode
        int llamasBrought = Integer.parseInt(llamasBeingBrought);

        if (whosComing == null || whosComing.isEmpty()) {
            request.setAttribute("msg", "No name, no confirmation, dawg.");
        } else if (ifTheyreComing == null || ifTheyreComing.isEmpty()) {
            request.setAttribute("msg", "Need an answer, dumbass.");
        } else if("fosho".equals(ifTheyreComing)) {
            request.setAttribute("msg", "Awesome... bring a 40.");
        } else if("nah".equals(ifTheyreComing)) {
            request.setAttribute("msg", "Whatever... you still owe me a 40.");
        }
        
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
