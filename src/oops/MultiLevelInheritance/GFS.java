package src.oops.MultiLevelInheritance;

public class GFS {

    public static void main(String[] args) {
         Son s = new Son();
          // g has access to only 3bhk not 2bhk and 1bhk
         s.bhk3();
         s.bhk2();
         s.bhk1();
    }
}

/* here son can acquire properties from grandfather and father */

/*  Granfather g = new son(); is not possible (parent reference can access the child object
     Father f = new son(); not posible

*/