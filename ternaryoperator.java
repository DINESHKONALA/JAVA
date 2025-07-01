public class ternaryoperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Using the ternary operator to find the maximum of a and b
        int max = (a > b) ? a : b;

        // Displaying the result
        System.out.println("The maximum value between " + a + " and " + b + " is: " + max);
        var result = c%2 == 0 ? 10 : 20;
        System.out.println("The result of the ternary operation is: " + result);
    }
}
