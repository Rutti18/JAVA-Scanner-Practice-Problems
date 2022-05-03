import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = scan.nextLine();

        System.out.println("Enter an integer: ");
        int number = scan.nextInt();

        System.out.println("Enter a double: ");
        double dble = scan.nextDouble();

        System.out.println("Enter a boolean value: ");
        boolean boo = scan.nextBoolean();

        System.out.println("Your string is " + text );
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + dble);
        System.out.println("Your boolean is " + boo);






        

    }
}
