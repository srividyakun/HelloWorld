package Classes.ReferenceAndValueTypes;


import java.util.Arrays;

public class ReferenceAndValuesTypes {
    public static void main(String[] args) {

        int myValue = 10;
        int anotherValue =20;
        System.out.println("myValue is : "+myValue);
        System.out.println("another Value is : "+anotherValue);

        anotherValue = 30;
        System.out.println("myValue is : "+myValue);
        System.out.println("another Value is : "+anotherValue);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        System.out.println("myArray is : "+ Arrays.toString(myArray));
        System.out.println("anotherArray is : "+Arrays.toString(anotherArray));

        anotherArray[0] = 2;
        System.out.println("myArray is : "+ Arrays.toString(myArray));
        System.out.println("anotherArray is : "+Arrays.toString(anotherArray));

        modifyArray(anotherArray);
        System.out.println("myArray after modify : "+ Arrays.toString(myArray));
        System.out.println("anotherArray after modify : "+Arrays.toString(anotherArray));

        myArray = new int[]{1,2,3,4,5};
        System.out.println("myArray with new instance : "+ Arrays.toString(myArray));
        System.out.println("anotherArray after modify : "+Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] anotherArray) {
        anotherArray[1] = 3;
        anotherArray = new int[]{12,13,14,15,16};
    }
}
