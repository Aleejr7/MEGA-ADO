
package exercicios.mega_ado;
import java.util.Scanner;
public class exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        }
    } 
}
