package inheritance.Example1;

public class CargoFlight extends Flight{
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats =12;

    // when declared no one can override the method when inherited
    public final void add1Package(float h, float w, float d){
        float size = h*w*d;
        if(hasCargoSpace(size)){
            usedCargoSpace+=size;
        }else{
            handleNoSpace();
        }
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace+size <= maxCargoSpace;
    }


}
