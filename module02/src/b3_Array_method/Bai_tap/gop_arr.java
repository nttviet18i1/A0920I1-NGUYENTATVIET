package b3_Array_method.Bai_tap;
import java.util.Scanner;

public class gop_arr {
    public static int[] Nhap_Mang() {
        int n = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("nhập phần tửn =");
        n=kb.nextInt();
        int []a=new int[n];
        System.out.println("\n nhập giá trị phần tử của mảng \n:");
        for(int i =0; i<a.length;i++){
            System.out.print("a["+i+"]=");
            a[i]=kb.nextInt();
        }

        return a;
    }
        public static void Xuat_Mang(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");

        }
    }
    public  static int[] Gop_Arr(int a[],int b[]){
        int [] c=new int[a.length+b.length];
        int m=0;
        int n=0;
        for(int j=0;j<c.length;j++){
            if(m<a.length && n<b.length)
            {
                if(a[m]<b[n])
                {
                    c[j]=a[m];
                    m++;
                }
                else
                    {
                        c[j]=b[n];
                        n++;
                    }
            }
            else {
                if(m<a.length){
                    c[j]=a[m];
                    m++;

                }
                else {
                    if (n<b.length){
                        c[j]=b[n];
                        n++;

                    }
                }
            }

        }
        return c;

    }
    public static void main(String[] args) {
        System.out.print("Nhap mang A: \n");
        int a[]=Nhap_Mang();
        System.out.println("mang a la");
        Xuat_Mang(a);
        System.out.print("Nhap mang B: \n");
        int b[]=Nhap_Mang();
        System.out.println("mang B la");
        Xuat_Mang(b);
        System.out.println("gop mang A+B");
        int []c= Gop_Arr(a,b);
        Xuat_Mang(c);


    }
}

