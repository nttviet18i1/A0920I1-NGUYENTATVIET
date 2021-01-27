package _16_io_text_file.Bai_tap;

import java.io.*;

public class Readfile {
    public static void readfile(String path) {


        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            int data= fis.read();
            while (data!=-1) {
                System.out.println((char)data);
            data=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        readfile("D:\\A0920I1-NGUYENTATVIET\\module02\\src\\_16_io_text_file\\Bai_tap\\Readfile.java");
    }
}