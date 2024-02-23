package src.ControlStatements;

/* program to print 1 to 100
 if divisible by 3 print "fizz"
  if divisible by 5 print "buzz"
   if divisible by both 3  & 5 print "fizzbuzz"
* */

public class fuzzbuzz {
    public static void main(String[] args) {

         for (int i=0;i<=100;i++)
         {

        if(i%3==0 && i%5==0)
        {
            System.out.println("fizzbuzz");
        } else if (i%3==0)
        {
            System.out.println("fizz");
        } else if (i%5==0)
        {
            System.out.println("buzz");
        }
        else
            System.out.println(i);


    }
}}
