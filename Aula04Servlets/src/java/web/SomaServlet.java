/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "SomaServlet", urlPatterns = {"/soma.html"})
public class SomaServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            String num1 = request.getParameter("num1");
            Double num1Convertido = 0.0;
            String num2 = request.getParameter("num2");
            Double num2Convertido = 0.0;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html' " +
            "            style='text-decoration:None;'>Voltar</a></h4>");
            try{
                num1Convertido = Double.parseDouble(num1);
            }catch (Exception ex){
                out.println("<div style='color:red'></div");
            }
            try{
                num2Convertido = Double.parseDouble(num2);
            }catch (Exception ex){
                out.println("<div style='color:red'></div");
            }
            out.println("<form action=\"soma.html\">\n" +
            "            <input type=\"number\" name=\"num1\" step=\"0.1\" " +
            "            value=\"2\"/>\n" + " <label>+</label>\n" +
            "            <input type=\"number\" name=\"num2\" step=\"0.1\" " +
            "            value=\"2\"/>\n" +
            "            <input type=\"submit\" value=\"=\"/>\n" +
            "            </form>");
            out.println("<h2> O resultado de " + num1Convertido + " + " +
                num2Convertido + " = " + (num1Convertido + num2Convertido) + 
                "</h2>");
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
