package inheritance.Example1;

public class Flight extends Object {
    int passengers;
    int seats = 150;
    int totalCheckedBags;
    public int flightNumber;
    private char flightClass;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    private static int allPassengers;
    Flight(){
        seats =150;
        passengers = 0;
    }

    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public void add1Passengers() {
        if (hasSeating()) {
            passengers += 1;
            allPassengers+=1;
        }else{
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many passengers");
    }

    private boolean hasSeating(int count) {
        return passengers+count <=seats;
    }

    public void add1Passengers(int bags) {
        if (hasSeating()) {
            add1Passengers();
            totalCheckedBags += bags;
        }
    }

    public void add1Passengers(Passenger p, int carryOns) {
        add1Passengers(p.getCheckedBags());
    }

    public void add1Passengers(Passenger p) {
        if (hasSeating()) {
            add1Passengers(p.getCheckedBags());
        }
    }

    public void add1Passengers(int bags, int carryOns) {
        if (carryOns<=2) {
            add1Passengers(bags);
        }
    }

    public static int getAllPassengers() {
        return allPassengers;
    }

    public static void resetAllPassengers(){
        allPassengers = 0;
    }
    public void addPassengers(Passenger[] list){
        if (hasSeating(list.length)) {
            passengers+= list.length;
            for(Passenger passenger : list){
                totalCheckedBags += passenger.getCheckedBags();
            }
        }
        System.out.println(totalCheckedBags);
    }

    public void addPassengers(String name,Passenger... list){
        if (hasSeating(list.length)) {
            passengers+= list.length;
            for(Passenger passenger : list){
                totalCheckedBags += passenger.getCheckedBags();
            }
        }
        System.out.println("Total checked bags of "+name + " are :" +totalCheckedBags);
    }

    private boolean hasSeating(){
        return passengers<seats;
    }

    static void swapFlightUsingReference(Flight i, Flight j){
        Flight k = i;
        i = j;
        j = k;
        System.out.println("Inside Method swapped values: The val1 : " +i.flightNumber +" the val2 : "+j.flightNumber);
    }

    static void swapFlightNumberUsingInstances(Flight i, Flight j){
        int k =  i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println("Inside Method swapped values: The val1 : " +i.flightNumber +" the val2 : "+j.flightNumber);
    }

    @Override
    public boolean equals(Object flight) {
        if(super.equals(flight))
            return true;

        if(flight instanceof Flight) {
            Flight f = (Flight) flight;
            return flightNumber == f.flightNumber && flightClass == f.flightClass;
        }else{
            System.out.println("Flight class is not instance of "+flight.getClass().getSimpleName());
        }
        return false;
    }

}

