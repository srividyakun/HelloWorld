package Practise;

import java.time.LocalDate;
import java.util.Scanner;

public class CalcEngineApplication {

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.setLeftVal(leftVal);
        mathEquation.setRightVal(rightVal);
        mathEquation.opCode = opCode;
        return mathEquation;
    }

    public static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode,leftVal,rightVal);
        System.out.println(result);
    }

    public static double execute(char opCodes,double leftVals, double rightVals) {
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
        double value = -1d;
        for(int index = 0; index<numberword.length;index++){

            if(numberword[index].equalsIgnoreCase(word)){
                value = index;
                break;
            }
        }
        if(value == -1d){
            value = Double.parseDouble(word);
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
        if(operationCharater == 'w'){
            handelWhen(splitedText);
        }else {
            char symbol = symbolFromOpCode(operationCharater);
            double leftValue = valueFromWord(splitedText[1]);
            double rightValue = valueFromWord(splitedText[2]);
            double result = execute(operationCharater, leftValue, rightValue);

        /*StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(leftValue);
        stringBuilder.append(" ");
        stringBuilder.append(symbol);
        stringBuilder.append(" ");
        stringBuilder.append(rightValue);
        stringBuilder.append(" = ");
        stringBuilder.append(result);
        String toltalResult = stringBuilder.toString();*/
            String toltalResult = String.format("%.2f %c %.2f = %.2f", leftValue, symbol, rightValue, result);

            System.out.println("the result is : " + toltalResult);
        }
    }

    private static void handelWhen(String[] splitedText) {
        LocalDate startDate = LocalDate.parse(splitedText[1]);
        long daysToAdd = (long)valueFromWord(splitedText[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s plus %d days is %s",startDate,daysToAdd,newDate);
        System.out.println(output);
    }
}
