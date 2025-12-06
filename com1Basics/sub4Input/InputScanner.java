package com1Basics.sub4Input;
import java.util.Scanner;
public class InputScanner
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a integer value");
        int a = sc.nextInt();
        System.out.println("this is a integer value ="+a);

        System.out.println("enter a double value");
        double b = sc.nextDouble();
        System.out.println("this is a double value ="+b);

        System.out.println("enter the value of float");
        float c = sc.nextFloat();
        System.out.println("this is a float value"+c);
        
        System.out.println("enter value of boolean=");
        boolean d = sc.nextBoolean();
        System.out.println("this the value of bool");      
        
        float ss= 28.324f ;
        System.out.println("this is a float value"+ss);
        
        System.out.println("enter a value of char");
        char e = sc.next().charAt(2);
        System.out.println("this is a char value =" + e);
        
        System.out.println("enter the value string");
        String f = sc.next();
        System.out.println("this is a string value" + f);
        
    }
}