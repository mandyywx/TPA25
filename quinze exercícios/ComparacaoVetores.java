import java.util.Scanner;

public class ComparacaoVetores {
    public static void main(String[] args) {
        int[] A = new int[10]; 
        int[] B = new int[10]; 
        int[] C = new int[10]; 
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        //comparação A e B
        for (int i = 0; i < C.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.println("\nResultado da comparação:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("A[" + i + "] = " + A[i] + ", B[" + i + "] = " + B[i] + " → C[" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}
