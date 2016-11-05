/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sitemap;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesse
 */
@WebServlet(name = "distConverter", urlPatterns = {"/convertDist"})
public class distConverter extends HttpServlet {

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
            out.println("<title>Servlet distConverter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet distConverter at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("unitConverter.jsp").forward(request, response);
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
        String stringDistance = request.getParameter("distInput");
        String distFrom = request.getParameter("distFrom");
        String distTo = request.getParameter("distTo");
        final double CONV_FT_TO_IN = 12;
        final double CONV_IN_TO_CM = 2.54;
        final double CONV_M_TO_CM = 100;
        final double CONV_IN_T0_M = CONV_IN_TO_CM/CONV_M_TO_CM;
        final double CONV_FT_T0_M = CONV_FT_TO_IN*CONV_IN_T0_M;
        final double CONV_FT_T0_CM = CONV_FT_T0_M*CONV_M_TO_CM;

        int distInput = Integer.parseInt(stringDistance);
        double distOutput;
        String outputField = "Distance";

        if (distFrom.equals(distTo)) {
            distOutput = distInput;
        } else if (distFrom.equals("Meter") && distTo.equals("Centimeter")) {
            distOutput = CONV_M_TO_CM * distInput;
        } else if (distFrom.equals("Centimeter") && distTo.equals("Meter")) {
            distOutput = distInput / CONV_M_TO_CM;

        } else if (distFrom.equals("Meter") && distTo.equals("Feet")) {
            distOutput = distInput / CONV_FT_T0_M;
        } else if (distFrom.equals("Feet") && distTo.equals("Meter")) {
            distOutput = CONV_FT_T0_M * distInput;

        } else if (distFrom.equals("Meter") && distTo.equals("Inches")) {
            distOutput = distInput / CONV_IN_T0_M;
        } else if (distFrom.equals("Inches") && distTo.equals("Meter")) {
            distOutput = CONV_IN_T0_M * distInput;

        } else if (distFrom.equals("Feet") && distTo.equals("Inches")) {
            distOutput = distInput * CONV_FT_TO_IN;
        } else if (distFrom.equals("Inches") && distTo.equals("Feet")) {
            distOutput = distInput / CONV_FT_TO_IN;

        } else if (distFrom.equals("Centimeter") && distTo.equals("Inches")) {
            distOutput = distInput / CONV_IN_TO_CM;
        } else if (distFrom.equals("Inches") && distTo.equals("Centimeter")) {
            distOutput = distInput * CONV_IN_TO_CM;

        } else if (distFrom.equals("Centimeter") && distTo.equals("Feet")) {
            distOutput = distInput / CONV_FT_T0_CM;
        } else if (distFrom.equals("Feet") && distTo.equals("Centimeter")) {
            distOutput = distInput * CONV_FT_T0_CM;
        } else {
            distOutput = 0;
        }

        request.setAttribute("OutputField", outputField);
        request.setAttribute("FromField", distFrom);
        request.setAttribute("ToField", distTo);
        request.setAttribute("initialValue", distInput);
        request.setAttribute("convertedValue", distOutput);
        request.getRequestDispatcher("output/unitConverterOut.jsp").forward(request, response);
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
