package inheritance.Example1;

public class FullLicensePilot extends Pilot {
    @Override
    public boolean canAccept(Flight f){
        return true;
    }

}
