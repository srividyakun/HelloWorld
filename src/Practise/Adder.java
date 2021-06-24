package Practise;

public class Adder extends CalculateBase{
    double leftVal;
    double rightVal;

    public Adder() {
    }

    public Adder(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    @Override
    public void calculate(){
    double value = getLeftVal()+getRightVal();
    setResult(value);
    }
}
