import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    /*  Write some Java code that asks the user how many favorite things they have.
     Based on their answer, you should create a String array of the correct size.
     Then ask the user to enter the things and store them in the array you created.
     Finally, print out the contents of the array.
     */
    Scanner sc = new Scanner(System.in);
    public void userfavThings(){

        System.out.println("Enter how many favorite things they have.? n= ");
        int n=sc.nextInt();
        String[] arr=new String[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter your "+i+" favorite thing");
            arr[i]=sc.next();
        }

        System.out.println("User fav things are: "+ Arrays.toString(arr));

    }

}
