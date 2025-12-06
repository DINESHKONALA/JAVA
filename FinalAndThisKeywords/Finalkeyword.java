package FinalAndThisKeywords;
class FinalVariable {
    final int constantValue = 42; // Final variable

    public void displayConstant() {
        System.out.println("The constant value is: " + constantValue);
    }
}

class FinalMethod {
    public final void displayMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}
class SubClass extends FinalMethod {
    // This will cause a compile-time error if we try to override displayMessage
    // public void displayMessage() {
    //     System.out.println("Trying to override a final method.");
    // }
}


final class FinalClass 
{
    public void show() {
        System.out.println("This is a final class and cannot be extended.");
    }
} 
// class ExtendedFinalClass extends FinalClass 
// { 
//     // This will cause a compile-time error
//     // Cannot extend a final class
// }

public class Finalkeyword 
{
    public static void main(String[] args)
    {
        FinalVariable var = new FinalVariable();

        var.displayConstant(); // Output: The constant value is: 42}
    }
}

