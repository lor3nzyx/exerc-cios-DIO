import java.util.Scanner;

public class exercicio8 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false; // Inicializa a variável de troca como falsa
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Troca arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true; // Indica que houve uma troca
                }
            }
            // Se não houve troca, o vetor já está ordenado
            if (!trocou) break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = {A,B,C};
        bubbleSort(arr);
        System.out.println("Array ordenado de maneira decrescente: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}