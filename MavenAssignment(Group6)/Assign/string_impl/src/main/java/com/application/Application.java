package com.application;

public class Application {
    public static void main(String[] args){

        /* Here we are making the object of StringFunction class and calling it's methods */
        String stringInput = "Hey! Hope you doing fine? ";

        StringFunctions object = new StringFunctions();

        System.out.println("The original string is : Hey! Hope you doing fine?");

        System.out.println("The Reverse of the string is : " + object.stringReverse(stringInput));
        System.out.println("The Length of the string is : " + object.stringLength(stringInput));
    }
}
