package Classes;

public class ThisReference {
    private  int passengers;
    private int seats;

    public boolean hasRoom(Flight f2,int passengers){
        int total = this.passengers +f2.passengers+passengers;
        return total<= seats;
    }

}
