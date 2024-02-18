package src.oops.SingleInheritance;

public class Programming {

    String author;
    int version;

    Programming()
    {
        System.out.println("programming default constructor");
    }

    Programming(String author, int version)
    {
        this.author = author;
        this.version = version;
        System.out.println("parametrized constructor" );
    }


    void printdeets()
    {
        System.out.println("author is " + this.author + " and version is " + this.version);
    }
}
