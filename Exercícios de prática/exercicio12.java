import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        //variáveis
        int caneta = 5, lapis = 2, borracha = 3, apontador = 10;
        int produto = 0;
        float pagamento = 0;
        Scanner sc = new Scanner(System.in);

        //informações
        System.out.println("Tabela de preços:");
        System.out.println("1 - Caneta - R$ " + caneta);
        System.out.println("2 - Lápis - R$ " + lapis);
        System.out.println("3 - Borracha - R$ " + borracha);
        System.out.println("4 - Apontador - R$ " + apontador);
        System.out.println();
        System.out.println("||-------------------------||");
        System.out.println();
        System.out.println("Formas de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, juros de 10%");
        System.out.println();

        //cliente seleciona o produto desejado
        System.out.println("Digite o número do produto desejado: ");
        int valorProd = sc.nextInt();

        //verifica o produto desejado e armazena o valor na variável "produto"
        switch (valorProd) {
            case 1:
                produto = caneta;
                break;
            case 2:
                produto = lapis;
                break;
            case 3:
                produto = borracha;
                break;
            case 4:
                produto = apontador;
                break;
        }

        //verifica a forma de pagamento
        System.out.println("Digite o número da forma de pagamento desejada: ");
        int formaDePagamento = sc.nextInt();

        //calcula o valor final baseado na forma de pagamento
        switch (formaDePagamento) {
            case 1:
                pagamento = (float) (produto - (produto * 0.15));
                break;
            case 2:
                pagamento = (float) (produto - (produto * 0.10));
                break;
            case 3:
                pagamento = produto;
                break;
            case 4:
                pagamento = (float) (produto + (produto * 0.10));
        }

        //imprime o valor final na tela
        System.out.println();
        System.out.println("O valor a pagar é: R$" + pagamento);
    }
}