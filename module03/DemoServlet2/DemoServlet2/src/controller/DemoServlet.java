package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DemoServlet", urlPatterns = "/demo") //3.0
public class DemoServlet extends HttpServlet {
    public DemoServlet() {
        super();
        System.out.println("Create servlet");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Init servlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<p>Hello world</p>");
        System.out.println("Execute service");
        printWriter.close();
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet destroy");
    }
}
