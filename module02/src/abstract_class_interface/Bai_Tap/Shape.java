package abstract_class_interface.Bai_Tap;

public abstract class Shape implements Resizeable {
    protected String color;
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

    @Override
    public void resize(double percent) {

    }
}

