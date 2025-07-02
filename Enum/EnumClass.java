package Enum;
enum Laptop 
{
    MacBook(2000),
    XPS(1500),
    ThinkPad(1000),
    Surface, // Default price will be used
    Chromebook(900),
    Alienware(2500),
    RazerBlade(2100);

    private int price;
    private Laptop() 
    {
        this.price = 700; // Default price for laptops without specified price
        System.out.println("in Laptop constructor: " + this + " - " + this.price);
    }
    private Laptop(int price) 
    {
        this.price = price;
        System.out.println("in laptop constructor " + this + " - " + price);
    }
    public int getPrice() 
    {
        return price;
    }
    

}
public class EnumClass 
{
    public static void main(String[] args) 
    {   
        System.out.println("---------------");
        Laptop lap = Laptop.XPS;
        System.out.println("---------------");
        System.out.println("Laptop: " + lap);
        System.out.println("Price: $" + lap.getPrice());
        System.out.println("---------------");

        for (Laptop i : Laptop.values())
        {
            System.out.println(i + " - $" + i.getPrice());
        }

    }



    
}
