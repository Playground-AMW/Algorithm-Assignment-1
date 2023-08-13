public class Algo_8_3 {
    public static void main(String[] args) {
        
        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };

        myLoop:
        for (int i = 0; i < numA.length; i++) {
            
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) continue myLoop;
                    
            }
            System.out.print(numA[i] + ", ");
        }
        System.out.println("\b\b ");
    }
}
