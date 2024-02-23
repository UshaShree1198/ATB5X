package src.oops.Polymorphism;

public class MethodoverRide {
    public static void main(String[] args) {


        Dog d = new Dog();
        d.bark();

        Dog f = new Hound(); // parent reference - child obj ===>> Dynamic dispatch
        f.bark();


//        Hound H= new Dog(); - NOT POSSIBLE it is like child wants to attend mothers wedding which is not possible
    }

}
