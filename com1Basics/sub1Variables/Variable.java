package com1Basics.sub1Variables;
public class Variable{
    public static void main(String a[]) 
    {
        int d = 10;
        byte b = 127;
        short short1 = 10000;
        long long1 = 9223372036854775807L;
        float f = 3.14f;
        double du = 123456789.987654321;
        var c = b + d + short1 + long1 + f + du; // This line will cause an error because 'result' is not defined
        System.out.println("The result is: " + c );

    }
    
}

