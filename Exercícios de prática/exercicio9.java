import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Double peso;
        Scanner sc = new Scanner(System.in);

        System.out.println("|| Calculadora de IMC ||");
        System.out.println("------------------------");
        System.out.println("                        ");

        //confere o peso (kg)
        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();

        //confere a altura (m)
        System.out.println("Digite a sua altura em metros: ");
        Double altura = sc.nextDouble();

        //calcula o imc
        Double imc = peso / (altura * altura);

        //confere a faixa de peso
        if (imc <= 18.5) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Você está abaixo do seu peso!");
        }
        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Peso ideal! Parabéns! ;)");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Você está levemente acima do seu peso!");
        }
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Você está com Obesidade Grau I... Procure um médico.");
        }
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Você está com Obesidade Grau II (Severa)... Procure um médico com urgência...");
        }
        else if (imc >= 40) {
            System.out.println("Seu IMC é " + imc);
            System.out.println("Você está com Obesidade Grau III (Mórbida)... Risco de vida, procure ajuda imediatamente...");
        }

        System.out.println("                        ");
        System.out.println("------------------------");
    }
}
