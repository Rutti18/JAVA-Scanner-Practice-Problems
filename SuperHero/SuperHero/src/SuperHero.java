import java.util.Scanner;

public class SuperHero {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String reply = scan.nextLine();

        System.out.println("What is their superpower?");
        String reply2 = scan.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once there was a super hero named " + reply +  " who had the power of  " + reply2 + ".");
        System.out.println("As they grew older, " + reply + " saw that the world needed " + reply + " now." );
        System.out.println(reply + " used their ability to " + reply2 + " to save the world.");
    }
}
