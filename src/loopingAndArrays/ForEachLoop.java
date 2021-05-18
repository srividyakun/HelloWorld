package loopingAndArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'a','b','c','d'};
        double result[] = new double[opCodes.length];

        for(int i = 0;i< opCodes.length;i++){
            switch (opCodes[i]){
                case 'a':
                    result[i]= leftVals[i]+rightVals[i];
                    break;
                case 'b':
                    result[i]= leftVals[i]-rightVals[i];
                    break;
                case 'c':
                    result[i]= leftVals[i]*rightVals[i];
                    break;
                case 'd':
                    result[i]= rightVals[i]!=0?leftVals[i]/rightVals[i]:0.0d;
                    break;
                default:
                    System.out.println("Invalid OpCode: " +opCodes[i]);
                    result[i] =0.0d;
                    break;
            }
            System.out.println(result[i]);
        }

        for (double currentResult : result){
            System.out.println("currentResult : "+currentResult);
        }
    }
}
