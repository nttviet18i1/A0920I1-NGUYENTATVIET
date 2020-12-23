package inheritance.Baitap;

public class Point2d extends Piont2D {
    public Point2d() {
        this.x=0.0f;
        this.y =0.0f;
    }

    public Point2d(float x, float y) {
        super(x, y);
        this.x=x;
        this.y=y;
    }
    public  void move(float dx,float dy){
        x+=dx;
        y+=dy;
    }
    public  void display(){
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
      Point2d  A= new Point2d(3,4);
        System.out.println("toa do A la:");A.display();
        A.move(4,2);
        System.out.println("toa do moi cua A la:");A.display();
    }
}
