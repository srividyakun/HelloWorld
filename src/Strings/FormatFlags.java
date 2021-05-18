package Strings;

public class FormatFlags {
    public static void main(String[] args) {
        int iVal = 32;
        int valA =100;
        int valB= 200;
        int valC = 300;
        int longiVal = 1234567;
        double longdVal = 1234567.0d;
        float fVal = 123.0f;
        String stringVal = "Hello";
        String s1 = String.format("%d",iVal);
        String s2 = String.format("%x",iVal);
        String s3 = String.format("%,d",longiVal);
        String s4 = String.format("%#x",iVal);
        String s5 = String.format("%f",fVal);
        String s6 = String.format("%s",stringVal);
        String s7 = String.format("%4d",iVal);
        String s8 = String.format("%04d",iVal);
        String s9 = String.format("%-4d",iVal);
        String s10 = String.format("%,.2f",longdVal);
        String s11 = String.format("%1$d %3$.1f %2$.1f",iVal,fVal,longdVal);
        String s12 = String.format("%2$d %<d %1$d", valA,valB,valC);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("iVal with width : "+s7);
        System.out.println("iVal with flag and width : "+s8);
        System.out.println("iVal with - flag and width : "+s9);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s12);
    }
}
