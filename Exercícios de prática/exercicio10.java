import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        float notaA;
        float notaB;
        float notaC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas três notas: ");
        notaA = sc.nextFloat();
        notaB = sc.nextFloat();
        notaC = sc.nextFloat();

        //calcula a média das notas
        float media = (notaA + notaB + notaC) / 3;

        System.out.println("Sua média é: " + media);
    }
}
