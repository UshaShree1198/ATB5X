package src.Arrays;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of row");
     int row = sc.nextInt();
     System.out.println("enter size of column");
     int col = sc.nextInt();

     int[][] array2d = new int[row][col];

     System.out.println("enter the " + (row * col) + "values");
     for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
       array2d[i][j] = sc.nextInt();
      }
     }
     System.out.println("your array is :");
     for (int i = 0; i < row; i++)
     {
          for (int j = 0; j < col; j++)
          {
              System.out.print(array2d[i][j] + "  ");
           }
      System.out.println();
     }

    }}
