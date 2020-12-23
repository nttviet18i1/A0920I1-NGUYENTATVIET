package abstract_class_interface.Thuc_Hanh.shape;

public class Test {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red",false,5.8, 4.0, 1);
        System.out.println(square);
    }
}
