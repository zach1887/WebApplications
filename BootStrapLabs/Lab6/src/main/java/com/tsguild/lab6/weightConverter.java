/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.lab6;

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
@WebServlet(name = "weightConverter", urlPatterns = {"/convertWeight"})
public class weightConverter extends HttpServlet {

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
            out.println("<title>Servlet weightConverter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet weightConverter at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("input.jsp").forward(request, response);
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
        String stringWeight = request.getParameter("weightInput");
        String weightFrom = request.getParameter("weightFrom");
        String weightTo = request.getParameter("weightTo");

        int weightInput = Integer.parseInt(stringWeight);
        double weightOutput;
        String outputField = "Weight";
        if (weightFrom.equals(weightTo)) {
            weightOutput = weightInput;
        } else if (weightFrom.equals("Kilogram") && weightTo.equals("Gram")) {
            weightOutput = 1000 * weightInput;
        } else if (weightFrom.equals("Kilogram") && weightTo.equals("Pound")) {
            weightOutput = (1000.0 / 454.0) * weightInput;
        } else if (weightFrom.equals("Kilogram") && weightTo.equals("Ounce")) {
            weightOutput = (1000 * 16.0 / 454.0) * weightInput;
        } else if (weightFrom.equals("Gram") && weightTo.equals("Kilogram")) {
            weightOutput = weightInput / 1000.0;
        } else if (weightFrom.equals("Gram") && weightTo.equals("Pound")) {
            weightOutput = weightInput / 454.0;
        } else if (weightFrom.equals("Gram") && weightTo.equals("Ounce")) {
            weightOutput = 16 * weightInput / 454.0;
        } else {
            weightOutput = 0;
        }

        request.setAttribute("OutputField", outputField);
        request.setAttribute("FromField", weightFrom);
        request.setAttribute("ToField", weightTo);
        request.setAttribute("initialValue", weightInput);
        request.setAttribute("convertedValue", weightOutput);
        request.getRequestDispatcher("output.jsp").forward(request, response);
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
