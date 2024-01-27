package src.Arrays;

import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        int[][] array_2d = new int[3][3]; //

         array_2d[0][0]= 1;
         array_2d[0][1]= 2;
         array_2d[0][2]= 3;
         array_2d[1][0]= 4;
         array_2d[1][1]= 5;
         array_2d[1][2]= 6;
         array_2d[2][0]= 7;
         array_2d[2][1]= 8;
         array_2d[2][2]= 9;


         for (int i=0 ; i<3; i++)
         {
          for(int j=0; j<3; j++)

             System.out.println(array_2d[i][j]);
         }
     }
}
