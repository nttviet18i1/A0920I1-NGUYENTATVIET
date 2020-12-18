package inheritance.Baitap;

public class Circle {
    private final double Pi=3.14;
    private String color;
    private  double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return Pi;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public  double getArea(){
        return radius*radius*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + getPi() +
                ", color='" + getColor() + '\'' +
                ", radius=" + getRadius() +
                "Area="+getArea()+
                '}';
    }

    public static void main(String[] args) {
        Circle circle=new Circle("red",6);
        System.out.println(circle);
    }
}
