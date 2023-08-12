import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input = "";

        do {
            System.out.print("Enter sentences: ");
            input = scanner.nextLine();
        } while (input.isBlank());

        char[] text = input.toCharArray();
        char[] newText = new char[text.length+1];
        for (int i = 0; i < text.length; i++) {
            newText[i]=text[i];
        }
        newText[newText.length-1] = ' ';

        char ch;
        String tempStr = "";
        String revStr = "";

        for (int i = 0; i < newText.length; i++) {

            tempStr += newText[i];
            if(newText[i] == ' ') {
                for (int j = 0; j < tempStr.length()-1; j++) {
                    ch = tempStr.charAt(j);
                    revStr = ch + revStr;
                }
                System.out.print(revStr+ " ");
                tempStr = "";
                revStr = "";
                ch = ' ';
            }
        }        
    }
}
