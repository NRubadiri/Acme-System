package ver1;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello from Eclipse");
        System.out.println("Neema is working locally on her branch");
        heyNow();
        whatFor("Neema");
    }
    
    public static void heyNow() {
        System.out.println("hey now");
    }
    
    public static void whatFor(String stringArg) {
        System.out.println(stringArg + ", what for?");
    }

}