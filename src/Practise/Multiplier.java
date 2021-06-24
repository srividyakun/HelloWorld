package Practise;

public class Multiplier extends CalculateBase{

    private double leftVal;
    private double rightVal;


    public Multiplier(){

    }
    public Multiplier(double leftVal, double rightVal) {

        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    @Override
    public void calculate(){
        double value = getLeftVal()*getRightVal();
        System.out.println("the output is : "+value);
    }
}
