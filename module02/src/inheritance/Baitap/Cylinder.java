package inheritance.Baitap;

public class Cylinder extends Circle {
    private  final double Pi=3.14;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    private double height;
    private double wight;
    public Cylinder(String color, double radius ,double wight,double height) {
        super(color, radius);
        this.wight=wight;
        this.height=height;

    }
    public  double getThetich(){
        return height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Pi=" +getPi() +
                ", height=" + getWight() +
                ", wight=" + getHeight() +
                ",Thetich"+getThetich()+
                "dientich"+getArea()+
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder("RED",3,4,10);
        System.out.println(cylinder);
    }
}
