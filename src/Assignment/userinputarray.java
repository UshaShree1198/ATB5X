package src.Assignment;

import java.util.Scanner;

public class userinputarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //  System.out.println("enter below 6 numbers :");

        int [] num = new int[6];

        System.out.println("1.");
        num[0]=scan.nextInt();

        System.out.println("2.");
        num[1]=scan.nextInt();

        System.out.println("3.");
        num[2]=scan.nextInt();

        System.out.println("4.");
        num[3]=scan.nextInt();

        System.out.println("5.");
        num[4]=scan.nextInt();

        System.out.println("6.");
        num[5]=scan.nextInt();


    }
}
