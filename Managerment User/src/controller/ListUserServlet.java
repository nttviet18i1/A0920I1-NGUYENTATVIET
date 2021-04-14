package controller;

import dao.Userlmpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListUserServlet" , urlPatterns = "/list")
public class ListUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Userlmpl userlmpl = new Userlmpl();
        List<User>userList=  userlmpl.getAllUser();
        request.setAttribute("users",userList);
        request.getRequestDispatcher("User/ListUser.jsp").forward(request,response);

    }
}
