package _11_sort;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.id - o.getId();
        if(result == 0){
            return this.name.compareTo(o.getName());
        }
        return result;
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
