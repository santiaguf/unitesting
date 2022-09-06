package org.example.unitesting.util;

public class FizzBuzz {

    private static String Fizz = "Fizz";
    private static String Buzz = "Buzz";
    public static String fizzBuzz(int n){
        if (n % 3 == 0 && n % 5 == 0){
            return Fizz+Buzz;
        }
        if (n % 3 == 0){
            return Fizz;
        }
        if (n % 5 == 0){
            return Buzz;
        }
        return ""+n;
    }
}
