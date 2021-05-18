import java.util.Scanner;

public class CalcEngineApplication {
    public static void main(String[] args) {
        //performs operation with user input
        executeInteractively();

        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'a','b','c','d'};
        double result[] = new double[opCodes.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                result[i] = execute(opCodes[i],leftVals[i], rightVals[i]);
                // System.out.println(result[i]);
            }
            for (double currentResult : result) {
                System.out.println("currentResult : " + currentResult);
            }
            // when given args in terminal ex:java src/CalcEngineApplication.java a 20 30, result will be 50
        }else if(args.length==3){
            handleCommandLine(args);
        }else{
            System.out.println("Please provode an operation code and 2 numeric values");
        }
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode,leftVal,rightVal);
        System.out.println(result);
    }

    private static double execute(char opCodes,double leftVals, double rightVals) {
        double result;
        switch (opCodes){
            case 'a':
                result= leftVals+ rightVals;
                break;
            case 's':
                result= leftVals- rightVals;
                break;
            case 'm':
                result= leftVals* rightVals;
                break;
            case 'd':
                result= rightVals!=0? leftVals/ rightVals:0.0d;
                break;
            default:
                System.out.println("Invalid OpCode: " + opCodes);
                result =0.0d;
                break;
        }
        return result;
    }

    static double valueFromWord(String word) {
        String[] numberword = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        double value = 0;
        for(int index = 0; index<numberword.length;index++){

            if(numberword[index].equalsIgnoreCase(word)){
                value = index;
                break;
            }
        }
        return value;
    }

    static char opCodeFromString(String operationName){
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static char symbolFromOpCode(char opCode){
        char[] opCodes = {'a','s','m','d'};
        char[] symbols = {'+','-','*','/'};
        char symbol = ' ';
        for (int i = 0;i<opCodes.length;i++){
            if(opCode == opCodes[i]){
                symbol = symbols[i];
                break;
            }
        }
        return symbol;
    }

    static void executeInteractively(){
        System.out.println("Enter operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String[] splitedText = inputText.split(" ");

        char operationCharater =  opCodeFromString(splitedText[0]);
        char symbol =  symbolFromOpCode(operationCharater);
        double leftValue = valueFromWord(splitedText[1]);
        double rightValue = valueFromWord(splitedText[2]);
        double result = execute(operationCharater,leftValue,rightValue);
        /*StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(leftValue);
        stringBuilder.append(" ");
        stringBuilder.append(symbol);
        stringBuilder.append(" ");
        stringBuilder.append(rightValue);
        stringBuilder.append(" = ");
        stringBuilder.append(result);
        String toltalResult = stringBuilder.toString();*/
        String toltalResult = String.format("%.2f %c %.2f = %.2f",leftValue,symbol,rightValue,result);

                System.out.println("the result is : "+toltalResult);
    }
}
