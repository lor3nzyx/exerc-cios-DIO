import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Double salarioMinimo = 1293.20;
        Double salarioUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        salarioUsuario = sc.nextDouble();

        Double i = salarioUsuario / salarioMinimo;
        System.out.println("Seu salário representa " + i + " salário(s) mínimo(s)");
    }
}
