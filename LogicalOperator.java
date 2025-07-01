public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        boolean result1 = a<b && b<a; // Logical AND
        boolean result2 = a>b || b>a; // Logical OR
        boolean result3 = a>b; // Logical NOT
        result3 = !result3; // Negating the result of a>b
        // Displaying the results

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("a < b && b < a: " + result1);
        System.out.println("a > b || b > a: " + result2);
        System.out.println("!(a > b): " + result3);
        System.out.println("Logical operations completed successfully.");
        
    }
}
