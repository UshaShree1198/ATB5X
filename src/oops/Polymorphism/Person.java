package src.oops.Polymorphism;

public class Person {


    int  speak(int x  )
    {
        System.out.println(x);
        return x;
    }

    void speak(boolean a)
    {
        System.out.println(a);
    }

    void speak(float f)
    {
        System.out.println(f);
    }


}


// same method different parameters- method overloading