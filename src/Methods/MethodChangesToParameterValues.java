package Methods;

public class MethodChangesToParameterValues {

    public static void main(String[] args) {
        int val1 = 10;
        int val2= 20;
        System.out.println("Actual values of val1 and val2 :" +val1 +" "+ +val2);
        swap(val1, val2);
        System.out.println("Actual values of val1 and val2 :" +val1 +" "+ +val2);
    }
    static void swap(int i , int j){
        int k = i;
        i = j;
        j= k;
        System.out.println("Swapped values of val1 and val2 : "+i +" "+ +j);
    }
}
