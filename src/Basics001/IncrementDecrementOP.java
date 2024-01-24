package src.Basics001;

public class IncrementDecrementOP {
    public static void main(String[] args) {

  // increment and decrement is applicable for variables like a++ only not for constant values like 10++//compile time error
        int a = 5                                                                                                                                                                        ;
       // System.out.println(a++ + a++ + ++a);
       int x = (a++ + ++a + ++a);
        System.out.println( x);
       // System.out.println(a);
    }
}
