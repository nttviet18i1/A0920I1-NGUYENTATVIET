package service;

import model.Student;

import java.util.List;

public interface StudentService {
    public Student getStudentById(String id);
    List<Student> getAll();
     void delete();
     void  update();
     void  insert();
}
