class A
{
    public void show()
    {
        System.out.println("This is class A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("This is class B");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("This is class C");
    }
}
public class DynamicMethodDispatch {
 public static void main(String[]arg)
 {
    A obj = new A();
    obj.show();

    obj = new B(); // Upcasting
    obj.show(); // Calls B's show method

    obj = new C(); // Upcasting
    obj.show(); // Calls C's show method
 }   

}

