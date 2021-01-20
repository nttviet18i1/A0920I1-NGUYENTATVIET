package java_collection_framework.Thuc_Hanh;

public class Student implements Comparable<Student>{
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Integer age;
    private String name;
    private  String address;
    public Student() {

    }

    public Student(Integer age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {

        return this.getName().compareTo(student.getName());
    }


    //    @Override
//    public boolean equals(Object obj) {
//        if(obj == null || !(obj instanceof Student)){
//            return false;
//        }
//
//        Student otherStudent = (Student) obj;
//        if(this.name.equals(otherStudent.getName())){
//            return  true;
//        }
//
//        return false;
//    }
}
