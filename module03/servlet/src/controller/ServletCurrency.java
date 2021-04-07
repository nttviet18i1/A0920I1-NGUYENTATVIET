package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCurrency",urlPatterns = "/currency")
public class ServletCurrency extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate*usd;

        PrintWriter printWriter= response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>"+rate+"<h1>");
        printWriter.println("<h1>"+usd+"<h1>");
        printWriter.println("<h1>"+vnd+"<h1>");
        printWriter.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/currency.jsp").forward(request, response);
    }
}
