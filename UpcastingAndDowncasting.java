class A 
{
    public void show() 
    {
        System.out.println("This is class A");
    }
}
class B extends A
{
    public void showTwo() 
    {
        System.out.println("This is class B");
    }
}

public class UpcastingAndDowncasting 
{
    public static void main(String []args)    
    {   A obj = new B();
        obj.show(); // Upcasting, calls method from class A

        A obj1 = (A) new B(); // Upcasting
        obj1.show(); 

        B obj2 = (B) obj1; // Downcasting
        obj2.show();

        

    }

}
