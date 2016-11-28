/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.sitemapmvc.applet;

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
@WebServlet(name = "currencyConverter", urlPatterns = {"/convertCurrency"})
public class currencyConverter extends HttpServlet {

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
            out.println("<title>Servlet currencyConverter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet currencyConverter at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("jsp/unitConverter.jsp").forward(request, response);
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
        String stringCurrency = request.getParameter("currencyInput");
        String currencyFrom = request.getParameter("currencyFrom");
        String currencyTo = request.getParameter("currencyTo");

        int currencyInput = Integer.parseInt(stringCurrency);
        double currencyOutput;
        String outputField = "Currency";
        if (currencyFrom.equals(currencyTo)) {
            currencyOutput = currencyInput;
        } else if (currencyFrom.equals("USDollar") && currencyTo.equals("Euro")) {
            currencyOutput = currencyInput * 0.90;
        } else if (currencyFrom.equals("USDollar") && currencyTo.equals("Yen")) {
            currencyOutput = 103.4 * currencyInput;
        } else if (currencyFrom.equals("Euro") && currencyTo.equals("USDollar")) {
            currencyOutput = currencyInput / 0.90;
        } else if (currencyFrom.equals("Euro") && currencyTo.equals("Yen")) {
            currencyOutput = currencyInput * 114.76;
        } else if (currencyFrom.equals("Yen") && currencyTo.equals("USDollar")) {
            currencyOutput = currencyInput / 103.4;
        } else if (currencyFrom.equals("Yen") && currencyTo.equals("Euro")) {
            currencyOutput = currencyInput / 114.76;

        } else {
            currencyOutput = 0;
        }

        request.setAttribute("OutputField", outputField);
        request.setAttribute("FromField", currencyFrom);
        request.setAttribute("ToField", currencyTo);
        request.setAttribute("initialValue", currencyInput);
        request.setAttribute("convertedValue", currencyOutput);
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
