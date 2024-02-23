package src.operators;



public class LogicalOperator {
    public static void main(String[] args) {

        //! not
        int a= 20;
        int b= 40;
        boolean c = (a<b);
        boolean d = !(a<b);
        System.out.println(c);
        System.out.println(d);

        //&& AND
        int e = 65;
         boolean res = (e>70 && e<66);
         boolean output = (e==65 && e>54 );
        System.out.println(res);
        System.out.println(output);


        // || OR
        int f = 98;
        boolean result  = (f>60 || f==30);
        boolean output1 = (f==65 || f>54);
        System.out.println(result);
        System.out.println(output1);




    }
}
