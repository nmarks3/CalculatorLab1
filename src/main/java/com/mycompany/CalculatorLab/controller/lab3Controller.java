/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.CalculatorLab.controller;

import com.mycompany.CalculatorLab.model.lab1Service;
import com.mycompany.CalculatorLab.model.lab2Service;
import com.mycompany.CalculatorLab.model.lab3Service;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nolan
 */
@WebServlet(name = "lab3Controller", urlPatterns = {"/lab3Controller"})
public class lab3Controller extends HttpServlet {

    private static final String LENGTH = "rLength";
    private static final String WIDTH = "rWidth";
    private static final String HOME_PAGE = "/lab3.jsp";
    private static final String RADIUS = "radius";
    private static final String TX = "tx";
    private static final String TY = "ty";
    private static final String CALC_TYPE = "calcType";
    private static final String RECTANGLE = "rectangleForm";
    private static final String CIRCLE = "circleForm";
    private static final String TRIANGLE = "triangleForm";

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

        String calcType = request.getParameter(CALC_TYPE);
        lab3Service ls = null;

        try {
                        
            ls = new lab3Service();

            double recArea = 0;
            double cirArea = 0;
            double hyp = 0;

            double length = Double.parseDouble(request.getParameter(LENGTH));
            double width = Double.parseDouble(request.getParameter(WIDTH));
            
            double radius = Double.parseDouble(request.getParameter(RADIUS));
            
            double tx = Double.parseDouble(request.getParameter(TX));
            double ty = Double.parseDouble(request.getParameter(TY));

            if (calcType.equals(RECTANGLE)) {

                recArea = ls.calculateAreaRectangle(length, width);
                request.setAttribute("recResult", "The Area of the Rectangle is:");
                request.setAttribute("recMsg", recArea);
                out.println("RECTANGLE");

            } else if (calcType.equals(CIRCLE)) {

                cirArea = ls.calculateAreaCircle(radius);
                request.setAttribute("cirResult", "The Area of the Circle is:");
                request.setAttribute("cirMsg", cirArea);
                out.println("CIRCLE");

            } else if (calcType.equals(TRIANGLE)) {

                hyp = ls.calculateHypTriangle(tx, ty);
                request.setAttribute("triResult", "The Value of the Hypotenuse is:");
                request.setAttribute("triMsg", hyp);

            }

        } catch (Exception e) {
            request.setAttribute("errMsg", e.getMessage());
        }

        RequestDispatcher view = request.getRequestDispatcher(HOME_PAGE);
        view.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
