import java.util.Scanner;

public class Task7 {
    /*Write a program where you create an array of 5 elements.
    Loop through the array and print the value of each element,
    except for the middle (index 2) element.
     */
    Scanner sc = new Scanner(System.in);
    public void skippingMiddleElement(){
        int[] arr = new int[5];

        //Looping/initializing through array using for loop
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the element you want to insert: ");
            arr[i]=sc.nextInt();
        }

        //Printing array elements except middle element
        System.out.println("Array elements except middle element");
        for(int i = 0; i<arr.length; i++){
            if(i==arr.length/2){
                continue;
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }
    }



}
