package src.operators;

public class TerenaryExample {
    public static void main(String[] args) {

        int a= 10;
        int b = 20;
        int c= 30;

        //to check which is highest
        //1.a>b

       int d =  a>b? (a>c?a:c):(b>c?b:c);
       /* we are checking.... if (a>b) we are left with a&c  so a>c
       if a is less than b and c, we have to check (b>c)
       */

        System.out.println("the higher value is" +d );
    }
}
