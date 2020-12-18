
package OPP.Bai_Tap;

public class Fan {
    final int slow=1;
    final  int medium=2;
    final int  fast=3;
    private int speed =slow;
     private boolean on;
    private  double radius;
    private  String color;

    public Fan() {
        this.speed=slow;
        this.on=true;
        this.radius=5;
        this.color="blue";

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return   "fan status "+
                " speed=" + getSpeed() +
                ", radius=" + getRadius()+
                ", color='" + getColor() + '\''
        + " status "
                + (isOn() ? "on" : "not on");

    }

    public static void main(String[] args) {
        Fan fan=new Fan();
        System.out.println(fan);
        Fan fan1= new Fan(3,false,10,"red");
        System.out.println(fan1);



    }
}





