package Arrray;
class students
{
    int roll_no;
    String name;
    String section;

}
public class array_of_object 
{
   public static void main(String[] args)
   {
    students s1 = new students();
    s1.roll_no = 1;
    s1.name = "John";
    s1.section = "A";

    students s2 = new students();
    s2.roll_no = 2;
    s2.name = "Jane";
    s2.section = "B";

    students students[] = new students[2]; // Creating an array of students objects
    students[0] = s1; // Assigning first student object to the array element[TOOL_CALLS]
    students[1] = s2; // Assigning 

    for(int i = 0; i < students.length; i++) 
    {
        System.out.println("Roll No: " + students[i].roll_no);
        System.out.println("Name: " + students[i].name);
        System.out.println("Section: " + students[i].section);
        System.out.println(); // New line for better readability
    }

   } 
}
