package loopingAndArrays;

public class Arrays {
    public static void main(String[] args) {
        //we need to insitialize the array with new or we can assign the values to the array
        float[] neValues = {};
        float[] theValues = new float[3];
        theValues[0] = 10.1f;
        theValues[1] = 20.1f;
        theValues[2] = 30.1f;
        float sum = 0.0f;
        for (int index = 0; index<theValues.length; index++){
            sum += theValues[index];
        }
        System.out.println("Sum is :"+sum);
    }
}
