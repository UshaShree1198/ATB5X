package src.Loops;


import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a , b values : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b)
        {
            System.out.println("max is  "+a);
        }
        else
            System.out.println("max is "+b);
    }
}
