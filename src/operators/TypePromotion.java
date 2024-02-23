package src.operators;

public class TypePromotion {
    public static void main(String[] args) {
         byte a = 100;
         byte b = 60;
         int r = a*b ;
        System.out.println(r); // here byte is converted to int
    }
}
