package inheritance.Baitap;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void Speed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] Arr = {xSpeed, ySpeed};
        return Arr;
    }

    @Override
    public String toString() {
        return
                "MovablePoint{" +
                getSpeed()[0]+", "+getSpeed()[1]
                ;

    }

    public void move (float xSpeed ,float ySpeed) {
        x += xSpeed;
        y += ySpeed;



    }


    public static void main(String[] args) {
        Point A1= new Point(2,5);
        System.out.println(A1);
        MovablePoint A = new MovablePoint();
        System.out.println(A);
        MovablePoint B = new MovablePoint(2,8);
        System.out.println(B);
        B.move(5,6);

    }
}
