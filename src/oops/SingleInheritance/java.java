package src.oops.SingleInheritance;

public class java extends Programming
{
    String  newfeature ;


    java(){
        System.out.println("java deafault constructor");
    }


  java(String FEATURE)  {
        this.newfeature = FEATURE ;
  }

    void printdetails(){
        System.out.println("new feature is "+ this.newfeature);
    }


}

