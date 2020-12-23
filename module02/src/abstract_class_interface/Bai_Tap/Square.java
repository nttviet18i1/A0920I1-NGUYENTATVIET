package abstract_class_interface.Bai_Tap;



public class Square extends Rectangle implements Resizeable ,Colorable{
    //private  double side;
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
//        this.side = side;
    }

    public Square() {
//        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }




    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
//       this.side+= this.side*percent/100;
        super.resize(percent);
    }

    @Override
    public void howToColor() {
        System.out.println( "  Color all four sides.." + color);

    }
}
