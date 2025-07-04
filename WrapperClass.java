
public class WrapperClass 
{
    public static void main(String[]args) 
    {
        int num = 10;
        Integer num1 = new Integer(num); // boxing

        int num2 = num1; // autounboxing

        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer: " + num1);
        System.out.println("Autounboxed int: " + num2);

        String str = "123";
        Integer num3 = Integer.parseInt(str); // parsing String to Integer
        System.out.println("Parsed Integer from String: " + num3);
    }   
}
