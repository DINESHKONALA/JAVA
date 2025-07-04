

class sam{
    static void name(String name) {
        System.out.println("Hello, " + name + " 1");
    }
    void n(String name) {
        System.out.println("Hello, " + name + "2");
    }
    sam(){
        System.out.println("Constructor called");
    }
    public static void main(String[] args) {
        name("sam");
        sam obj = new sam();
        obj.n("sam");



    }
    public class practice extends sam {
        practice(String l) {
            System.out.println("Home constructor called" + l);
        }

        
    }
}


