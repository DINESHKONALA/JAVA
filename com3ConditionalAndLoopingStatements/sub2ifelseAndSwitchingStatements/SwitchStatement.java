package com3ConditionalAndLoopingStatements.sub2ifelseAndSwitchingStatements;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3; // Example day of the week (1-7)

        // Using switch statement to determine the day of the week
        switch (day) { 
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a = ");
        int a = sc.nextInt();
        
        System.out.print("enter value of b = ");
        int b = sc.nextInt();
        
        System.out.print("enter an op = ");
        char c = sc.next().charAt(0);
        
        switch (c) {
            case '-' :
                System.out.println(a-b);
                break;
            
            case '+':
                System.out.println(a+b);
                break;
            
            case '*':
                System.out.println(a*b);
                break;
                
            
            case '/' :
                System.out.println(a/b);
                break;
    
            
            default:
                System.out.println("invalid op");
        }
        
    }

    } 

