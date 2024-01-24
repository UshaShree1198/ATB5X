package src.functions;

public class example1 {
    public static void main(String[] args) {
        int result = add(7, 9); //calling the function
        System.out.println(result);

    }
         public static int add(int a,int b) // defination
        {
            return a + b;
        }
    }

    /* functions are block of code that performs particular task.
    creating a function - 1. defination 2. call the function.
    To define a function you have to use any access modifier followed by return type of the function, followed by
    function name and pass the parameters .

    In above example (add is function name )
    we passed  parameters ie. 7,9

    * */