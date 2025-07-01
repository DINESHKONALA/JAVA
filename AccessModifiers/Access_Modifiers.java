package AccessModifiers;
// package sub_package;
import AccessModifiers.SubPackage.*;

class Pri extends Private {
    // This class is just to demonstrate that Private class cannot be accessed outside its package.


}
class Pro extends Protected {
    // This class is just to demonstrate that Protected class can be accessed in the same package or by subclasses.
}
class pub extends Public {
    // This class is just to demonstrate that Public class can be accessed from anywhere.
}
class def extends Default {
    // This class is just to demonstrate that Default class can only be accessed within its own package.
}

class SubClass extends subclasses {
    // This class is just to demonstrate that subclasses can access protected members of the parent class.
    // public int getMarks() {
    //     return Marks;
    //      // Accessing protected member from parent class
    // }
    // public String getName() {
    //     return Name;
    //      // Accessing protected member from parent class
    // }
}


public class Access_Modifiers {

    public static void main(String[] args) {
        {
            // //protected file cannot be accessed outside its package`
            // SubClass subClassObj = new SubClass();
            // System.out.println("Protected Marks from SubClass: " + subClassObj.Marks);
            // System.out.println("Protected Name from SubClass: " + subClassObj.Name);
        }

        {
            // Pri PrivateObj = new Pri();
            // System.out.println("Private Marks: " + PrivateObj.marks); // Accessing private class using getters[←]
            // System.out.println("Private name: " + PrivateObj.name); // Accessing private class using getters[←]
            
            Pro ProtectedObj = new Pro();
            System.out.println("Protected Marks: " + ProtectedObj.Marks); // Accessing protected class
            System.out.println("Protected Name: " + ProtectedObj.Name); // Accessing protected class
            
            pub PublicObj = new pub();
            System.out.println("Public Marks: " + PublicObj.marks); // Accessing public class   
            System.out.println("Public Name: " + PublicObj.name); // Accessing public class

            // def DefaultObj = new def();
            // System.out.println("Default Marks: " + DefaultObj.Marks); // Accessing default class
            // System.out.println("Default Name: " + DefaultObj.Name); // Accessing default class


        }


        {
        // Accessing Public class
        Public publicObj = new Public();
        System.out.println("Public Marks: " + publicObj.marks);
        System.out.println("Public Name: " + publicObj.name);

        // Accessing Protected class
        Protected protectedObj = new Protected();
        System.out.println("Protected Marks: " + protectedObj.Marks);
        System.out.println("Protected Name: " + protectedObj.Name);

        // // Accessing Default class
        // Default defaultObj = new Default();
        // System.out.println("Default Marks: " + defaultObj.Marks);
        // System.out.println("Default Name: " + defaultObj.Name);

        // // Accessing Private class
        // Private privateObj = new Private();
        // System.out.println("Private Marks: " + privateObj.marks);
        // System.out.println("Private name: " + privateObj.name);
        }
    }
    
}
