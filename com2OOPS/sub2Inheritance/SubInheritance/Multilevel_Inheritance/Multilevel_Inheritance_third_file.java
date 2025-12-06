package com2OOPS.sub2Inheritance.SubInheritance.Multilevel_Inheritance;

public class Multilevel_Inheritance_third_file extends Multilevel_Inheritance_second_file {
    public int mul(int a, int b) {
        return a * b;
    }
    
    
}

class Multilevel_Inheritance_third_file_Demo {
    public static void main(String[] args) {

        Multilevel_Inheritance_third_file thirdCalculator = new Multilevel_Inheritance_third_file();
        
        int a = 20;
        int b = 4;
        
        System.out.println("Addition: " + thirdCalculator.add(a, b));
        System.out.println("Subtraction: " + thirdCalculator.sub(a, b));   
        System.out.println("Division: " + thirdCalculator.div(a, b));
        System.out.println("Multiplication: " + thirdCalculator.mul(a, b));
    }
}

