public class typeconversion {
    public static void main(String []arg)
    {
        byte b = 10;
        b = (byte)(b + 10); // Explicit conversion from int to byte
        System.out.println("Byte value: " + b);
    }
    
}
