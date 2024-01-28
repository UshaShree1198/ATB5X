package src.ControlStatements;

import java.util.Scanner;

public class scanneruserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter age :");
        int age = sc.nextInt();
        System.out.println("enter salary :");
        double sal = sc.nextDouble();
        System.out.println(name + " salary is" + sal + " and his age is "+ age);
       sc.close();
    }
}
