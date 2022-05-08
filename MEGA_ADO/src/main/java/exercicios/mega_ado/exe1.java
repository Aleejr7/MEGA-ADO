package exercicios.mega_ado; 

import java.util.Scanner;


public class exe1 {

    public static void main(String[] args) {
        do{
        Scanner input = new Scanner(System.in);
        System.out.println("--- MENU --- \n");
        System.out.println("Digite 1 para Integrantes do grupo");
        System.out.println("Digite 2 para Exercicio 2");
        System.out.println("Digite 3 para Exercicio 3");
        System.out.println("Digite 4 para exercicio 4");
        System.out.println("Digite 5 para exercicio 5");
        System.out.println("Digite 6 para exercicio 6");
        System.out.println("Digite 7 para sair do programa");
        
        System.out.println("Digite um numero: ");
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
                 valorTotal,
                 desconto;
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

            case 4:
                System.out.println("--- IMC ---");
                float peso,
                 altura,
                 massa;
                System.out.println("Digite seu peso:");
                peso = input.nextFloat();
                System.out.println("Digite sua altura:");
                altura = input.nextFloat();
                massa = peso / (altura * altura);
                System.out.printf("Sua massa corporal = %.3f", massa);

                if (massa < 18.5) {
                    System.out.println(" Grau de obsidade = Magreza");

                } else if (massa >= 18.5 && massa <= 24.9) {
                    System.out.println(" Grau de obsidade = Normal");

                } else if (massa >= 24.9 && massa <= 30) {
                    System.out.println(" Grau de obsidade = Sobrepeso");

                } else {
                    System.out.println(" Grau de obsidade = Obesidade");
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
                break;

            case 6:
                System.out.println("-----Calculo de conta de água e esgoto-----");
                double consumo,
                 valor = 0;
                System.out.println("Digite a quantidade de litros de agua consumido: ");
                consumo = input.nextFloat();
                if (consumo <= 10) {
                    System.out.println("Valor a pagar = R$ 58,00");
                } else if (consumo > 10 && consumo <= 20) {
                    valor = (29.00 + (consumo-10) * 4.54) + (29.00 + (consumo-10) * 4.54);
                    System.out.println("Valor a pagar = R$" + valor);
                } else if (consumo > 20 && consumo <= 50) {
                    valor =  (29.00 + 10 * 4.54 + (consumo - 20) * 11.33) + (29.00 + 10 * 4.54 + (consumo - 20) * 11.33);
                    System.out.println("Valor a pagar = R$" + valor);
                } else if (consumo > 50) {
                    valor = (29.00 + 10 * 4.54 + 30 * 11.33 + (consumo - 50) * 12.48) + (29.00 + 10 * 4.54 + 30 * 11.33 + (consumo - 50) * 12.48);
                    System.out.println("Valor a pagar = R$" + valor);
                }
                break;
            
            case 7:
                System.out.println("Obrigado por acessar nossos exercicios");
                System.exit(0);    
        }
    }while(true);
 }
}        


    
