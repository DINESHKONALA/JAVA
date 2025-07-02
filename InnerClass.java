class OutSideClass
{   
    
    public void Show()
    {
        System.out.println("in OutSideClass");
        

    }
    class InsideClass
    {
        public void config()
        {
            System.out.println("in InsideClass");
        }
    }
    static class StaticInsideClass
    {
        public void config()
        {
            System.out.println("in StaticInsideClass");
        }
    }
}


public class InnerClass
{
    public static void main(String[]args)
    {
        OutSideClass obj = new OutSideClass();
        obj.Show();

        OutSideClass.InsideClass obj2 = obj.new InsideClass(); // Creating an instance of the inner class 
        obj2.config(); // Calling the method of the inner class 

        OutSideClass.StaticInsideClass obj3 = new OutSideClass.StaticInsideClass(); // Creating an instance of the static inner class 
        obj3.config();
    }
}