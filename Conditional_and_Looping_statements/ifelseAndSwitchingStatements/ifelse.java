public class ifelse {
    public static void main(String []arg){
        int a = 10;
        int b = 33;
        int c = 50;
        
        if (a<b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is greater than b");
        }

        if (a < b && b < c) 
            System.out.println("a is less than b and b is less than c");
        else if (a > b || b > c) 
            System.out.println("Either a is greater than b or b is greater than c");
        else 
            System.out.println("Neither condition is true");
        
    }
}

