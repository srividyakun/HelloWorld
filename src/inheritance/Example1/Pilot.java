package inheritance.Example1;

public abstract class Pilot extends Flight{
    private Flight currentFlight;

    public void fly(Flight f){
        if(canAccept(f)){
            currentFlight = f;
        }else {
            handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight f);

    private void handleCantAccept(){
        System.out.println("Can't accept");
    }
}
