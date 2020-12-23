package abstract_class_interface.Thuc_Hanh.shape;

public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " +
               getColor() + '\'' +" And  "+
           ( isFilled()? "filled":"not filled")
                ;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this.color = "Red";
        this.filled = true;
    }

    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        Shape shape1= new Shape("green",false);
        System.out.println(shape1);
    }
}

