package Inheritance;

// class A 
// {
//     public A()
//     {
//         System.out.println("in A");
//     }
//     public A(int a)
//     {
//         System.out.println("in A int");
//     }
// }

// class B extends A
// {
//     public  B()
//     {
//         System.out.println("in B");
//     }
//     public B(int a)
//     {
//         System.out.println("in B int "+a);
//     }
// }

// public class ThisAndSuperMethod 
// {
//     public static void main(String a[])
//     {
//         B obj = new B(1);  //calls A() then B()chés
        
//     }
    
// }

// it not genrate all constructor 




class A 
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int a)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A
{
    public  B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();
        System.out.println("in B int ");//+n);
    }
}

public class ThisAndSuperMethod 
{
    public static void main(String a[])
    {
        B obj = new B(5);  //calls A() then B()chés
        
    }
}