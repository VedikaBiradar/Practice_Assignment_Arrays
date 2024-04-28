import java.util.Arrays;

public class Task6 {
    /*Write a program where you create an integer array of 5 numbers.
    Loop through the array and assign the value of the loop control
    variable multiplied by 2 to the corresponding index in the array.
     */

    public void arrayOfMultiplyingidx(){
        int[] arr = new int[5];

        //Looping/initializing through array using for loop
        for(int i = 0; i<arr.length; i++){
            arr[i] = i*2;

        }
        System.out.println("array is: "+ Arrays.toString(arr));
    }
}
