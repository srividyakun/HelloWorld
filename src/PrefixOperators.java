public class PrefixOperators {
    public static void main(String[] args) {
        int someValue = 5;
        System.out.println(someValue++);
        System.out.println(someValue);
        int someOtherValue = 5;
        System.out.println(++someOtherValue);
        System.out.println(someOtherValue);

        //compund assignment (+=,-=,/=,*=,%=)
        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;
        myOtherValue /= val1 *val2;
        System.out.println(myOtherValue);

        //operator precedence
        int valA = 21;
        int valB = 6;
        int valC= 3;
        int valD= 1;

        int result1 = valA -valB / valC;
        int result2 = (valA-valB)/valC;
        int result3= valA/valC*valD+valB;
        int result4 = valA /(valC * (valD+valB));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
