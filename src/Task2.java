import java.util.Scanner;

public class Task2 {
    /*Write a program that returns the middle element in an array. Give the
    following values to the integer array: {13, 5, 7, 68, 2} and
    produce the following output: 7
     */
    Scanner sc = new Scanner(System.in);
    public void middleElemenet(){
        //declared array
        int[] arr=new int[5];

        //assigning values to array using for loop
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element you want to insert or intialize at index "+i);
            arr[i]=sc.nextInt();
        }

        //Printing middlevalue
        System.out.println("the middle element is : "+arr[arr.length/2]);



    }

}
