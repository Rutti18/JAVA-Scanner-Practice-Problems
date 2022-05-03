import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Hi " +name);

    }
}
