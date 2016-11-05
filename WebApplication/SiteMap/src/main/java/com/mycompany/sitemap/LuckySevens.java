/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sitemap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "LuckySevens", urlPatterns = {"/luckySevens"})
public class LuckySevens extends HttpServlet {

    Random rand = new Random();

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
            out.println("<title>Servlet LuckySevens</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LuckySevens at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("luckySevens.jsp").forward(request, response);
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
        String input = request.getParameter("input");
        boolean badInput;
        int numRolls = 0;
        int maxRolls = 0;
        int dieSum;
        int startingBet = 0;
        int maxAmt = 0;
        String msg = "";
        try {
            startingBet = Integer.parseInt(input);
            int currentAmt = startingBet;
            maxAmt = startingBet;
            while (currentAmt >= 1) {
                numRolls++;
                dieSum = rand.nextInt(6) + rand.nextInt(6) + 2;
                if (dieSum == 7) {
                    currentAmt += 4;
                    if (currentAmt > maxAmt) {
                        maxAmt = currentAmt;
                        maxRolls = numRolls;
                    }
                } else {
                    currentAmt--;
                }
            }
        } catch (NumberFormatException e) {
            badInput = true;
            msg = "Can't work with that value.";
        }
        request.setAttribute("rollsUntilBroke", numRolls);
        request.setAttribute("rollsAtHighest", maxRolls);
        request.setAttribute("startingBet", startingBet);
        request.setAttribute("maximumAmountWon", maxAmt);
        request.getRequestDispatcher("output/luckySevensOut.jsp").forward(request, response);

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
