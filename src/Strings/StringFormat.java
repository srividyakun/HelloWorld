package Strings;

public class StringFormat {
    public static void main(String[] args) {
        int david = 17;
        int dawson = 15;
        int dillon = 8;
        int gordon = 6;

        double avg = ((david-dawson)+(dawson-dillon)+(dillon-gordon))/3.0d;
        // concatenation method (is a bit difficult to concatenate and build string piece by piece)
        String s1 = "My nephews are "+ david + ", "+dawson+ ", "+ dillon+" and "+gordon+" years old.";
        System.out.println(s1);
        //String format method (is much easier to build)
        String s2 = String.format("My nephews are %d, %d, %d and %d years old.",david,dawson,dillon,gordon);
        System.out.println(s2);

        String s3 = "The avg age between each is "+ avg +" years";
        System.out.println(s3);

        // you can specify how many decimals can be shown using format
        String s4 = String.format("The avg age between each is %.1f years",avg);
        System.out.println(s4);


    }
}
