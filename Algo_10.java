import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count;
        String input;
        do {
            count = 0;
            System.out.println("Enter the phone number according to the one of a following format.");
            System.out.println("1. +94 XX XXX XXXX\n2. 0XX-XXXXXXX\n");
            System.out.print("Enter the phone number: ");
            input = scanner.nextLine();

            if (input.isBlank()) System.out.println("Telephone number can't be empty\n");
            char[] inputChar = input.toCharArray();

            for (char c : inputChar) 
            count = (c=='+') ? 0 : (c=='-') ? 0 : (c==' ') ? 0 : (!Character.isDigit(c)) ? 1:0;
            if (count>0) System.out.println("Please enter numbers!");

        } while (input.isBlank()||count>0);

        String[] number;

        if (input.startsWith("+94")) {
            number = input.split(" ");
            if (number[1].length() != 2 ||number[1].contains("-")||number[1].contains("+") ||
                number[2].length() != 3 ||number[2].contains("-")||number[2].contains("+") ||
                number[3].length() != 4 ||number[3].contains("-")||number[3].contains("+"))
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        } else if (input.startsWith("0")) {
            number = input.split("-");
            if (number[0].length() != 3 || number[0].contains("-")||number[0].contains("+") ||
                    number[1].length() != 7 || number[1].contains("-")||number[1].contains("+"))
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        } else System.out.println("Invalid phone number.");
    }

}
