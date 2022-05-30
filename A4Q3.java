import java.util.Scanner;

class Check {
    static int x = 0;
    static Scanner A = new Scanner(System.in);
    static int a = A.nextInt();
    static double w;
}

public class A4Q3{
    public static void main(String[] args) {
        System.out.print("Enter the value of a: ");
        try {
            Check.w = Check.a / Check.x;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }

    }
}