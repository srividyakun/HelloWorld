package Classes;

public class UnderstandClassesAndObjects {

    public static void main(String[] args) {
        Flight flight1 = new Flight(); // object is created for Flight class
        // For each object created there will be a reference value ,which is assigned to the variable (flight1),but not object itself.
        System.out.println("the reference value for flight1 variable is :"+flight1);
        // To access members and methods ,decalre with variable dot member or method
        flight1.passengers = 2;
        flight1.addPassengers();
        System.out.println("the passenger list in the flight 1 is :"+flight1.passengers);
        Flight flight2 = new Flight();
        flight2.passengers= 3;
        flight2.addPassengers();
        System.out.println("the passenger list in the flight 2 is :"+flight2.passengers);

        flight2 = flight1; // assigning flight2 reference to flight1
        System.out.println("the passenger list in the flight 2 is :"+flight2.passengers);

    }
}
