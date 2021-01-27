package _16_io_text_file.demo;

import _16_io_text_file.demo.FileUtil;
import _16_io_text_file.demo.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        FileUtil.writeCSV( new Student(1,"Viet"));
//        FileUtil.writeCSV( new Student(2,"Anh"));
//        FileUtil.writeCSV( new Student(3,"Vo"));

        List<Student> studentList = new ArrayList<>();
        studentList = FileUtil.readCSV();

        for(Student student: studentList){
            System.out.println(student);
        }

        //Tab separated value (TSV)
        //Comma separated value (CSV)
    }
}
