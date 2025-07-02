class same_method_name{
    int same_method(int a , int b, int c){
        return a + b +c; // Method to add two integers
    }
    int same_method(int a , int b){
        return a + b; // Method to add two integers
    }
    double same_method(double a , int b){
        return a + b; // Method to add two doubles
    }

}
public class method_overloading {
    public static void main(String[] arg){
        same_method_name method_overloading1 = new same_method_name(); // Creating an object of the same_method_name class

        var result=method_overloading1.same_method(1, 2, 3); // Calling the first overloaded method with three integers
        System.out.println("Result of same_method with three integers: " + result);

        var result2=method_overloading1.same_method(4, 5); // Calling the second overloaded method with two integers
        System.out.println("Result of same_method with two integers: " + result2); 

        var result3=method_overloading1.same_method(6.5, 7); // Calling the third overloaded method with a double and an integer
        System.out.println("Result of same_method with a double and an integer: " + result3);

    }
}
