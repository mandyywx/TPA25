import java.util.Scanner;

public class BuscaNoVetor {
    public static void main(String[] args) {
        int[] A = new int[10]; 
        Scanner scanner = new Scanner(System.in); 

        // leitura do A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // leitura do X que queremos achar
        System.out.print("\nDigite o número que deseja buscar (X): ");
        int X = scanner.nextInt();

        // busca
        boolean encontrado = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                encontrado = true;
                System.out.println("Elemento " + X + " encontrado na posição A[" + i + "].");
                break; // para a busca depois de encontrar
            }
        }

        if (!encontrado) {
            System.out.println("Elemento " + X + " não encontrado no vetor A.");
        }

        scanner.close(); 
    }
}
