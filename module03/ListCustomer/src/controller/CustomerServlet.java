package controller;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer customer = new Customer("nguyen tat viet", "18/05/1999", "Danang","https://msmobile.com.vn/upload_images/images/tai-hinh-nen-cho-may-tinh-dep-nhat-the-gioi-3.jpg") ;
        Customer customer1 = new Customer("nguyen huyen vy", "18/05/1998", "HaNoi","https://msmobile.com.vn/upload_images/images/tai-hinh-nen-cho-may-tinh-dep-nhat-the-gioi-3.jpg" );
        Customer customer2 = new Customer("nguyen xuan khuong", "18/05/1997", "HaiPhong", "https://msmobile.com.vn/upload_images/images/tai-hinh-nen-cho-may-tinh-dep-nhat-the-gioi-3.jpg");
        Customer customer3 = new Customer("nguyen van a", "18/05/1996", "CanTho", "https://msmobile.com.vn/upload_images/images/tai-hinh-nen-cho-may-tinh-dep-nhat-the-gioi-3.jpg");

        List<Customer> listCustomer = new ArrayList<>();

        listCustomer.add(customer);
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);

        request.setAttribute("customer", listCustomer);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");

        dispatcher.forward(request,response);

    }
}
