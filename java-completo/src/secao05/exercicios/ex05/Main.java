package secao05.exercicios.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o codigo: ");
        int cod = sc.nextInt();
        System.out.print("Insira a quantidade: ");
        int quant = sc.nextInt();

        double valor = 0;

        if(cod == 1){
            valor = 4.00 * quant;
        }
        else if(cod == 2){
            valor = 4.50 * quant;
        }
        else if(cod == 3){
            valor = 5.00 * quant;
        }
        else if(cod == 4){
            valor = 2.00 * quant;
        }
        else if(cod == 5){
            valor = 1.50 * quant;
        }
        else{
            System.out.println("Codigo invalido");
        }

        System.out.printf("Total: R$%.2f\n", valor);

        sc.close();
    }
}
