package src.basics;

public class stringReverse {
    public static void main(String[] args) {
        String name = "pramod";
        String u = " ";
        for (int i = name.length()-1; i>0; i--)
        {
          u = u+name.charAt(i) ;
        }
        System.out.println(u);
    }


}
