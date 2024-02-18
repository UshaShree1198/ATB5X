package src.oops.Constructor;



public class car {

    String carName;
    String carOrigin;

    car() {

        carName = "MARUTHI SUZUKI";
        carOrigin = "INDIA";
        System.out.println("default");
    }


    car(String name, String origin) {
        this.carName = name;
        this.carOrigin = origin;
    }

    void printdetails() {
        System.out.println("carname is " + this.carName + "& carorigin is " + this.carOrigin);

    }
}