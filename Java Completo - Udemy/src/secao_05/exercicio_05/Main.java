package secao_05.exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
        deste item. A seguir, calcule e mostre o valor da conta a pagar.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código: ");
        int codigo = sc.nextInt();
        System.out.print("Insira a quantidade: ");
        int quant = sc.nextInt();

        double total = 0.0;
        if(codigo == 1){
            total = quant * 4.00;
        }else if(codigo == 2){
            total = quant * 4.50;
        }else if(codigo == 3){
            total = quant * 5.00;
        }else if(codigo == 4){
            total = quant * 2.00;
        }else if(codigo == 5){
            total = quant * 1.50;
        }else{
            System.out.println("Código inválido!");
        }
        System.out.printf("Valor total: R$%.2f\n", total);

        sc.close();
    }
}
