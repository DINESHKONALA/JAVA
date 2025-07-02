
class math{
    public int add(int a, int b) { // Method to add two integers
        // The method takes two integers as parameters and returns their sum    
        int n = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + n); 

        return n;// Returning the sum of the two integers
    }
    public int mul(int z , int y){
        int p = z * y;
        System.out.println("The product of " + z + " and " + y + " is: " + p);
        return p;
    }
}
public class class_and_object {
    public static void main(String[] arg){
        int d = 10;
        int c = 20;

        math ad = new math(); // Creating an object of the math class
        // Using the object to call the add method
        // int result = ad.add(d, c);
        ad.add(d,c);
        math mu = new math(); // Creating another object of the math class
        // Using the object to call the mul method
        int result2 = mu.mul(d,c);
        System.out.println("The result of multiplication is: " + result2);
        
        




        
    }
    
}
