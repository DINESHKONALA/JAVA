// import java.util.Arrays;

public class sample 
{ 
    public static void main(String[] args) 
    { 
String a = "lets go";
System.out.println(a.replace("g" , "t"));   // lets to
System.out.println(a.replace("go" , "us go"));  // lets us go
System.out.println(a.replaceAll("go","go*"));   // lets go*     }
    }
}