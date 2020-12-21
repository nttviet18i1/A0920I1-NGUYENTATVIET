
package inheritance.Baitap;

public class Poin3D extends Piont2D{
    private  float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Poin3D() {
        this.z = 0.0f;
    }

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public void setXYZ( float x,float y,float z){
         this.x=x;
         this.y=y;
         this.z=z;
    }
    public  float[] getXYZ(){
        float[]Array={x,y,z};
        return Array;
    }



    public static void main(String[] args) {
        Poin3D poin3D= new Poin3D();
        System.out.println(poin3D);
        Poin3D poin3D1=  new Poin3D(1.0f,3.0f,4.0f);
        System.out.println(poin3D1);

    }
}
