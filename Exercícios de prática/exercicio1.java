import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

       int A;
       int B;
       int C;
       int Soma;
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite um valor para A: ");
       A = sc.nextInt();

       System.out.println("Digite um valor para B: ");
       B = sc.nextInt();

       System.out.println("Digite um valor para C: ");
       C = sc.nextInt();

       Soma = A + B;

       if (Soma < C) {
           System.out.println("A soma é igual a: " + Soma + "que é menor que " + C);
       }
       else {
           System.out.println("Soma não é menor que " + C);
       }

    }
}