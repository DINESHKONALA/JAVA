public class constructor {
    private int age; // instance variable
    private String name; // instance variable
    public constructor() // constructor never has a return type, not even void
    { // the constructor looks like method but it has the same name as the class
        // Default constructor
       age = 30;
       name = "john doe";
    }
    public constructor(String name) // parameterized constructor
    {
        System.out.println("Constructor called with name: " + name);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // 'this' keyword refers to the current instance variable
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // 'this' keyword refers to the current instance variable
    }
}
class constructor_Demo {
    public static void main(String[] args) 
    {
        constructor obj1 = new constructor(); // calls the default constructor
        System.out.println("Object created with default constructor: " + obj1 + "   and age is " + obj1.getAge() + " and name is " + obj1.getName());

        constructor obj2 = new constructor("John Doe"); // calls the parameterized constructor
        System.out.println("Object created with default constructor: " + obj2);
    }

}

