/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.sitemapmvc.applet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesse
 */
@WebServlet(name = "InterestCalculator", urlPatterns = {"/interestCalc"})
public class InterestCalculator extends HttpServlet {

    DecimalFormat df = new DecimalFormat("#.00");
//    ArrayList<Integer> yearNumber = new ArrayList();
//    ArrayList<Double> endYearTotal = new ArrayList();
//    ArrayList<Double> yearlyInterest = new ArrayList();

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
        request.getRequestDispatcher("jsp/interestCalc.jsp").forward(request, response);
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
        String strPrincipal = request.getParameter("principal");
        String strRate = request.getParameter("rate");
        String strYears = request.getParameter("years");
        String strCompounds = request.getParameter("compounds");

        double principal = Double.parseDouble(strPrincipal);
        double rate = Double.parseDouble(strRate);
        double years = Double.parseDouble(strYears);

        int numCompounds = 1;

        if (null != strCompounds) {
            switch (strCompounds) {
                case "year":
                    numCompounds = 1;
                    break;
                case "quarter":
                    numCompounds = 4;
                    break;
                case "month":
                    numCompounds = 12;
                    break;
                case "day":
                    numCompounds = 365;
                    break;
                default:
                    numCompounds = 0;  // this will cause an error in the calculations
                    break;
            }
        }
        double runningAmt = principal;
        double interest = 0;

        ArrayList<Year> yearsRecords = new ArrayList<>();

        for (int i = 1; i <= numCompounds * years; i++) {
            interest += runningAmt * (rate / (numCompounds * 100));
            runningAmt = runningAmt * (1 + rate / (numCompounds * 100));
            if (i % numCompounds == 0) {
                Year temp = new Year();
                temp.setYearNumber(i / numCompounds);
                temp.setYearEndAmt(runningAmt);
                temp.setYearlyInterest(interest);
                interest = 0;
                yearsRecords.add(temp);
            }
        }
        request.setAttribute("Principal", df.format(principal));
        request.setAttribute("NumYears", years);
        request.setAttribute("InterestRate", rate);
        request.setAttribute("YearArray", yearsRecords);
//        request.setAttribute("EndOfYearAmt");
//        request.setAttribute("YearlyInterest");
        request.getRequestDispatcher("output/interestCalcOut.jsp").forward(request, response);

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
