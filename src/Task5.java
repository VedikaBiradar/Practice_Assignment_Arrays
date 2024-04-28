import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    /*Write a program where you create an integer array with a
    length of 5. Loop through the array and assign the value of the
    loop control variable (e.g., i) to the corresponding index in the array.
     */
    Scanner sc = new Scanner(System.in);
    public void assignValueUsingForLoop(){
        int[] arr=new int[5];

        //assigning values to array
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element you want to insert or initialize at index "+i);
            arr[i]=sc.nextInt();;
        }
        System.out.println("the array is: "+ Arrays.toString(arr));

    }

}
