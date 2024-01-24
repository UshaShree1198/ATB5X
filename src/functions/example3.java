package src.functions;

public class example3 {
    public static void main(String[] args) {

       int c =  show(12);
        System.out.println(c);

        show("human brain");
        show(5.6f);

       String h = name("usha");
        System.out.println(h);
    }

    static int show(int a) { //return type int
        return a;
    }

    static void show(String b) {    // no return type void
        System.out.println(b);

    }

    static void show(float f)
    {
        System.out.println(f);
    }

static  String name(String h)
{
    return h+ "shree";
}

}
