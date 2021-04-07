package service;

import model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class StudentServicelmpl implements StudentService {
    private  static Map<String, Student> studentMap;
    public StudentServicelmpl(){
        if(studentMap!=null){
            return;
        }

        studentMap =new HashMap<>();
        studentMap.put("1",new Student("1","viet",19,"danang"));
        studentMap.put("2",new Student("2","vy",18,"danang"));
        studentMap.put("3",new Student("3","hung",19,"quangnam"));

    }
    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void insert() {

    }
}
