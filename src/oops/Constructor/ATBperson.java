package src.oops.Constructor;

public class ATBperson {


    String name;
    long phno;
    boolean ismarried;
    int age;


    ATBperson()
    {
        System.out.println("CONSTRUCTOR IS CALLED");

    }


          void talk()
    {
        System.out.println("talk");
    }

     void printDetails()
    {
    System.out.println(name);
    System.out.println(phno);
    System.out.println(ismarried);
        }

}
