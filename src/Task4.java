public class Task4 {
    /*Write a program that creates an integer array with 5 elements
     (i.e., numbers). The numbers can be any integers.
     Print out the value at the first index and the last index using
     length - 1 as the index. Now try printing the value at index = length
     (e.g., myArray[myArray.length] ).  Notice the type of exception which
      is produced. Now try to assign a value to the array index 5.
    You should get the same type of exception.
     */
    public void printingArrayindexselemsnts(){
        //declaring array
        int[] arr = new int[] {1,2,3,4,5};
        //Printing value at first index
        System.out.println("Value at first index : " + arr[0]);

        //Printing value at last index
        System.out.println("Value at last index : " + arr[arr.length-1]);

        //Notice the type of exception which You should get the same type of exception.
        System.out.println("Value at array.lenth"+ arr[arr.length]);




    }

}
