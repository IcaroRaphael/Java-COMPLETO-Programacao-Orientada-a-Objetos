package secao_05.aula_038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira os minutos: ");
        int minutos = sc.nextInt();

        double valor = 0.0;
        if(minutos <= 100){
            valor = 50.00;
        }else if(minutos > 100){
            valor = 50 + ((minutos - 100) * 2);
        }

        System.out.printf("Valor a ser pago: R$%.2f\n", valor);

        sc.close();
    }
}
