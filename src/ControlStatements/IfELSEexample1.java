package src.ControlStatements;

import java.util.Scanner;

public class IfELSEexample1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a");
        int a= scan.nextInt();
        if(a>10)
        {
            System.out.println("A is greater");
        }
        else
            System.out.println("A is Less");
    }
}
