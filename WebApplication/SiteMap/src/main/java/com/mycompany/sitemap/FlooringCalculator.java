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
@WebServlet(name = "FlooringCalculator", urlPatterns = { "/flooringCalc"})
public class FlooringCalculator extends HttpServlet {

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
            out.println("<title>Servlet FlooringCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FlooringCalculator at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("flooringCalc.jsp").forward(request, response);

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
        String stringLength = request.getParameter("length");
        String stringWidth = request.getParameter("width");
        String stringCost = request.getParameter("matCost");
        final double LABOR_COST_PER_HR = 86;

        double length = Double.parseDouble(stringLength);
        double width = Double.parseDouble(stringWidth);
        double cost = Double.parseDouble(stringCost);

        boolean badInput;
        String msg = "";

        if (width <= 0 || length <= 0 || cost < 0) {
            badInput = true;
            msg = "All inputs must be positive.";
        } else {
            double area = length * width;
            double matCost = cost * area;
            double labCost = (Math.ceil(area / 20)) * LABOR_COST_PER_HR / 4;

            request.setAttribute("Area", area);
            request.setAttribute("MaterialCost", matCost);
            request.setAttribute("LaborCost", labCost);
            request.setAttribute("TotalCost", matCost + labCost);
            request.getRequestDispatcher("output/flooringCalcOut.jsp").forward(request, response);
        }


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
