package src.strings;

public class newstring2 {
    public static void main(String[] args) {
        String s1 = "THANKYOU UNIVERSE";
        String s2 = "THANKYOU UNIVERSE";
        String s3 = new String("THANKYOU UNIVERSE");

        System.out.println(s1==s2); // check ref values
        System.out.println(s1.equals(s2)); //check values
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));



    }
}
