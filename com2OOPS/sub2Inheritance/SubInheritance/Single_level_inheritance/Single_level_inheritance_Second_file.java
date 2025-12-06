package com2OOPS.sub2Inheritance.SubInheritance.Single_level_inheritance;

public class Single_level_inheritance_Second_file extends Single_level_inheritance_first_file 
{
    public int div(int a, int b) {
        return a / b;
        
    }
}

class Single_level_inheritance_Second_file_Demo {
    public static void main(String[] args) {
        Single_level_inheritance_Second_file calculator = new Single_level_inheritance_Second_file();
        
        int a = 20;
        int b = 4;
        
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.sub(a, b));
        System.out.println("Multiplication: " + calculator.mul(a, b));
        System.out.println("Division: " + calculator.div(a, b));
    }
}
