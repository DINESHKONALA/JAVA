package Inheritance;

public class AdvCal extends Cal
{
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class AdvCal_Demo {
    public static void main(String[] args) {
        AdvCal advCal = new AdvCal();
        
        int a = 10;
        int b = 5;
        
        System.out.println("Addition: " + advCal.add(a, b));
        System.out.println("Subtraction: " + advCal.sub(a, b));
        System.out.println("Multiplication: " + advCal.mul(a, b));
        System.out.println("Division: " + advCal.div(a, b));
    }
}
