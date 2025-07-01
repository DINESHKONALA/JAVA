class A
{   
    
    public void Show()
    {
        System.out.println("in A class");
        

    }
    class B
    {
        public void config()
        {
            System.out.println("in B class");
        }
    }
}


public class InnerClass
{
    public static void main(String[]args)
    {
        A obj = new A();
        obj.Show();
    }
}