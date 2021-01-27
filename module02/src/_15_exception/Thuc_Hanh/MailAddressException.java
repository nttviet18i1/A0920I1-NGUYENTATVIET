package _15_exception.Thuc_Hanh;

import java.util.Scanner;

public class MailAddressException extends  Exception{
    MailAddressException(String str){
        super(str);
    }

public static void check(String str)throws MailAddressException
{
    int place = str.indexOf('@');
    if(place==-1)
    {
        throw  new MailAddressException("không hợp lệ do ko cớ @");
    }
    if(place==0){
        throw  new MailAddressException("không hợp lệ do @ o dau tien");

    }
    place=str.indexOf('@',place+1);
    if(place!=-1)
    {
        throw  new MailAddressException("không hợp lệ do co hon 1@");
    }
    System.out.println("mail  hợp lệ");

}

    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("nhap dịa chi mail.");
            String mail = scanner.nextLine();
            check(mail);
        }
        catch (MailAddressException e){
            System.out.println(e.getMessage());
        }
    }
}
