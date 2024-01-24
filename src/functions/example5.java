package src.functions;

import jdk.dynalink.beans.StaticClass;

public class example5 {

    public static void main(String[] args) {
        System.out.println("Beginning");
        String  name = method("ending");
        System.out.println(name);
    }

     static  String method(String a)
     {
         System.out.println("middle");
         return a ;
     }


}
