import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    /* Write a program that creates an array of String type and initializes
     it with the strings “red,” “green,” “blue,” and “yellow.”
     Print out the array length. Make a copy using the clone( ) method.
      Use the Arrays.toString( ) method on the new array to verify that
       the original array was copied.
     */
    Scanner sc = new Scanner(System.in);
    public void copyArrayusingclone(){
        //Initializing array
        String[] arr=new String[5];


        //Initializing elements to array
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element you want to insert or intialize at index "+i);
            arr[i]=sc.next();
        }
        //creating copy of array using clone
        String[] newarr=arr.clone();
        //printing array lengths
        System.out.println("arr length is: "+arr.length);
        System.out.println("newarr length is: "+newarr.length);


        //prinitng both arrays
        System.out.println("arr is: "+ Arrays.toString(arr));
        System.out.println("new arr is: "+ Arrays.toString(newarr));


    }

}
