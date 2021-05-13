package ConditionalLogicAndBlockStatement;

public class IfElse {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result;
        char opCode = 'b';
        if(opCode == 'a'){
            result = value1 +value2;

        }else if(opCode == 'b'){
            result = value1 -value2;

        }else{
            result = 0.0d;
        }
        System.out.println(result);
    }
}
