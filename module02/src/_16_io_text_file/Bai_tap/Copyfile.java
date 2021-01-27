package _16_io_text_file.Bai_tap;

import java.io.*;

public class Copyfile {
    public static void main(String[] args)  {
        FileInputStream sourcefile =null;
        FileOutputStream targetfile= null;
        try {
            sourcefile=new FileInputStream("D:\\A0920I1-NGUYENTATVIET\\module02\\src\\_16_io_text_file\\Bai_tap\\test1");

        targetfile=new FileOutputStream("D:\\A0920I1-NGUYENTATVIET\\module02\\src\\_16_io_text_file\\Bai_tap\\test2");
        int data;
        data=sourcefile.read();
        while (data!=-1){
            targetfile.write(data);
            data= sourcefile.read();
        }
        targetfile.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
