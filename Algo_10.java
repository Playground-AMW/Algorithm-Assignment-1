import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        do {
            System.out.println("Enter the phone number according to the one of a following format.");
            System.out.println("1. +94 XX XXX XXXX\n2. 0XX-XXXXXXX\n");
            System.out.print("Enter the phone number: ");
            input = scanner.nextLine();
            if (input.isBlank())
                System.out.println("Telephone number can't be empty\n");
        } while (input.isBlank());

        String[] number;

        if (input.startsWith("+94")) {
            number = input.split(" ");
            if (number[0].length() != 3 ||
                    number[1].length() != 2 ||
                    number[2].length() != 3 ||
                    number[3].length() != 4)
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        }
        if (input.startsWith("0")) {
            number = input.split("-");
            if (number[0].length() != 3 ||
                    number[1].length() != 7)
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        } else
          System.out.println("Invalid phone number.");

    }

}
