import java.util.Arrays;

public class DiferencaConjuntos {
    public static void main(String[] args) {
        // vetoes A e B com 10 elementos
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {5, 6, 7, 20, 30, 40, 8, 9, 50, 60};

        // vetor auxiliar para colocar a diferença
        int[] temp = new int[A.length];
        int count = 0;

        // percorre por cada elemento A
        for (int i = 0; i < A.length; i++) {
            boolean existeEmB = false;

            // ve se A[i] tem no B
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    existeEmB = true;
                    break; // já achou, não precisa continuar
                }
            }

            // se não tem b coloca no temp
            if (!existeEmB) {
                temp[count] = A[i];
                count++;
            }
        }

        // vetor c com o tamanho da diferença
        int[] C = Arrays.copyOf(temp, count);

        
        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B: " + Arrays.toString(B));
        System.out.println("Diferença (A - B): " + Arrays.toString(C));
    }
}
