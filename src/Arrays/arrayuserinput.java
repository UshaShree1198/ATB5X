package src.Arrays;

import java.util.Scanner;

public class arrayuserinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");

        int n = sc.nextInt();
        int[] area = new int[n];


        System.out.println("enter the numbers");
        for (int i=0; i<n;i++)
        {
              area[i] = sc.nextInt();
        }
        System.out.println("--------------");

        for(int i=0 ; i<n;i++)
        {
            System.out.print(area[i] + " ");
        }
        System.out.println();

    }
}
