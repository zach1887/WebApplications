/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sitemap;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesse
 */
@WebServlet(name = "TipCalculator", urlPatterns = {"/tipCalc"})
public class TipCalculator extends HttpServlet {

    DecimalFormat df = new DecimalFormat("#.00");

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
            out.println("<title>Servlet TipCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TipCalculator at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("tipCalc.jsp").forward(request, response);
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
        String bill = request.getParameter("input");
        String tip = request.getParameter("tipPct");
        boolean badInput;
        String msg = "";
        double billAmt = 0, tipPct = 0, tipAmt = 0, totalAmt = 0;

        try {
            billAmt = Double.parseDouble(bill);
            tipPct = Double.parseDouble(tip);

            tipAmt = (billAmt * tipPct) / 100;
            totalAmt = tipAmt + billAmt;

        } catch (NumberFormatException e) {
            badInput = true;
            msg = "We had some problems with your input";
        }

        request.setAttribute(
                "BillPreTip", df.format(billAmt));
        request.setAttribute(
                "TipPercent", df.format(tipPct));
        request.setAttribute(
                "TipAmount", df.format(tipAmt));
        request.setAttribute(
                "TotalAmount", df.format(totalAmt));
         request.getRequestDispatcher("output/tipCalcOut.jsp").forward(request, response);
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
