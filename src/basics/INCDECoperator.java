package src.basics;

public class INCDECoperator {
    public static void main(String[] args) {
        int a= 25;
        int x = (a-- + --a + a++);
        System.out.println(x);

       int b = 10;
        int y = (b++ + b-- + --b + ++b);
        System.out.println(y);
    }
}
