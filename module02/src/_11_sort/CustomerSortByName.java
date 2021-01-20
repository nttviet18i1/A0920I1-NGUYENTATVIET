package _11_sort;

import java.util.Comparator;

public class CustomerSortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
