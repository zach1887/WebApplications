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
@WebServlet(name = "tempConverter", urlPatterns = {"/convertTemp"})
public class tempConverter extends HttpServlet {

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
            out.println("<title>Servlet tempConverter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tempConverter at " + request.getContextPath() + "</h1>");
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
        String stringInput = request.getParameter("tempInput");
        String TempFrom = request.getParameter("tempFrom");
        String TempTo = request.getParameter("tempTo");

        int tempInput = Integer.parseInt(stringInput);

        double tempOutput;
        String outputField = "Temperature";
        if (TempFrom.equals(TempTo)) {
            tempOutput = tempInput;
        } else if (TempFrom.equals("Fahrenheit") && TempTo.equals("Celsius")) {
            tempOutput = (tempInput - 32.0) * (5.0 / 9.0);
        } else if (TempFrom.equals("Fahrenheit") && TempTo.equals("Kelvin")) {
            tempOutput = (tempInput - 32.0) * (5.0 / 9.0) + 273.14;
        } else if (TempFrom.equals("Kelvin") && TempTo.equals("Celsius")) {
            tempOutput = (tempInput - 273.14);
        } else if (TempFrom.equals("Kelvin") && TempTo.equals("Fahrenheit")) {
            tempOutput = (tempInput - 273.14) * 9.0 / 5.0 + 32;
        } else if (TempFrom.equals("Celsius") && TempTo.equals("Kelvin")) {
            tempOutput = (tempInput + 273.14);
        } else if (TempFrom.equals("Celsius") && TempTo.equals("Fahrenheit")) {
            tempOutput = (tempInput* 9.0) / 5.0 + 32;
        }
        else tempOutput=-555;
        request.setAttribute("OutputField", outputField);
        request.setAttribute("FromField", TempFrom);
        request.setAttribute("ToField", TempTo);
        request.setAttribute("initialValue", tempInput);
        request.setAttribute("convertedValue", tempOutput);
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
