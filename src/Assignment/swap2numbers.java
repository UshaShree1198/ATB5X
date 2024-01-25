package src.Assignment;

import java.util.Scanner;

public class swap2numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enetr b :");
        int b = sc.nextInt();


        int temp = a;
        a=b;
        b=temp;

        System.out.println(" swapped values of a is " + a + "and value of b is "+ b );
    }
}
