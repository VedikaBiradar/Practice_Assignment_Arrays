import java.util.Arrays;

public class Task9 {
    /*Write a program to sort the following int array
    in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
     and print the smallest and the largest element of the array.
     The output will look like the following:
     Array in ascending order: 0, 1, 2, 4, 9, 13
      The smallest number is 0
      The biggest number is 13
     */

    public void sortArray(){
        int[] arr = {4,2,9,13,1,0};
        Arrays.sort(arr);

        System.out.println("Sorted Array: "+Arrays.toString(arr) );
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);



    }
}
