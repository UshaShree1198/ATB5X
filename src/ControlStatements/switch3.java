package src.ControlStatements;

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter code");
        int code = scan.nextInt();

        switch (code)
        {
            case 001, 002, 003 :
                System.out.println("type 1 category");
                break;

            case 004,005,006 :
                System.out.println("type 2 category ");
                break;
            default:
                System.out.println("remaining category");
        }
    }
}
