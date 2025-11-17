import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        int[] A = new int[10]; 
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // ver se o vetor é palíndromo
        boolean ehPalindromo = true;
        for (int i = 0; i < A.length / 2; i++) {
            if (A[i] != A[A.length - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }

        
        if (ehPalindromo) {
            System.out.println("\nO vetor A é um palíndromo.");
        } else {
            System.out.println("\nO vetor A não é um palíndromo.");
        }

        scanner.close();
    }
}
