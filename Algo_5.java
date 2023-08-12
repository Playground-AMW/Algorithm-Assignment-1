import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input = " ";

        do {
            System.out.print("Enter a text: ");
            input = scanner.nextLine();
        } while (input.isBlank());

        char[] text = input.toCharArray();

        for (int i = 0; i < (text.length/2); i++) {
            char temp = ' ';
            temp = text[text.length-(i+1)];
            text[text.length-(i+1)] = text[i];
            text[i] = temp;
        }

        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
        System.out.println();
        
    }
}
