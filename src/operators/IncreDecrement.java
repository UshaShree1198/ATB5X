package src.operators;

public class IncreDecrement {
    public static void main(String[] args) {
        int a = 15;
       int x= (--a + a++ + a--);
        System.out.println(x);
        System.out.println(a);

        /* a= 15
         --a = 15-1 = ( a becomes 14)
         a++ = 14+1 =( a becomes 15)
         a--= 15-1= (a becomes 14 )
        *
        * */









    }
}
