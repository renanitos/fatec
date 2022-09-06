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
@WebServlet(name = "TabuadaServlet", urlPatterns = {"/tabuada.html"})
public class TabuadaServlet extends HttpServlet {

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
        String multiplicador = request.getParameter("multiplicador");
        Integer multiplicadorInt = 0;
        String maximoNum = request.getParameter("maximo");
        Integer maximoNumInt = 0;
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tabuada ADS - POO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html' " +
            "            style='text-decoration:None;'>Voltar</a></h4>");
            out.println("<form action=\"tabuada.html\">\n" +
            "            <label>Multiplicador</label>\n" +
            "            <br>\n" +
            "            <input type=\"number\" name=\"multiplicador\" " +
            "            value=\"\"/>\n" +
            "            <br>\n" +
            "            <label>Máximo de Números</label>\n" +
            "            <br>\n" +
            "            <input type=\"number\" name=\"maximo\" value=\"\"/>\n"+
            "            <br>\n" +
            "            <input type=\"submit\" value=\"Gerar\"/>\n" +
            "            </form>");
            out.println("<h2>Tabuada</h2>");
            out.println("<table border='1'>");
            try{
                multiplicadorInt = Integer.parseInt(multiplicador);
            }catch (Exception ex){
                out.println("<div style='color:red'></div");
            }
            try{
                maximoNumInt = Integer.parseInt(maximoNum);
            }catch (Exception ex){
                out.println("<div style='color:red'></div");
            }
            for(int i=1;i<=maximoNumInt;i++){
                out.println("<tr>");
                out.println("<td>" + multiplicadorInt + "</td>");
                out.println("<td>x " + i + "</td>");
                out.println("<td>= " + multiplicadorInt*i + "</td>");
                out.println("<tr>");
            }
            out.println("</table>");
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
