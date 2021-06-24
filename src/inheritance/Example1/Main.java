package inheritance.Example1;

import  static inheritance.Example1.Flight.getAllPassengers;
import  static inheritance.Example1.Flight.*; // import all static members of flight class

public class Main {
    public static void main(String[] args) {
        //understanding classes as references
        //changes made to one those variables are still reflected in other varaible that reference that same object instance
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passengers();
        System.out.println("the no of passengers"+flight2.passengers);//1

        flight2 = flight1;// flight2 reference points to flight1's instance
        System.out.println("the no of passengers"+flight2.passengers);//0

        flight1.add1Passengers();
        flight1.add1Passengers();
        System.out.println("the no of passengers"+flight2.passengers);//2


        Flight f = new Flight();

        //by passing array of passengers
        Passenger luisa = new Passenger(0,1);
        Passenger john = new Passenger(0,2);
        f.addPassengers(new Passenger[]{luisa,john});
        Passenger math = new Passenger(0,3);
        Passenger tony = new Passenger(0,4);
        Passenger rex = new Passenger(0,1);
        Passenger lucy = new Passenger(0,0);
        f.addPassengers(new Passenger[]{luisa,john,math,tony,rex,lucy});

        //using variable number of parameters (ellipse)-- method itself recives parameters as an array
        f.addPassengers("Anil",luisa,john);


        CargoFlight cf = new CargoFlight();
        cf.add1Package(1.0f,2.5f,3.0f);



        //staticMembers
        Flight.resetAllPassengers(); // access with class name
        Flight laxToSlc = new Flight();
        laxToSlc.add1Passengers();
        laxToSlc.add1Passengers();
        Flight dfwToNyc = new Flight();
        dfwToNyc.add1Passengers();
        //static values shares single value with in instances
        System.out.println("Total passengers : "+getAllPassengers());

        //Passing Object as Parameters
        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);
        System.out.println("######Changes to references are visible within method and not visible out side#####");
        swapFlightUsingReference(val1, val2);
        System.out.println("Outside Method swapped values: The val1 : " +val1.flightNumber +" the val2 : "+val2.flightNumber);

        System.out.println("#######Changes to Instances are visible within method and also out side######");
        swapFlightNumberUsingInstances(val1,val2);
        System.out.println("Outside Method swapped values: The val1 : " +val1.flightNumber +" the val2 : "+val2.flightNumber);

        //Overloading
        Flight.resetAllPassengers();
        Flight flightOverloading = new Flight();
        f.add1Passengers();
        f.add1Passengers(2);

        Passenger passengerOverloading1 = new Passenger(0,1);
        flightOverloading.add1Passengers(passengerOverloading1);

        Passenger passengerOverloading2 = new Passenger(0,2);
        flightOverloading.add1Passengers(passengerOverloading2,1);

        short threeBags = 3;
        //compiler will take care converting short to int since there is nooverloaded method with parameter of type short
        flightOverloading.add1Passengers(threeBags,2);

        //Inheritance
        Flight.resetAllPassengers();
        CargoFlight cargoFlight = new CargoFlight();
        Passenger jack = new Passenger(0,2);
        cargoFlight.add1Passengers(jack);
        cargoFlight.add1Package(1.0f,2.5f,3.0f);

        // References to derived class instances can be assigned to base calss references
        Flight.resetAllPassengers();
        Flight flightRef = new CargoFlight();
        Passenger jackRef = new Passenger(0,2);
        flightRef.add1Passengers(jack);
        //flightRef.add1Package(1.0f,2.5f,3.0f); //is not possible because the methods we can access are tied to the type of reference

        Flight.resetAllPassengers();
        Flight[] squadron = new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new CargoFlight();


        //Field hIding
        Flight f1 = new Flight();
        System.out.println(f1.seats);//150

        CargoFlight cf1 = new CargoFlight();
        System.out.println(cf1.seats);//12

        Flight f2 = new CargoFlight();
        System.out.println(f2.seats);//150
        f2.add1Passengers();
        cf1.add1Passengers();

        //Object equality
        Flight flightEquality1 = new Flight();
        Flight flightEquality2 = new Flight();
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();
        System.out.println("the equal method of base calss Object  method :"+flightEquality1.equals(passenger2));
        System.out.println("the equal method of base calss Object  method :"+passenger1.equals(passenger2));
        System.out.println("Equality of overridden method : "+flightEquality1.equals(flightEquality2));


        //super
        Flight flightSuper = new Flight(175);
        Flight flightSuper2 = flightSuper;
        System.out.println("the equality of instances :"+flightSuper2.equals(flightSuper));
    }
}
