package com3ConditionalAndLoopingStatements.sub1ForLoopAndWhileLoopLoopingStatements.subsubWhileLoop;
import java.util.Scanner;
public class ExampleOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n = sc.nextInt();
        int s = 0;
        while (n>0){
            int  r = n % 10;
            s += r;
            n /= 10;
            

        }
        System.out.print(s); 
    }
    
}
