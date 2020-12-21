package inheritance.Baitap;

public class Piont2D {
    protected  float y;
    float x;


    public Piont2D() {
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

    public Piont2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
      float[] arr = {x,y};
      return arr;
    }

    @Override
    public String toString() {
        return "Piont2D{" +
                "x=" + getX()+
                ", y=" +getY()+
                "toa do la"+getXY()[0]+getXY()[1]+
                '}';
    }

    public static void main(String[] args) {
        Piont2D piont2D=new Piont2D();
        System.out.println(piont2D);
    }
}
