package qlsv;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class QLSV extends Student {
    Vector list = new Vector();

    //display menu
    public QLSV () {
        while (true) {
            System.out.println("QUẢN LÍ SINH VIÊN ");
            System.out.println("chức năng chương trình ");
            System.out.println("1.Nhập danh sách sinh viên ");
            System.out.println("2.Xem danh sach sinh vien ");
            System.out.println("3.Sắp xếp sinh vien theo điểm TB");
            System.out.println("4. Tìm tên sinh viên theo tên");
            System.out.println("Exit");
            System.out.println("__________________END_________________");
            //chon số
            int num;
            Scanner kb = new Scanner(System.in);
            System.out.println("vui lòng chọn chức năng:");
            num = kb.nextInt();
            switch (num) {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                case 3:
                    this.sort();
                case 4:
                    this.seach();
                case  5:
                    System.out.println("---------kết thúc chương trình----------");
            }

        }

    }



    private void input() {
        int num;
        Scanner kb= new Scanner(System.in);
        num= kb.nextInt();
        //nhập thông
        // tin sinh viên
        for (int i=1;i<=num;i++){
            System.out.println("nhập thông tin cho sinh viên"+i);
            System.out.println(" ID ");
            int id =Integer.parseInt(kb.next());
            kb.nextLine();
            System.out.println(" ten : ");
            String name= kb.nextLine();
            System.out.println("Diem trung bình:");
            float aver = kb.nextFloat();
            Student st=new Student(id,name,aver);
            list.add(st);
        }
        System.out.println("\n------------------\n");
    }
    public  void view(){
        System.out.println("Thông tin danh sách sinh viên:");
        Enumeration vEnum= list.elements();
        int i=1;
        while (vEnum.hasMoreElements()){
            Student sts = (Student)vEnum.nextElement();
            System.out.println(""+i+".ID="+sts.getId()+"ten="+sts.getName()+" , Diem trung binh="+sts.getAver());
            i++;
        }
        System.out.println("\n------------------\n");
    }
    public  void sort(){
        Student[] sts =new Student[list.size()];
        int index=0;
        Enumeration vEnum=list.elements();
        while (vEnum.hasMoreElements()) {
            sts[index] = (Student) vEnum.nextElement();
            index++;
        }
        Array.sort(sts

        }
    }
}

