package Challenges.Arrays;


import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5,6};

        reverse(myArray);
    }

    private static void reverse(int[] array){
        int maxIndex  = array.length-1;
        int halfIndex = array.length/2;
        for(int i = 0;i<halfIndex;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
