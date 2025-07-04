public class Default_Constructor_vs_Parameterized_Constructor {
    private int age;
    private String name;

    // Default constructor
    // the default constructor initializes the instance variables with default values
    public Default_Constructor_vs_Parameterized_Constructor() {
        
    }


    // the parameterized constructor initializes the instance variables with provided values
    public Default_Constructor_vs_Parameterized_Constructor(String name) {
        // Initialize with default values
        this.age = 30;
        this.name = "John Doe";
    }
    public Default_Constructor_vs_Parameterized_Constructor(int age, String name) {
        // Initialize with default values
        this.age = 30;
        this.name = "John Doe";
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // 'this' keyword refers to the current instance variable
    }
    public String getName() {
        return name; // 'this' keyword refers to the current instance variable
    }
    public void setName(String name) {
        this.name = name; // 'this' keyword refers to the current instance variable
    }

}

class Default_Constructor_vs_Parameterized_Constructor_Demo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Default_Constructor_vs_Parameterized_Constructor obj1 = new Default_Constructor_vs_Parameterized_Constructor();

        // Creating an object using the parameterized constructor
        Default_Constructor_vs_Parameterized_Constructor obj2 = new Default_Constructor_vs_Parameterized_Constructor("John Doe");

        Default_Constructor_vs_Parameterized_Constructor obj3 = new Default_Constructor_vs_Parameterized_Constructor(25, "Jane Doe");

        // Displaying the objects
        System.out.println("Object created with default constructor: " + obj1 + "   and age is " + obj1.getAge() + " and name is " + obj1.getName());
        System.out.println("Object created with parameterized constructor: " + obj2 + "  and age is " + obj2.getAge() + " and name is " + obj2.getName());    
        System.out.println("Object created with parameterized constructor: " + obj3 + "  and age is " + obj3.getAge() + " and name is " + obj3.getName());
    }
}

