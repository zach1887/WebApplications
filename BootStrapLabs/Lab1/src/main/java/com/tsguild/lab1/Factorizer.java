/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "Factorizer", urlPatterns = {"/", "/Factorizer"})
public class Factorizer extends HttpServlet {

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
            out.println("<title>Servlet Factorizer</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Factorizer at " + request.getContextPath() + "</h1>");
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
        String givenNumber = request.getParameter("input");
        String msg = "";
        ArrayList<Integer> factors = new ArrayList<>();
        boolean badInput;
        int numFactors = 0;
        int sumFactors = 0;
        boolean isPrime, isPerfect;
        try {
            int valueInt = Integer.parseInt(givenNumber);
            for (int k = 1; k <= valueInt / 2; k++) {  //no need to check factors greater than half the userInput

                if (valueInt % k == 0) {
                    factors.add(k);
                    numFactors++;
                    sumFactors += k;
                }
            }
            isPrime = (numFactors == 1);
            isPerfect = (sumFactors == valueInt);
            request.setAttribute("providedNumber", valueInt);
            request.setAttribute("listOfFactors", factors);
            request.setAttribute("perfectNumber", isPerfect);
            request.setAttribute("primeNumber", isPrime);
            request.setAttribute("numFactors", numFactors);
            request.setAttribute("badInput", "all set");
        } catch (NumberFormatException e) {
            request.setAttribute("badInput", true);
            request.setAttribute("msg", "Can't understand that input.");
        }

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
    }

}
