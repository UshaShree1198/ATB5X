package src.basics;



public class primeNumber {
    public static  void main(String[] args) {
        //divisible by 1 and itself eg:5,17,19
 int y= 17;
        for (int i= 2; i<y ; i++)
        {
            if (y % i == 0) {
                System.out.println(y + " is not prime number");
                return;
            }
        }

            System.out.println("prime");
        }



     }

