public class A4Q4{

    public static void main(String[] args){

        try{
            System.out.println("Outer try block started.");

            try{

                int a = 25/0;

                System.out.println(a);

            }catch(ArithmeticException e){

                System.out.println("Exception: " + e);

            }



            try{

                int[] arr = new int[5];

                arr[0] = 1;

                arr[3] = 4;

                arr[5] = 6;

                System.out.println(arr[0] + arr[3] + arr[5]);			//arr[5] will give error.

            }catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Exception: " + e);

            }

            System.out.println("Exceptions identified." ); 		//outer try completed.

        }catch(Exception e){

            System.out.println("Outer try block exited.");      //This line will not be printed.

        }

    }

}