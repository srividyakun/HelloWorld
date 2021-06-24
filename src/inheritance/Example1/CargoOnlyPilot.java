package inheritance.Example1;

public class CargoOnlyPilot extends Pilot{

    @Override
    public boolean canAccept(Flight f){
        return f.getPassengers() == 0;
    }
}
