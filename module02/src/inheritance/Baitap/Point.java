package inheritance.Baitap;

public class Point {
 protected float x;
  protected float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public  void  setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public  float[] getXY(){
       float[]Arr={x,y};
        return Arr;

    }

    @Override
    public String toString() {
        return "Point{" +
                "toa do point la"+": "+getXY()[0]+" , "+getXY()[1]+

                '}';
    }

    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        Point point1=new Point(4,6);
        System.out.println(point1 );
    }
}
