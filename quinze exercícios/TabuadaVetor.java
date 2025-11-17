import java.util.Scanner;

public class TabuadaVetor {
    public static void main(String[] args) {
        int[] A = new int[5]; //5 posições
        Scanner scanner = new Scanner(System.in);

        // leitura dos 5 números
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // tabuada de cada número
        System.out.println("\nTabuadas dos números digitados:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("\nTabuada de " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }

        scanner.close();
    }
}

