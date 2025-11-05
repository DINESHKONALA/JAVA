public class AnonymousObject {
    public AnonymousObject() {
        // Default constructor
        System.out.println("Default constructor called");
    }
    public void show() {
        // Parameterized constructor
        System.out.println("Parameterized constructor called ");
    }
}
class AnonymousObjectDemo {
    public static void main(String[] args) {
        // Creating an anonymous object
        System.out.println();
        new AnonymousObject().show(); // Calls the show method of the anonymous object
        System.out.println();
        new AnonymousObject(); // Calls the default constructor of the anonymous object
        System.out.println();
        new AnonymousObject().show();
    }
}
