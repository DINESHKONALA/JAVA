package Annotation;
@Deprecated // This is an annotation indicating that the class is deprecated
class  A
{
    public void method() {
        System.out.println("Method in class A");
    }
}
class B extends A
{
    @Override // This is an annotation indicating that this method overrides a method in the superclass
    public void method() {
        System.out.println("Method in class B");
    }
}
public class Annotation 
{
    public static void main(String[] args) {
        A a = new A();
        a.method(); // Calls method in class A

        B b = new B();
        b.method(); // Calls overridden method in class B
    }
}


