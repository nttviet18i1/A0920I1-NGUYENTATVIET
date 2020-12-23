package abstract_class_interface.Bai_Tap;


public class Circle extends Shape implements Resizeable{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                +"   "+getPerimeter()
                +"   "+getArea();
    }

    @Override
    public void resize(double percent) {

       this.radius += this.radius*percent/100;
    }

}
