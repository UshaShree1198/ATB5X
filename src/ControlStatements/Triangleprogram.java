package src.ControlStatements;

import java.util.Scanner;

public class Triangleprogram {
    public static void main(String[] args) {

        /* 3 sides equal equilateral triangle
        * 2 sides equal isosceles triangle
        * no sides equal scalene
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a , b , c ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a==b) && (b==c) && (c==a))
        {
            System.out.println("it is a equilateral triangle");
        }
        else if ((a==b) || (b==c) || (c==a))
        {
            System.out.println("it is a isosceles triangle");

        }
        else
            System.out.println("it is scalene ");
    }
}
