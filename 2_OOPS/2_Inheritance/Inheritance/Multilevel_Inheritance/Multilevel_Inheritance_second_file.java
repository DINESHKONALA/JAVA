package Inheritance.Multilevel_Inheritance;

public class Multilevel_Inheritance_second_file  extends Multilevel_Inheritance {
    public int div(int a, int b) {
        return a / b;
    }

}

class Multilevel_Inheritance_second_file_Demo {
    public static void main(String[] args) {

        Multilevel_Inheritance_second_file secondCalculator = new Multilevel_Inheritance_second_file();
        
        int a = 20;
        int b = 4;
        
        System.out.println("Addition: " + secondCalculator.add(a, b));
        System.out.println("Subtraction: " + secondCalculator.sub(a, b));   
        System.out.println("Division: " + secondCalculator.div(a, b));
    }
}

