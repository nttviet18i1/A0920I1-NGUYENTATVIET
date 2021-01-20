
package java_collection_framework.Bai_Tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner kb = new Scanner(System.in);
    public static List<Product> listProduct = new ArrayList<>();

   public  ProductManager() {
       while (true) {
           System.out.println("CHUONG TRING QUAN LY SAN PHAM");
           System.out.println("chuc nang chuong trình:");
           System.out.println("1.them san pham  ");
           System.out.println("2. xem thong tin san pham ");
           System.out.println(" 3. xoa san pham");
           System.out.println("4. sua san pham  ");
           System.out.println("5. tim kiem san pham theo id ");
           System.out.println("6. thoat");
           System.out.println("--------------------------------");
           int num;
           System.out.println(" chon nhap chuc nang");
           num = kb.nextInt();
           switch (num) {
               case 1:
                   this.addProduct();
                   break;
               case 2:
                   this.showProduct();
                   break;
               case 3:
                   this.deleteProduct();
                   break;
               case 4:
                   this.updateProduct();
                   break;
               case 5:
                   this.seachProduct();
                   break;
               case 6:
                   System.out.println("----kết thuc---");
                   return;
           }

       }
   }


    public static void addProduct(){

        System.out.println("nhap id:");
        int id= kb.nextInt();
        System.out.println("nhap ten");
        kb.nextLine();
        String name= kb.nextLine();
        System.out.println("nhap gia ");
        double price= kb.nextDouble();
        Product product= new Product(id,name,price);
        listProduct.add(product);
        showProduct();

    }
    public  static  void updateProduct(){
        System.out.println( "chon id can sua:");
        int id= kb.nextInt();
         for(int i =0 ; i< listProduct.size();i++)
        {
            if (id==listProduct.get(i).getId()){
                kb.nextLine();
                System.out.println("nhap vao ten ");
                String name= kb.nextLine();
                System.out.println("nhap gia ");
                double price= kb.nextDouble();

                listProduct.get(i).setName(name);
                listProduct.get(i).setPrice(price);


            }

        }
        showProduct();

    }
    public  static void seachProduct(){
        System.out.println("nhap id mupon tim:");
        int id= kb.nextInt();
        for(int i =0 ; i< listProduct.size();i++)
        {
            if (id==listProduct.get(i).getId()){
                System.out.println(listProduct.get(i).getId());
            }

        }
        showProduct();
    }
    public  static  void deleteProduct(){
        System.out.println("nhap id mupon xoa:");
        int id= kb.nextInt();
        for(int i =0 ; i< listProduct.size();i++)
        {
            if (id==listProduct.get(i).getId()){

                listProduct.remove(i).getId();
            }

        }
        showProduct();

    }
    public  static  void  showProduct(){
        for (Product A: listProduct
             ) {
            System.out.println(A);

        }

    }

    public static void main(String[] args) {


        new ProductManager();
    }
}
