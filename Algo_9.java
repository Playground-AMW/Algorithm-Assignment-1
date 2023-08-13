import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String input = "";

        do {
            System.out.print("Enter sentences: ");
            input = scanner.nextLine();
        } while (input.isBlank()||input.contains(" "));

        char ch;
        String revstr = "";

        for (int i = 0; i < input.length(); i++) {
           ch = input.charAt(i);
           revstr = ch + revstr; 
        }

        if (revstr.equalsIgnoreCase(input)) System.out.println(input + " is a palindrome");
        else System.out.println(input + " isn't a palindrome");
    }
}
