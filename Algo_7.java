import java.util.Scanner;

public class Algo_7 {
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

        String tempStr = "";
        String minStr = "                                                       ";
        String maxStr = "";

        for (int i = 0; i < newText.length; i++) {

            tempStr += newText[i];
            if(newText[i] == ' ') {
                // int count = 0;
                // for (int j = 0; j < tempStr.length()-1; j++) {
                //     count++;
                // }
                if (tempStr.length()>maxStr.length()) maxStr = tempStr;
                if (tempStr.length()<minStr.length()) minStr = tempStr;
                tempStr = "";
            }
        } 
        System.out.print("Shortest word is: "+minStr+"\n");
        System.out.print("Longest word is: "+ maxStr+"\n");
        
    }
}