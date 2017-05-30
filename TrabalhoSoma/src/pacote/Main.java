package pacote;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Magica magica = new Magica();
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int opcao = 0;
        float valor1;
        float valor2;

        do {
            System.out.println("--------------------------");
            System.out.println("|        1-SOMAR         |");
            System.out.println("|       2-SUBTRAIR       |");
            System.out.println("|      3-MULTIPLICAR     |");
            System.out.println("|       4-DIVIDIR        |");
            System.out.println("|       5-POTENCIA       |");
            System.out.println("|         6-SAIR         |");
            System.out.println("--------------------------");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Valor 1");
                valor1 = in.nextFloat();
                System.out.println("Valor 2");
                valor2 = in.nextFloat();
                System.out.println(df.format((magica.soma(valor1, valor2))));
            } else if (opcao == 2) {
                System.out.println("Valor 1");
                valor1 = in.nextFloat();
                System.out.println("Valor 2");
                valor2 = in.nextFloat();
                System.out.println(df.format(magica.subtracao(valor1, valor2)));
            } else if (opcao == 3) {
                System.out.println("Valor 1");
                valor1 = in.nextFloat();
                System.out.println("Valor 2");
                valor2 = in.nextFloat();
                System.out.println(df.format(magica.multiplicacao(valor1, valor2)));
            } else if (opcao == 4) {
                System.out.println("Valor 1");
                valor1 = in.nextFloat();
                System.out.println("Valor 2");
                valor2 = in.nextFloat();
                System.out.println(df.format(magica.divisao(valor1, valor2)));
            } else if (opcao == 5) {
                System.out.println("Valor 1");
                valor1 = in.nextFloat();
                System.out.println("Valor 2");
                valor2 = in.nextFloat();
                System.out.println(df.format(magica.potencia(valor1, valor2)));
            } else if (opcao == 6) {
                System.out.println("BURRRROOO");
                break;
            }

        } while (opcao != 6);

    }

}
