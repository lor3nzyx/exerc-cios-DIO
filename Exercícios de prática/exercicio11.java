import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        String nome;
        float notaA, notaB, notaC, notaD;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        notaA = sc.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        notaB = sc.nextFloat();
        System.out.println("Digite a terceira nota do aluno: ");
        notaC = sc.nextFloat();
        System.out.println("Digite a quarta nota do aluno: ");
        notaD = sc.nextFloat();

        float media = (notaA + notaB + notaC + notaD) / 4;

        if (media >= 7) {
            System.out.println("A média foi: " + media);
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("A média foi: " + media);
            System.out.println("Aluno reprovado...");
        }
    }
}
