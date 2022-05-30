class ArrCheck {
    public static int[] arr = new int[5];
}
public class A4Q6 {
    public static void main(String[] args){
        ArrCheck.arr[0] = 1;
        ArrCheck.arr[1] = 2;
        ArrCheck.arr[2] = 3;
        ArrCheck.arr[3] = 4;
        ArrCheck.arr[4] = 5;
        System.out.println();
        try{
            System.out.println("Integer at 5th index: " + ArrCheck.arr[4]);
            System.out.println();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);      //This will not be printed.
        }
        try{
            System.out.println("Integer at 10th index: ");
            System.out.println(ArrCheck.arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
    }
}
