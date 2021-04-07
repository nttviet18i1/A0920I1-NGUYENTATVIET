import java.util.Scanner;
import java.util.Vector;

public class StudenManagement {
    Vector list = new Vector();

    //display menu
    public StudenManagement() {
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
        //nhập thông tin sinh viên
        for (int i=1;i<=num;i++){
            System.out.println("nhập thông tin cho sinh viên"+i);
            System.out.println(" ID ");
            int id= in
        }
    }
}
