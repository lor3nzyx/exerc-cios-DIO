import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        int minAge = 18;
        int myAge;
        Scanner sc = new Scanner(System.in);

        System.out.println("Posso votar?");
        System.out.println("Digite sua idade: ");
        myAge = sc.nextInt();

        if (myAge >= minAge) {
            System.out.println("Você já pode votar!");
        }
        else {
            System.out.println("Você não pode votar ainda...");
        }
    }
}
