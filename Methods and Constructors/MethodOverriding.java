class cal
{
    public int add(int a, int b) {
        return a + b;
    }

}
class advanceCal extends cal
{
    public int add(int a, int b ) {
        return a + b + 10; // Overriding the add method to add an extra 10
    }
}

public class MethodOverriding 
{
    public static void main(String[] args) {
        cal cal = new cal();
        advanceCal AdvCal = new advanceCal();
        
        int a = 5;
        int b = 3;
        
        System.out.println("Basic Calculator Addition: " + cal.add(a, b));
        System.out.println("Advanced Calculator Addition: " + AdvCal.add(a, b));
    }
    
}

