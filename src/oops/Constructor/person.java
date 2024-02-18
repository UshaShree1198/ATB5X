package src.oops.Constructor;

public class person {

    String name;
    String breed;
    int age;

    person()
    {
        name = "seetha";
        breed = "indian";
        age = 15;
        System.out.println("default constructor");

    }

    person(String name_ref , String breed_ref)
    {
        System.out.println("parameterised constructor");
        this.name = name_ref;
        this.breed = breed_ref;
    }


    void printDetails()
    {
        System.out.println(this.name);
        System.out.println(this.breed);
    }
}

//this is current obj reference