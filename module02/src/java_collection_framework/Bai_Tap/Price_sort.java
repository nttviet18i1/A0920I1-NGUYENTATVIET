package java_collection_framework.Bai_Tap;

import java.util.Comparator;

public class Price_sort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()- o2.getPrice());
    }
}
