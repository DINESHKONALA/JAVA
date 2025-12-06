package com1Basics.sub2Operators;
public class ComparisitionOperator 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;

        boolean result;
        result = a == b; // Equal to
        var result2 = (a != b); // Not equal to
        var result3 = (a < b); // Less than     
        var result4 = (a > b); // Greater than
        var result5 = (a <= b); // Less than or equal to
        var result6 = (a >= b); // Greater than or equal to
        System.out.println("Values of a and b are: " + a + " and " + b);
        System.out.println("a == b: " + result);
        System.out.println("a != b: " + result2);
        System.out.println("a < b: " + result3);

        System.out.println("a > b: " + result4);
        System.out.println("a <= b: " + result5);
        System.out.println("a >= b: " + result6);

    }
}

