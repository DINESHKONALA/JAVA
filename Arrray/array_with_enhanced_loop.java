package Arrray;
class HighSchoolStudents
{
    String name;
    int roll_no;
    String section;
}
public class array_with_enhanced_loop 
{
    public static void main(String[] args) 
    {
        // students_name[] HighSchoolStudents = new students_name[3]; // Creating an array of students_name objects
        // HighSchoolStudents[0] = new students_name();
        // HighSchoolStudents[0].name = "John";  // Assigning values to the array elements
        // HighSchoolStudents[1] = new students_name();
        // HighSchoolStudents[1].name = "Jane";  // Assigning values to the array elements[TOOL_CALLS]
        // HighSchoolStudents[2] = new students_name();[TOOL_CALLS]
        // HighSchoolStudents[2].name = "Doe";  // Assigning values to the array elements[TOOL_CALLS]

        HighSchoolStudents s1 = new HighSchoolStudents();
        s1.name = "John";  // Assigning values to the array elements
        s1.roll_no = 1; // Assigning roll number
        s1.section = "A"; // Assigning section
        HighSchoolStudents s2 = new HighSchoolStudents();
        s2.name = "Jane";  // Assigning values to the array elements
        s2.roll_no = 2; // Assigning roll number
        s2.section = "B"; // Assigning section
        HighSchoolStudents s3 =  new HighSchoolStudents();
        s3.name = "Doe";  // Assigning values to the array elements
        s3.roll_no = 3; // Assigning roll number
        s3.section = "C"; // Assigning section

        HighSchoolStudents students_details[] = new HighSchoolStudents[3];
        students_details[0] = s1;
        students_details[1] = s2;
        students_details[2] = s3;

        for (HighSchoolStudents student : students_details)  // Using enhanced for loop to iterate through the array
        {
            System.out.println("Roll No: " + student.roll_no); // Using enhanced for loop to iterate through the array
            System.out.println("Name: " + student.name); // Using enhanced for loop to iterate through the array
            System.out.println("Section: " + student.section); // Using enhanced for loop to iterate through the array
            System.out.println(); // New line for better readability
        }



    }
}