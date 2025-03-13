import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        int A;
        int B;
        int C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor A: ");
        A = sc.nextInt();

        System.out.println("Digite um valor B: ");
        B = sc.nextInt();

        if (A == B) {
            C = A + B;
        }
        else {
            C = A * B;
        }

        System.out.println("Resultado: " + C);
    }
}