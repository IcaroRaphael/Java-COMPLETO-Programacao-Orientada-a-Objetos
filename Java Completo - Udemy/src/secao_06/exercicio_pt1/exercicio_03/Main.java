package secao_06.exercicio_pt1.exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus
        clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da
        seguinte forma:
        1.Álcool
        2.Gasolina
        3.Diesel
        4.Fim).
        Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo
        código (até que seja válido). O programa será encerrado quando o código informado for o
        número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
        abasteceram cada tipo de combustível, conforme exemplo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;

        System.out.println("* Menu *\n" +
                "1.Álcool\n" +
                "2.Gasolina\n" +
                "3.Diesel\n" +
                "4.Fim");

        System.out.print("Insira o código: ");
        int codigo = sc.nextInt();

        while(codigo != 4){
            if(codigo == 1){
                contAlcool++;
            }else if(codigo == 2){
                contGasolina++;
            }else if(codigo == 3){
                contDiesel++;
            }else{
                System.out.println("Erro! Tente novamente.");
            }
            System.out.println();
            System.out.println("* Menu *\n" +
                    "1.Álcool\n" +
                    "2.Gasolina\n" +
                    "3.Diesel\n" +
                    "4.Fim");

            System.out.print("Insira o código: ");
            codigo = sc.nextInt();
        }

        System.out.println();
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);

        sc.close();
    }
}