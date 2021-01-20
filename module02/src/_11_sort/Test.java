package _11_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2,"C")); //1
        studentList.add(new Student(1,"A")); //0
        studentList.add(new Student(2,"A")); //0
        studentList.add(new Student(3,"B")); //2

//        int index = studentList.indexOf(new Student(5,"a"));
//        System.out.println(index);
//        System.out.println(studentList.contains(new Student(90,"sasas")));

        for(Student student: studentList){
            System.out.println(student);
        }

        Collections.sort(studentList);
        System.out.println("----");
        for(Student student: studentList){
            System.out.println(student);
        }
    }
}
