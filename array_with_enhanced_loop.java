class students
{
    String name;
    int roll_no;
    String section;
}
public class array_with_enhanced_loop 
{
    public static void main(String[] args) 
    {
        // students_name[] students = new students_name[3]; // Creating an array of students_name objects
        // students[0] = new students_name();
        // students[0].name = "John";  // Assigning values to the array elements
        // students[1] = new students_name();
        // students[1].name = "Jane";  // Assigning values to the array elements[TOOL_CALLS]
        // students[2] = new students_name();[TOOL_CALLS]
        // students[2].name = "Doe";  // Assigning values to the array elements[TOOL_CALLS]

        students s1 = new students();
        s1.name = "John";  // Assigning values to the array elements
        s1.roll_no = 1; // Assigning roll number
        s1.section = "A"; // Assigning section
        students s2 = new students();
        s2.name = "Jane";  // Assigning values to the array elements
        s2.roll_no = 2; // Assigning roll number
        s2.section = "B"; // Assigning section
        students s3 =  new students();
        s3.name = "Doe";  // Assigning values to the array elements
        s3.roll_no = 3; // Assigning roll number
        s3.section = "C"; // Assigning section

        students students_details[] = new students[3];
        students_details[0] = s1;
        students_details[1] = s2;
        students_details[2] = s3;

        for (students student : students_details)  // Using enhanced for loop to iterate through the array
        {
            System.out.println("Roll No: " + student.roll_no); // Using enhanced for loop to iterate through the array
            System.out.println("Name: " + student.name); // Using enhanced for loop to iterate through the array
            System.out.println("Section: " + student.section); // Using enhanced for loop to iterate through the array
            System.out.println(); // New line for better readability
        }



    }
}