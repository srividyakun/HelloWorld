package Practise;

public class Subtractor extends CalculateBase {

    private double leftVal;
    private double rightVal;

    public Subtractor(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public Subtractor() {
    }

    @Override
    public void calculate(){
        double value = getLeftVal()-getRightVal();
        setResult(value);
    }
}
