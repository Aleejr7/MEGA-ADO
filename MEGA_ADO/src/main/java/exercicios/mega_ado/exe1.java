package exercicios.mega_ado;

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o exercício que deseja ver: ");
        int exercicios = input.nextInt();

        switch (exercicios) {

            case 1:
                System.out.println("--- Integrantes do grupo --- \n");
                System.out.println("Alesandro da Rocha Santos Junior");
                System.out.println("Augusto Brito Santos");
                System.out.println("Brenno Lima Ferreira da Silva");
                System.out.println("Deive Oliveira dos Anjos");
                break;

            case 2:
                System.out.println("--- Podemos ir para praia ? --- \n");
                double temp;
                String chuva = "";
                double din = 0;
                System.out.println("Qual temperatura prevista ?");
                temp = input.nextDouble();
                if (temp >= 25) {
                    System.out.println("O clima está: sol, nublado, garoa ou chuva?");
                    chuva = input.next();
                    if ("sol".equals(chuva) || "nublado".equals(chuva)) {
                        System.out.println("Qual valor do orçamento ?");
                        din = input.nextDouble();
                        if (din >= 2000) {
                            System.out.println("Podemos ir para a praia");
                        } else {
                            System.out.println("Não podemos ir para a praia");
                        }
                    } else {
                        System.out.println("Não podemos ir para a praia");
                    }
                } else {
                    System.out.println("Não podemos ir para a praia");
                }
                break;

            case 3:
                System.out.println("--- Calcular valor com desconto e sem desconto ---");
                int u;
                double valorUnitario,
                 valorTotal, desconto;
                System.out.println("Digite a quantidade de itens comprados: ");
                u = input.nextInt();
                System.out.println("Digite o valor unitario do item comprado: ");
                valorUnitario = input.nextFloat();
                if (u >= 10) {
                    desconto = (valorUnitario * u) * 0.10;
                    valorTotal = (valorUnitario * u) - desconto;
                    System.out.println("O valor total com 10% de desconto: R$" + valorTotal + "(desconto de R$ " + desconto + ")");
                } else {
                    valorTotal = valorUnitario * u;
                    System.out.println("O valor total sem desconto: R$" + valorTotal);
                }
                break;

            case 5:

                System.out.println("--- Calculo da conta de energia ---");
                double kwh,
                 conta;
                System.out.println("Informe o kwh conaumido: ");
                kwh = input.nextDouble();

                if (kwh <= 30) {
                    conta = kwh * 0.10058;
                    System.out.println("O valor da sua conta é: R$" + conta);
                } else if (kwh >= 31 && kwh <= 100) {
                    conta = kwh * 0.17243;
                    System.out.println("O valor da sua conta é: R$" + conta);
                } else if (kwh >= 101 && kwh <= 220) {
                    conta = kwh * 0.25864;
                    System.out.println("O valor da sua conta é: R$" + conta);
                } else if (kwh > 220) {
                    conta = kwh * 0.28738;
                    System.out.println("O valor da sua conta é: R$" + conta);
                }
        }
    }
}
