package OPP.Thuchanh;

import java.util.Scanner;

public class Rectangle {

      double width, height;
    Rectangle(double hieght, double width){
           this.height=hieght;
           this.width=width;
    }
    public  double getDt(){
        return this.width*this.height;
    }
    public  double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        Rectangle Rectangle = new Rectangle(height,width);
        System.out.println("Your Rectangle \n"+ Rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ Rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ Rectangle.getDt());

    }
}
