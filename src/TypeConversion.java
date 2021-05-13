public class TypeConversion {
    public static void main(String[] args) {
        int intValueOne = 50;
        long longValueOne = intValueOne;
        //implicit conversion is automatically performed.
        System.out.println(longValueOne);
        long longValueTwo = 10L;
        int intValueTwo = (int) longValueTwo;
        // explicitly converting long operator to int by using cast operator(int)
        System.out.println(intValueTwo);


        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        short result1 = byteVal;
        // short result2 = longVal; need to cast with short , cannot assign long value to short
        short result2 = (short) longVal;
        short result3 = (short) (byteVal - longVal);
        //long result 4 = longVal -floatVal; converting to long would put us inﬂ danger of loosing the decimal portion of result
        float result4 = longVal - floatVal;
        System.out.println("Success");
    }
}
