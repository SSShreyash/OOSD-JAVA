import Square.*;
import Circle.*;
import Triangle.*;

public class A4Q8 {
    public static void main(String[] args){
        System.out.println("Dimensions for Square: " + "Side: " + Square.side);
        System.out.println("Area of Square: " + Square.area());
        System.out.println("Dimensions for Circle: " + "Radius: " + Circle.radius);
        System.out.println("Area of Circle: " + Circle.area());
        System.out.println("Dimensions for Triangle: " + "Base = " + Triangle.base +", Height = " +Triangle.height);
        System.out.println("Area of Triangle: " + Triangle.area());
    }
}