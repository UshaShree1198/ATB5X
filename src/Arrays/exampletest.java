package src.Arrays;

import java.util.Scanner;

public class exampletest {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("enter the size :");
        String u = scan.nextLine();
        String[] stag = new String[Integer.parseInt(u)];


        System.out.println("enter the names :");
        for(int i =0; i<6 ;i++)
        {
            stag[i]= scan.next();
        }
    }
}
