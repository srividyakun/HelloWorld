package Practise;

import Classes.Classes1.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //performs operation with user input
        //executeInteractively();

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double result[] = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];//when we create an array is very much declared as a primitive type, by identifying type MathEquation
        //creating a MathEquation array with 4 references but not 4 instances.
        // for each refernces in the array we need to explicitly create an instance
        equations[0] = new MathEquation();
        equations[0].leftVal = 100.0d;
        equations[0].rightVal = 50.0d;
        equations[0].opCode = 'a';

        //using constructors
        equations[0] = new MathEquation('d', 100.0d, 50.0d);

        //using method
        CalcEngineApplication calcEngineApplication = new CalcEngineApplication();
        equations[1] = calcEngineApplication.create(25.0d, 92.0d, 'a');
        equations[2] = calcEngineApplication.create(225.0d, 17.0d, 's');
        equations[3] = calcEngineApplication.create(11.0d, 3.0d, 'm');

        for (MathEquation mathEquation : equations) {
            mathEquation.execute();
            String toltalResult = String.format("%.2f %c %.2f = %.2f", mathEquation.leftVal, calcEngineApplication.symbolFromOpCode(mathEquation.opCode), mathEquation.rightVal, mathEquation.result);
            System.out.println("the result is : " + toltalResult);
        }

        System.out.println("Average result :" + MathEquation.getAverage());


        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                result[i] = calcEngineApplication.execute(opCodes[i], leftVals[i], rightVals[i]);
                // System.out.println(result[i]);
            }
            for (double currentResult : result) {
                System.out.println("currentResult : " + currentResult);
            }
            // when given args in terminal ex:java src/Practise.CalcEngineApplication.java a 20 30, result will be 50
        } else if (args.length == 3) {
            calcEngineApplication.handleCommandLine(args);
        } else {
            System.out.println("Please provode an operation code and 2 numeric values");
        }

        //equation overload
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(9.0d,4.0d);
        System.out.println("Overloaded result with doubles "+equationOverload.getResult());

        //java can automatically perfom widening conversion
        equationOverload.execute(9,4);
        System.out.println("Overloaded result with int Values "+equationOverload.getResult());

        //Hiding fields and Overriding method
        Divider divider = new Divider();
        doCalculation(divider,100.0d,2.0d);

        // FOr methods it is the type instance that determines which method to use
        CalculateBase cb = new Adder();
        doCalculation(cb,100.0d,2.0d);

        CalculateBase actualCB = new CalculateBase();
        doCalculation(actualCB,100.0d,2.0d);

        //ENUMS
        executeInteractively();


    }

    private static CalculateBase createCalculation(MathOperation operation,double leftVal, double rightVal){
        CalculateBase calculateBase = null;
        switch (operation){
            case ADD:
                calculateBase = new Adder(leftVal,rightVal);
                break;
            case SUBTRACT:
                calculateBase = new Subtractor(leftVal,rightVal);
                break;
            case MULTIPLY:
                calculateBase = new Multiplier(leftVal,rightVal);
                break;
            case DIVIDE:
                calculateBase = new Divider(leftVal,rightVal);
                break;
        }
        return calculateBase;
    }

    public static void executeInteractively(){
        System.out.println("Enter the operation to perform and values ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
    double leftVal = Double.parseDouble(parts[1]);
    double rightVal = Double.parseDouble(parts[2]);
    CalculateBase calculateBase = createCalculation(operation,leftVal,rightVal);
    calculateBase.calculate();
        System.out.println("Operation performed " +operation.name());
    }

    static  void doCalculation(CalculateBase calculateBase,double leftVal, double rightVal){
        calculateBase.setLeftVal(leftVal);
        calculateBase.setRightVal(rightVal);
        calculateBase.calculate();
        System.out.println("Calculation result : " + calculateBase.getResult());
    }

    static void performCalculation(){

    }
}
