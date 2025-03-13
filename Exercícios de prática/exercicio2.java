import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        int Numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Numero = sc.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("É par");
        }
        else {
            System.out.println("É ímpar");
        }

        if (Numero > 0) {
            System.out.println("É positivo");
        }
        else {
            System.out.println("É negativo");
        }
    }
}