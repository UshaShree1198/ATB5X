package src.ControlStatements;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter");
        char ch = scan.next().charAt(0);
        char u = Character.toUpperCase(ch); // to change value to uppercase

        switch (u)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + "is a vowel");
                break;
            default:
                System.out.println(ch + "is not vowel");
        }
    }
}
