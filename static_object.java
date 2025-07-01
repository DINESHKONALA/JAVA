class mobile
{
    String brand;
    String model;   
    int price;
    static String operating_system = "Smart Phone"; // Static variable shared by all instances
    public void show_details()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Operating System: " + operating_system); // Accessing static variable
    }
    public static void setOperatingSystem(mobile obj) {
        System.out.println("Brand: " + obj.brand); // Accessing instance variable
        System.out.println("Model: " + obj.model); // Accessing instance variable
        System.out.println("Price: " + obj.price); // Accessing instance variable
        System.out.println("Operating System: " + operating_system); // Accessing static variable
    }
}
public class static_object 
{
    public static void main(String[] arg)
    {
        mobile m1 = new mobile();   
        mobile m2 = new mobile();   
        mobile m3 = new mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S21";        
        m1.price = 799;
        mobile.operating_system = "Android"; // Setting the static variable for all instances
        m1.show_details(); // Displaying details of the first mobile
        System.out.println(); // New line for better readability
        m2.brand = "Apple";
        m2.model = "iPhone 13";
        m2.price = 999;
        mobile.operating_system = "iOS"; // Setting the static variable for all instances
        m2.show_details(); // Displaying details of the second mobile
        System.out.println(); // New line for better readability
        m3.brand = "Google";
        m3.model = "Pixel 6";
        m3.price = 599;
        mobile.operating_system = "Android"; // Setting the static variable for all instances
        m3.show_details(); // Displaying details of the third mobile
        System.out.println(); // New line for better readability



    }

}
