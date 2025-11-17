import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) {
        int[] A = new int[10]; 
        int[] B = new int[10]; 
        Scanner scanner = new Scanner(System.in);

  
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1; // par
            } else {
                B[i] = 0; // impar
            }
        }

        // exibição A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }

        System.out.println("\nVetor B (1 = par, 0 = ímpar):");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        scanner.close();
    }
}
