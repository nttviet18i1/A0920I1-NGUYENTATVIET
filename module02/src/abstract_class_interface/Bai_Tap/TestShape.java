
package abstract_class_interface.Bai_Tap;



public class TestShape  {
    public static void main(String[] args) {
        Shape []shapes= new Shape[3];
        shapes[0]= new Circle("RED",true,5.0);
        shapes[1]=new Rectangle(5.0,6.0);
        shapes[2]=new Square();


        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println("-----------------------");
            shape.resize(50);
            System.out.println(shape);
    if (shape instanceof Colorable){
        Colorable colorable = (Square)shape;
        colorable.howToColor();
}
        }


    }




}
