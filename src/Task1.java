public class Task1 {
    /* Write a program that creates an array of integers with a length of 3.
     Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
    public void simpleArray(){

        //created array
        int[] simpleArray = new int[] {1,2,3};
        System.out.println("simplarray elements are:");
        //printing array using forloop
        for(int i = 0; i < simpleArray.length; i++){
            System.out.println("simplarray elements are:");
            System.out.println("Element at index "+i+" is " +simpleArray[i]);
        }
    }
}
