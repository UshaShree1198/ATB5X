package src.Assignment;

import java.util.Scanner;

public class swap3 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        System.out.println("before swapping value of a is " +a + " and b is " + b);

        a = a*b;
        b= a/b;
        a=a/b;
        System.out.println("After  swapping value of a is " +a + " and b is " + b);
    }
}
