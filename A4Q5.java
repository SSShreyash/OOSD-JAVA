import java.util.Scanner;

class MyException extends Exception{
    String str(){
        return "NULL STRING";
    }
}

class CheckA4Q5{
    static void string(String x) throws MyException{
        System.out.println("String: " + x);
        if(x.isEmpty())
           throw new MyException();
    }
}

public class A4Q5 {
    public static void main(String[] args) {
        String x;
        int i = 0;
        do{
            System.out.println("Enter a string : ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextLine();
            try {
                CheckA4Q5.string(x);
            } catch (MyException e) {
                System.out.println("Exception: " + e.str());
            }
            i++;
        }while (x.length() != 0 && i<10 );
    }
}
