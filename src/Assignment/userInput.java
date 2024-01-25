package src.Assignment;

import java.util.Scanner;

public class userInput {
    //user input as array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 names : ");


      String [] names = new String[5];
        System.out.println("1.");
        names[0]= sc.next();

        System.out.println("2.");
        names[1]= sc.next();

        System.out.println("3.");
        names[2]= sc.next();

        System.out.println("4.");
        names[3]= sc.next();

        System.out.println("5.");
        names[4]= sc.next();



    }
}



