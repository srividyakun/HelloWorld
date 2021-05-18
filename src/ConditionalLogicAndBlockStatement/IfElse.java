package ConditionalLogicAndBlockStatement;

public class IfElse {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0;
        char opCode = 'b';
        if(opCode == 'a'){
            result = value1 +value2;

        }else if(opCode == 'b')
            //if there is no block statement then else will also be printed out , because below else considers nearest if satement
            if(value2!=0.0)
            result = value1 -value2;
        else {
            //if there are no block, the code executes on sout statement and result will be printed as 0.0
            System.out.println("Invalid Opcode:" + opCode);
            result = 0.0d;
        }
        System.out.println(result);
    }
}
