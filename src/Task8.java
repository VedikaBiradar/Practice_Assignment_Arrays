import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    /*Write a program that creates a String array of 5 elements and swaps the
    first element with the middle element without creating a new array.
     */
    Scanner sc = new Scanner(System.in);
    public void swappingElement(){
        //creating string array
        String[] arr=new String[5];
        String temp;

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the element you want to insert: ");
            arr[i]=sc.next();
        }

       temp=arr[0];
        arr[0]=arr[arr.length/2];
        arr[arr.length/2]=temp;

        System.out.println(Arrays.toString(arr));

    }

}
