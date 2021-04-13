package Thicuoimodule2.productshow;

import Thicuoimodule2.commons.ReadFileCSV;
import Thicuoimodule2.commons.WriteFileCSV;
import Thicuoimodule2.commons.regex;
import Thicuoimodule2.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductShow {
    public static Scanner scanner = new Scanner(System.in);
    public static final String PATH_PRODUCT = "D:\\A0920I1-NGUYENTATVIET\\module02\\src\\Thicuoimodule2\\data\\product.csv ";
    private static List<Product> productsList = new ArrayList<>();

    public static void addNewProduct() {
        System.out.println("nhap id san pham:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ma san pham ");
        String maSp = scanner.nextLine();
        String tenSp;
        do {
            System.out.println("Enter the Name ");
           tenSp = scanner.nextLine();

        } while(!(regex.validateName(tenSp)));
        System.out.println("nhap gia san pham");
        double giaSP = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so luong san pham");
        int soLuongSp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nha san xuat san pham");
        String nsxSp = scanner.nextLine();
        Product newProductshow = new Product(id, maSp, tenSp, giaSP, soLuongSp, nsxSp);
        productsList.add(newProductshow);
        WriteFileCSV writeFileCSV = new WriteFileCSV();
        writeFileCSV.write(PATH_PRODUCT, newProductshow.toString(), true);


    }


    public static void showProduct() {

        List<String> stringList = ReadFileCSV.readCSV(PATH_PRODUCT);
        productsList = new ArrayList<>();
        String[] temp = null;
        for (String str : stringList) {
            temp = str.split(",");
            Product product=new Product(Integer.parseInt(temp[0]),temp[1],temp[2],Double.parseDouble(temp[3]),Integer.parseInt(temp[4]),temp[5]);
            productsList.add(product);
        }
        for (Product product : productsList) {
            System.out.println(product.toString());

        }

    }
}