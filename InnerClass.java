class OutSideClass
{   
    
    public void Show()
    {
        System.out.println("in A class");
        

    }
    class InsideClass
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
        OutSideClass obj = new OutSideClass();
        obj.Show();

        OutSideClass.InsideClass obj2 = obj.new InsideClass(); // Creating an instance of the inner class B
        obj2.config(); // Calling the method of the inner class B
    }
}