package qlsv;

public class Student {
    private  int id;
    private String name;
    private float aver;

    public Student() {
       name= new String("");
       id=0;
       aver=0;
    }

    public Student(int i, String n, float a) {
        this.id = i;
        this.name = n;
        this.aver = a;
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

    public float getAver() {
        return aver;
    }

    public void setAver(float aver) {
        this.aver = aver;
    }
}
