package src.strings;

public class example {
    public static void main(String[] args) {
        String s1 = "Usha";
         s1.concat("shree");
        System.out.println(s1); //mutable so it doesnt change s1


        StringBuilder  s2 = new StringBuilder("Usha");
        s2.append("shree");
        System.out.println(s2); // mutable so it changes the values
    }
}
