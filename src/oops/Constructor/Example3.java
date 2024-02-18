package src.oops.Constructor;

public class Example3 {
    public static void main(String[] args) {

        BanKAccount sbi = new BanKAccount();
        sbi.printdetails();
        System.out.println("-----------------------------");

        BanKAccount hdfc = new BanKAccount("HDFC","HDFC002");
        hdfc.printdetails();
        System.out.println("-----------------------------");


        BanKAccount axis = new BanKAccount("AXIS","AXIS003");
        axis.printdetails();
        System.out.println("-----------------------------");

        BanKAccount union = new BanKAccount("UNION", "UNION004");
        union.printdetails();
        System.out.println("-----------------------------");

    }
}
