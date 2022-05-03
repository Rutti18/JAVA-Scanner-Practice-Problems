import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String reply = scan.nextLine();
    
        System.out.println("Wow - Interesting! Tell me more!" );
        String reply2 = scan.nextLine();
    
        System.out.println("Nice talking to you, Goodbye!");
    
    }
}
