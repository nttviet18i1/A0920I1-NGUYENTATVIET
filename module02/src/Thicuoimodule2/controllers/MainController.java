package Thicuoimodule2.controllers;
import Thicuoimodule2.productshow.ProductShow;
import java_collection_framework.Bai_Tap.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class MainController {
        public static Scanner kb = new Scanner(System.in);
        public static List<Product> listProduct = new ArrayList<>();

        public static void ProductManager1() {
            while (true) {
                System.out.println("CHUONG TRING QUAN LY SAN PHAM");
                System.out.println("chuc nang chuong trình:");
                System.out.println("1.them san pham  ");
                System.out.println("2. xem thong tin san pham ");
                System.out.println(" 3. xoa san pham");
                System.out.println("5. tim kiem san pham ");
                System.out.println("6. thoat");
                System.out.println("--------------------------------");
                int num;
                System.out.println(" chon nhap chuc nang");
                num = kb.nextInt();
                switch (num) {
                    case 1:
                        ProductShow.addNewProduct();
                        break;
                    case 2:
                        ProductShow.showProduct();

                    case 3:
                        seachProduct();
                        break;
                    case 4:
                            deleteProduct();
                            break;
                    case 5:
                        System.out.println("----kết thuc---");
                        return;
                }

            }
        }

        public static void seachProduct() {
            System.out.println("nhap id muon tim:");
            int id = kb.nextInt();
            for (int i = 0; i < listProduct.size(); i++) {
                if (id == listProduct.get(i).getId()) {
                    System.out.println(listProduct.get(i).getId());
                }


            }
        }
        public  static  void deleteProduct(){
            System.out.println("nhap id muon xoa:");
            int id= kb.nextInt();
            for(int i =0 ; i< listProduct.size();i++)
            {
                if (id==listProduct.get(i).getId()){

                    listProduct.remove(i).getId();
                }

            }

        }

        public static void main(String[] args) {
          ProductManager1();
        }
    }

