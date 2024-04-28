    import java.util.Arrays;
    import java.util.Scanner;

    public class Task10 {
        /*Create an array that includes an integer, 3 strings, and 1 double.
        Print the array.
         */
        Scanner sc = new Scanner(System.in);
        public void mixedArray(){

            Object arr[]=new Object[5];

            //taking int input from user
            System.out.println("Enter int input: ");
            arr[0]=sc.nextInt();

            //taking string inputs from user
            System.out.println("Enter String input: ");
            arr[1]=sc.next();
            arr[2]=sc.next();
            arr[3]=sc.next();

            //Taking double input from user
            System.out.println("Enter Double input: ");
            arr[4]=sc.nextDouble();

            System.out.println("mixed array is: "+ Arrays.toString(arr));

        }

    }
