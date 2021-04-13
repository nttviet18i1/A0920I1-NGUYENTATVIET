/*
package _00_review;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MainController {
    private static final String FILE_PATH_STUDENT = "D:\\SynologyDrive\\Dell5590\\Work\\CodeGym\\Class\\A0920G1\\Module_2\\SourceDemo\\src\\_00_review\\student.csv";
    private static final String FILE_PATH_TEACHER = "D:\\SynologyDrive\\Dell5590\\Work\\CodeGym\\Class\\A0920G1\\Module_2\\SourceDemo\\src\\_00_review\\teacher.csv";
    public static void main(String[] args) {
//        Person student1 = new Student("Tri", 18, 10);
//        Person student2 = new Student("Anh", 18, 10);
//        Person student3 = new Student("Tri", 90, 100);
//
//        Person teacher1 = new Teacher("Hung", 25, 1000);
//        Person teacher2 = new Teacher("Trang", 30, 2000);
//
//
        PersonManager personManager = new PersonManager(new ArrayList<>());
//        personManager.addPerson(student1);
//        personManager.addPerson(student2);
//        personManager.addPerson(student3);
//        personManager.addPerson(teacher1);
//        personManager.addPerson(teacher2);
//
////        for (Person person: personManager.getPersonList()){
////            System.out.println(person);
////        }
//
//        Person student_3 = new Student("Anh", 18, 5);
//
//        personManager.updatePerson(student_3);
//        System.out.println("---------------------------------");
//
//        for (Person person: personManager.getPersonList()){
//            System.out.println(person);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap ten can xoa: ");
//        String name = scanner.nextLine();
//        personManager.remove(new Person(name,18));
//        System.out.print("Nhap index cua person can xoa: ");
//        int index = scanner.nextInt();
//        personManager.remove(index);
//        System.out.print("Nhap ten can tim kiem: ");
//        String name = scanner.nextLine();
//        List<Person> resultList = personManager.searchContaining(name);

//        System.out.println("---------------------------------");
//
//        Collections.sort(personManager.getPersonList(), new PersonSortByAge());
//
//        for (Person person: personManager.getPersonList()){
//            System.out.println(person);
//        }

        List<String> stringList = FileUtil.readCSV(FILE_PATH_STUDENT);
        List<Student> studentList = new ArrayList<>();
        String[] temp = null;
        for (String str: stringList) {
            temp = str.split(",");
            Student student = new Student(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
            studentList.add(student);
        }

        List<String> stringList_2 = FileUtil.readCSV(FILE_PATH_TEACHER);
        List<Teacher> teacherList = new ArrayList<>();
        String[] temp_2 = null;
        for (String str: stringList_2) {
            temp_2 = str.split(",");
            Teacher teacher = new Teacher(temp_2[0], Integer.parseInt(temp_2[1]), Integer.parseInt(temp_2[2]));
            teacherList.add(teacher);
        }

        personManager.getPersonList().addAll(studentList);
        personManager.getPersonList().addAll(teacherList);

        System.out.println("---------------------------------");

        for (Person person: personManager.getPersonList()){
            System.out.println(person);
        }

        personManager.addPerson(new Student("Phap", 18, 50));

        System.out.println("---------------------------------");

        for (Person person: personManager.getPersonList()){
            System.out.println(person);
        }

    }
}
*/
