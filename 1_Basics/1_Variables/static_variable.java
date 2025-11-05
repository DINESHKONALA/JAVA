class mobile_info
{
    String brand;
    String model;
    int price;
    static String operating_system; // = "Smart Phone"; // Static variable shared by all instances

    public void show_details()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("name : " + operating_system); // Accessing static variable
    }


}
public class static_variable 
{
    public static void main(String[] arg)
    {
        mobile_info m1 = new mobile_info();
        m1.brand = "Samsung";
        m1.model = "Galaxy S21";    
        m1.price = 799;
        mobile_info.operating_system = "Android"; // Setting the static variable for all instances
        m1.show_details(); // Displaying details of the first mobile
        System.out.println(); // New line for better readability

        mobile_info m2 = new mobile_info();
        m2.brand = "Apple";     
        m2.model = "iPhone 13";
        m2.price = 999;
        mobile_info.operating_system = "iOS"; // Setting the static variable for all instances
        m2.show_details(); // Displaying details of the second mobile
        System.out.println(); // New line for better readability

        mobile_info m3 = new mobile_info();
        m3.brand = "Google";
        m3.model = "Pixel 6";
        m3.price = 599;
        mobile_info.operating_system = "Android"; // Setting the static variable for all instances
        m3.show_details(); // Displaying details of the third mobile
        System.out.println(); // New line for better readability




    }
}

