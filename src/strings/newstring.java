package src.strings;

public class newstring {
    public static void main(String[] args) {
      String str = "Shiva";
      String str1 = new String("Ram");

        System.out.println(str1);

        //.equals checks the values
        boolean result = str1.equals(new String("Ram"));
        System.out.println("the result of string and new string is " + result);


        // == will check the reference value
        boolean result1 = str1==new String("Ram");
        System.out.println(result1);

        //here str will be stored in string pool and str1 which is new is stored in object area also knowns as heap area

    }
}
