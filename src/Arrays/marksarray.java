package src.Arrays;


import java.util.Scanner;

public class marksarray {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks :");

        float[] marks = new float[7];

        System.out.println("enter english marks:");
        marks[0] = sc.nextFloat();

        System.out.println(" enter maths marks");
        marks[1]= sc.nextFloat();

        System.out.println("enter science marks");
        marks[2]= sc.nextFloat();

        System.out.println("enter Social marks");
        marks[3]= sc.nextFloat();

        System.out.println("enter Telugu marks");
        marks[4]= sc.nextFloat();

        System.out.println("enter Hindi marks");
        marks[5]= sc.nextFloat();

        System.out.println("enter sanskrit marks");
        marks[6]= sc.nextFloat();



        for (int i = 0; i<marks.length;i++)
        {
               if( marks[i] < 35 )
               {
                   System.out.println("you failed in this subject : " + marks[i]);
               }
            System.out.println(i);
        }
    }


}
