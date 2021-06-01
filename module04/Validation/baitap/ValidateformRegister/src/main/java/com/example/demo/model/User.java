package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;
    @NotBlank(message = "Xin lỗi không được bỏ trống")
    @Size(min = 5 ,max = 30,message = "vui long nhập từ 5 đến 30 kí tự")
    private  String firstName;
    @NotBlank(message = "Xin lỗi không được bỏ trống")
    @Size(min = 5 ,max = 30,message = "vui long nhập từ 5 đến 30 kí tự")
    private  String lastName;
    @NotBlank(message = "Xin lỗi không được bỏ trống")
    @Min(value = 18,message = "tuổi phải bằng hoặc lớn hơn 18")
    private  int age;
    @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$",message = "email phải đúng định dạng abcx@gmail.com")
    private  String email;

    public User() {
    }

    public User(int id, @NotBlank(message = "Xin lỗi không được bỏ trống") @Size(min = 5, max = 30, message = "vui long nhập từ 5 đến 30 kí tự") String firstName, @NotBlank(message = "Xin lỗi không được bỏ trống") @Size(min = 5, max = 30, message = "vui long nhập từ 5 đến 30 kí tự") String lastName, @NotBlank(message = "Xin lỗi không được bỏ trống") @Min(value = 18, message = "tuổi phải bằng hoặc lớn hơn 18") int age, @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$", message = "email phải đúng định dạng abcx@gmail.com") String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
