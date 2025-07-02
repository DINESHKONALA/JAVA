package Keywords;
public class this_keyword {
    private String name; //this instance variable
    private int age; //this instance variable

    public String getName()
    {
        return name;
    } 

    public void setName(String name)
    {
        this.name = name; // 'this' keyword refers to the current instance variable
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age; // 'this' keyword refers to the current instance variable
    }
    
}
class this_keyword_Demo {
    public static void main(String[] args) 
    {
        this_keyword obj1 = new this_keyword();
        obj1.setName("John Doe");
        obj1.setAge(30);
        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
    }
}