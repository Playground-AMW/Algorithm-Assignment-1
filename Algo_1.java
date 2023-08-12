import java.util.Scanner;

public class Algo_1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number;
        do {
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 0);

        System.out.print("Fibonacci sequence up to " + number + " is: ");
        if (number == 0) System.out.print("0, ");
        else if (number == 1) System.out.println("0, 1,");
        else {
            int x = 0;
            int y = 1;
            int z;

            System.out.print(x + ", " + y + ", ");

            do {
                z = x + y;
                int temp = y;
                y = z;
                x = temp;
                System.out.print(z + ", ");
            } while (z + y < number);
        }

        System.out.println("\b\b ");
    }
}