package src.basics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string ");
        String user_input = scan.next();
        Boolean result = isPalindrome(user_input) ;

        if(result)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }

    private static Boolean isPalindrome(String userInput)
    {
        String origina_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
       String reverse =  sb.reverse().toString();


        return userInput.equalsIgnoreCase(reverse) ;
    }
}
