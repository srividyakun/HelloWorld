package com.pluralsights.organized;

public class FinalModifier {
    public static void main(String[] args) {
        final int maxStudents = 25; // varible values cannot be changed once set
        final int someVariable;
        int someOtherVariable = 100;
        someVariable = someOtherVariable;
        System.out.println(someVariable);
        System.out.println(maxStudents);

    }
}
