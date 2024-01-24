package src.Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /* year should be divisible 4 and year should not be divisible by 100 = " LEAP YEAR"
        year should be divisible by 4 and if year divisible by 100 "  NOT LEAP YEAR "
          year should be divisible by 4 and if year divisible by 100 then  check whether year % 400.
           if yes its "LEAP YEAR"
        if not divisible by 400 "NOT LEAP YEAR"
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year%4==0)
        {
            if (year%100==0) // if divisible by 100, it is century year ex: 1800,1700
            {
                if (year%400==0)
                    leap= true;
                else
                    leap = false;
           }
            else
                leap=true;
        }
        else
            leap =false;
        System.out.println(year + " is leap year " + "-" + leap);


    }
}
/* if it is a century year it will be % by 100 so we have to check with %400 ... if it is divisible its leap year
* */