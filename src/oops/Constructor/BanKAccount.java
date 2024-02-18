package src.oops.Constructor;

public class BanKAccount {

    String bankName ;
    String bankCode;
    int bankbal;

    BanKAccount(){
        System.out.println("default constructor ");
        bankName = " SBI";
        bankCode = "SBI001";

    }

    BanKAccount(String bname , String bcode )
    {
        System.out.println("parametrized constructor");
        this.bankName = bname;
        this.bankCode = bcode;


    }

    void printdetails()
    {

        System.out.println("your bank name is " +this.bankName);
        System.out.println("your bank code is " + this.bankCode);
        System.out.println("your bankbal is " + bankbal);
    }
}
