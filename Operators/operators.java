package Operators;
public class operators {
    public static void main(String []arg){
        int a = 111;
        var b = a + 1; // Incrementing a by 1
        var c = a ;
        c++; // Incrementing c by 1, but this does not affect a
        var d = a;
        ++d; // Incrementing d by 1, but this does not affect a either
        var e = a;
        e += 1; // Incrementing e by 1, but this does not affect a
        var f = a;
        f -= 1; // Decrementing f by 1, but this does not affect a
        var g = a;
        g--; // Decrementing g by 1, but this does not affect a
        var h = a;
        --h; // Decrementing h by 1, but this does not affect a either

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);
        System.out.println("The value of d is: " + d);
        System.out.println("The value of e is: " + e);
        System.out.println("The value of f is: " + f);
        System.out.println("The value of g is: " + g);
        System.out.println("The value of h is: " + h);
        System.out.println("The value of a after all operations is: " + a);
    }
}
