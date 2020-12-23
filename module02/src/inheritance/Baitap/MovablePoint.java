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
                "MovablePoint{"
                +getxSpeed()+", "+getySpeed()+"}"+"\n"
                +"MovablePoint da thay doi"+"{"+getX()+", "+getY()+"}";

    }

    public MovablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }


    public static void main(String[] args) {
        MovablePoint b = new MovablePoint(5,5,2, 6);
        b.move();
        System.out.println(b);



    }
}
