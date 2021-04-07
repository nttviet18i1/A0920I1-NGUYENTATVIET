package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servletproduct",urlPatterns = "/product")
public class Servletproduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float discount= Float.parseFloat(request.getParameter("discount"));
        float amount= (float) (price*discount*0.01);
        PrintWriter printWriter= response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>"+price+"<h1>");
        printWriter.println("<h1>"+discount+"<h1>");
        printWriter.println("<h1>"+amount+"<h1>");
        printWriter.println("</html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/productdiscout.jsp").forward(request,response);

    }
}
