package controller;

import dao.Userlmpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreatUserServlet" ,urlPatterns ="/creat")
public class CreatUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
       User user = new User(id, name, email, country);
        Userlmpl  userlmpl= new Userlmpl();
       userlmpl.insertUser(user);
        response.sendRedirect("ListUser");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("User/createUser.jsp").forward(request, response);
    }
}
