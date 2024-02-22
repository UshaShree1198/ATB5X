package src.oops.Encapsulation;

public class Example1 {

    public static void main(String[] args) {

        Employee E = new Employee(270);
        E.setAge(25);
        E.setId(270);
        E.setName("USHA");
        System.out.println("employee age is" + E.getAge());
        System.out.println("employee id is " + E.getId());
        System.out.println("employee name is " + E.getName());
    }




}
