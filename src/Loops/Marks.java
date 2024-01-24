package src.Loops;

import java.util.Scanner;

public class Marks {
    /*if score >= 90 && score <=100 print A
    SCORE >= 80 AND SCORE <=89 PRINT B
    SCORE >= 70 AND SCORE <=79 PRINT C
    SCORE >= 60 AND SCORE <=69 PRINT D
    SCORE >= 50 AND SCORE <=59 PRINT E
    SCORE >= 40 AND SCORE <=49 PRINT F
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score : ");
        int score = sc.nextInt();
        if(score >=90 && score<=100)
        {
            System.out.println("GRADE IS A");
        }
        else if (score >=80 && score <=89)
        {
            System.out.println("GRADE IS B");
        }
        else if (score>=70 && score<= 79) {
            System.out.println("GRADE IS C");
        }
        else if (score>=60 && score<= 69)
        {
            System.out.println("GRADE IS D");
        }
        else if (score>=50 && score<= 59)
        {
            System.out.println("GRADE IS E");
        }
        else if (score>=40 && score<= 49)
        {
            System.out.println("GRADE IS F");
        }

    }





}

