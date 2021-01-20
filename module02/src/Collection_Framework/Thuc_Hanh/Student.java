package Collection_Framework.Thuc_Hanh;

public class Student implements Comparable<Student> {
    private  String  name;
    private  Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        Address = address;
    }

    public Student() {
    }

    private  String  Address;


    @Override
    public int compareTo(Student  student) {
        return this.getName().compareTo(student.getName());
    }
}

