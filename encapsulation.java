public class encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class encapsulation_Demo {
    public static void main(String[] args) 
    {
        encapsulation obj1 = new encapsulation();
        obj1.setName("John Doe");
        obj1.setAge(30);
        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());



    }
}

