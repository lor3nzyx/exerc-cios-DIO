import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Double valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = sc.nextDouble();

        Double i = valor + (valor * 0.05);
        System.out.println("Total: " + i);
    }
}
