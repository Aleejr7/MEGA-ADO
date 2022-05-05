package exercicios.mega_ado;

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o exercício que deseja ver: ");
        int exercicios = input.nextInt();

        switch (exercicios) {           
            case 1:             
                double temp;
                String chuva = null;
                double din = 0;
                System.out.println("Qual temperatura prevista ?");
                temp = input.nextDouble();
                if (temp >= 25) {
                    System.out.println("Tem previsão de chuva?");
                    chuva = input.next();
                }
                if ("nao".equals(chuva)) {
                    System.out.println("Qual valor do orçamento ?");
                    din = input.nextDouble();
                }
                if (din >= 2000) {
                    System.out.println("Podemos ir para a praia");
                } else {
                    System.out.println("Não podemos ir para a praia");
                    break;
                }

            case 2:
                int u;
                double valorUnitario, valorTotal, desconto;

                System.out.println("Digite a quantidade de itens comprados: ");
                u = input.nextInt();
                System.out.println("Digite o valor unitario do item comprado: ");
                valorUnitario = input.nextFloat();
                if (u >= 10) {
                    desconto = (valorUnitario * u) * 0.10;
                    valorTotal = (valorUnitario * u) - desconto;
                    System.out.println("O valor total com 10% de desconto: R$" + valorTotal + "(desconto de R$ " +desconto+ ")");
                } else {
                    valorTotal = valorUnitario * u;
                    System.out.println("O valor total sem desconto: R$" + valorTotal);
                }
                break;

        }
    }
}
