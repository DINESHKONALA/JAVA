package job;
public class recursion {
    public static boolean palindrome(String str) {
        if (str == null) return false;
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String Recursion(String str) {
        if (str.isEmpty()) return str;
        return Recursion(str.substring(1)) + str.charAt(0);
    }
    public static int fatorial(int n){
        if (n==0 | n==1) return 1;
        return n*fatorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(palindrome("madam")); // true
        System.out.println(reverse("madam")); //
        System.out.println(Recursion("madam")); // madam 
        System.out.println(fatorial(31)); // 120

        System.out.println(); 

        System.out.println(palindrome("hello")); // false
        System.out.println(reverse("hello")); // olleh

        System.out.println(palindrome("303"));
        System.out.println(reverse("303"));



        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b); // 20 10



        String s = "nani";
        String s2 = s.toUpperCase(), s3 = "";
        System.out.println(s2.toLowerCase());
        System.out.println(s2);
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s3 += s.charAt(i); 
            }else {
                s3 += s2.charAt(i);
            }
        }
        System.out.println(s3);
        String s4 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s4 += Character.toUpperCase(s.charAt(i));
            } else {
                s4 += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(s4);


    }
}
