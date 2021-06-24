package Classes;

public class VariableLengthArgsList {
    public static void main(String[] args) {
        VariableLengthArgsList variableLengthArgsList = new VariableLengthArgsList();
        //using variable length argument list
        int totalPassenges = variableLengthArgsList.addPassengers("Anil",2,3,4,56);
        System.out.println(totalPassenges);

        variableLengthArgsList.addPassengers("Srividya",new int[]{3,4,5});

        //using array
        int[] passList = {1,5,6};
        variableLengthArgsList.addPassengers(passList);


    }

    public int addPassengers(String passengerName, int... noOfPassengers){
        int totalPassengers = 0;
        for(int passengers : noOfPassengers) {
            totalPassengers += passengers;
        }
        return totalPassengers;
    }

    public int addPassengers(int[] noOfPassengers){
        int totalPassengers = 0;
        for(int passengers : noOfPassengers) {
            totalPassengers += passengers;
        }
        return totalPassengers;
    }
}
