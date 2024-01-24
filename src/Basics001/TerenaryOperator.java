package src.Basics001;

public class TerenaryOperator {
    public static void main(String[] args) {

        //terinary operator is ?


int a = true? 90:40;
        System.out.println(a);

        int b = (30>80)? 10:20; // here 10= true , 20 = false
        System.out.println(b);

        String s = 10>20? "ten":"twenty";
        System.out.println(s);
    }
}
