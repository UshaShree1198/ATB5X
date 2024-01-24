package src.functions;

public class methodoverloading {

    static void  display(String a)
    {
        System.out.println(a);
    }


    static void display(double d)
    {
        System.out.println(d);
    }




    public static void main(String[] args) {

        display("usha");
        display(67.78);
    }
// same method name with different parameters is method overloading...
}
