package acess_modifer.BaiTap;

public class Circle {
    private double radius;
    private String color;
    private final  double PI=3.14;
    public Circle() {
        this.radius = 1.0;
        this.color ="red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Circle qw1= new Circle();
        System.out.println(qw1);
    }
}
