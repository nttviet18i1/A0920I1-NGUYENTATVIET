package java_collection_framework.Thuc_Hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(30, "Kien", "HT");
        Student student4 = new Student(18, "vy", "HT");
        Student student1 = new Student(26, "Nam", "HN");
        Student student2 = new Student(39, "Anh", "HT" );
        Student student3 = new Student(40, "Tung", "HT" );
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
