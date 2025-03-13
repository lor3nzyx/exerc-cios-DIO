import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        int Valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Valor = sc.nextInt();

        int i = Valor - 1;
        System.out.println("Antecessor: " + i);

        int j = Valor + 1;
        System.out.println("Sucessor: " + j);
    }
}
