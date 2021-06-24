package Practise;

public class Divider extends CalculateBase {
    private double leftVal;
    private double rightVal;

    public Divider(){

    }

    public Divider(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    @Override
    public void calculate(){
        double value = getLeftVal()/getRightVal();
        System.out.println("The output is : " +value);
    }
}
