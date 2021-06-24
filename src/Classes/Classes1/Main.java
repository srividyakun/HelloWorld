package Classes.Classes1;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("the model is :" +porsche.getModel());
        porsche.setModel("daa");
        System.out.println("the model is :" +porsche.getModel());
    }
}
