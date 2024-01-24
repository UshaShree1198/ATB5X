package src.Arrays;

public class array3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(arr1==arr2); //false because different memory allocations
        int[] arr3 = arr1;
        System.out.println(arr1==arr3); //true because arr3 is referring to arr1 which is same array
        System.out.println(arr1.equals(arr2));
/*
        In STRINGS .equals will be true ... it will check values
         In ARRAYS  .equals will be false... it will check references
*/



        arr3[0]= 56;
        System.out.println(arr3[0]);
        System.out.println(arr1[0]);
        /* here we replaced the arr3[0] value to 56, as we mentioned earlier that arr3[] == arr1[].
         value of arr1[0] value also will be changed
         */

    }
}
