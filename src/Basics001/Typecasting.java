package src.Basics001;

public class Typecasting {
    public static void main(String[] args) {

        // type casting

         int a = 56;
         byte b = (byte) a;
        System.out.println(b);  // explicit casting we do it

        float f = 56.7f;
        double d = (double)f;
        System.out.println(d);

        int u = 257;
        byte c = (byte)u;
        System.out.println(c);  // it will do modulus with byte range i.e 256 then byte value c becomes 1

        byte h = 40;
        int j = h;// implicit casting which jvm does
        System.out.println(j);

        float n = 67.8f;
        int k = (int)n;
        System.out.println(k); //here it is type cating to int so .8 will be removed







    }


}
