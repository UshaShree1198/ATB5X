package src.functions;

import java.util.Scanner;

public class mathfunctn02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x :");
        double x = sc.nextDouble();
        System.out.println("enter value of y :");
        double y = sc.nextDouble();
        System.out.println("enter value of z :");
        double z = sc.nextDouble();

        double result = 0;
        result = Math.cbrt(Math.pow(x,2)+ Math.pow(y,2) -Math.abs(z));
        System.out.println(result);
        sc.close();

    }
}
