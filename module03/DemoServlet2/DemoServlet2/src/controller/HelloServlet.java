package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("name", "Thang");
        request.setAttribute("error", "Sai mat khau");
        request.setAttribute("dtb", 4);
        List<String> listName = new ArrayList<>();
        listName.add("Tien");
        listName.add("Tan");
        listName.add("Viet");
        request.setAttribute("listNames", listName);
        request.getRequestDispatcher("jsp/sample.jsp").forward(request, response);
    }
}
