package secao_06.aula_055;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do{
            System.out.print("Insira a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Fahrenheit: %.2f\n", f);

            System.out.print("Deseja repetir? [S/N]: ");
            resposta = sc.next().charAt(0);
            System.out.println();

        }while(resposta != 'n');
        System.out.println("Programa finalizado!");

        sc.close();
    }
}
