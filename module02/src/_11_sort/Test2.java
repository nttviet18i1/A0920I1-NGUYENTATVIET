package _11_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(2,"C")); //1
        customerList.add(new Customer(1,"A")); //0
        customerList.add(new Customer(5,"A")); //0
        customerList.add(new Customer(3,"B")); //2

      CustomerSortById customerSortById = new CustomerSortById();
        // CustomerSortByName customerSortByName = new CustomerSortByName();
        Collections.sort(customerList, customerSortById);

        for (Customer customer: customerList){
            System.out.println(customer);
        }
    }
}
