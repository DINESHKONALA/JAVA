// package Basics.Input;
import java.util.Scanner;
public class INPUT
{
    public static void main(String [] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("enter a integer value");
        int a = obj1.nextInt();
        System.out.println("this is a integer value ="+a);

        System.out.println("enter a double value");
        double b = obj1.nextDouble();
        System.out.println("this is a double value ="+b);

        System.out.println("enter the value of float");
        float c = obj1.nextFloat();
        System.out.println("this is a float value"+c);
        
        System.out.println("enter value of boolean=");
        boolean d = obj1.nextBoolean();
        System.out.println("this the value of bool");      
        
        float ss= 28.324f ;
        System.out.println("this is a float value"+ss);
        
        System.out.println("enter a value of char");
        char e = obj1.next().charAt(2);
        System.out.println("this is a char value =" + e);
        
        System.out.println("enter the value string");
        String f = obj1.next();
        System.out.println("this is a string value" + f);
        
    }
}