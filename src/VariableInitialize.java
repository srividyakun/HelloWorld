package com.pluralsights.organized;

public class VariableInitialize {
    public static void main(String[] args) {
        int myVar; // variable is declared but not initialized
        myVar = 10; // myVar is initialized
        System.out.println(myVar);
        int anotherVar = 50; // initialized anotherVar
        System.out.println(anotherVar);
        myVar= anotherVar;// anotherVar value is assigned to myVar
        System.out.println(myVar);
    }
}
