package secao_10.exercicio_fixacao01;

import secao_10.exercicio_fixacao01.entidades.AluguelQuarto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos
        identificados pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos
        vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar
        quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada
        registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele
        escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve
        imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AluguelQuarto[] quartos = new AluguelQuarto[10];

        System.out.print("Insira quantos quartos serão alugados [Entre 1-10]: ");
        int n = sc.nextInt();

        while((n < 1) || (n > 10)){
            System.out.println("Erro! Tente novamente...");
            System.out.print("Insira quantos quartos serão alugados [Entre 1-10]: ");
            n = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println();
            System.out.printf("Insira os dados do %dº aluguel...\n", (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();

            while(true){
                System.out.print("Quarto [Entre 0-9]: ");
                int quarto = sc.nextInt();
                if((quarto < 0) || (quarto > 9)){
                    System.out.println("Número de quarto inválido! Tente novamente...");
                }else if(quartos[quarto] != null){
                    System.out.printf("Quarto Nº%d já ocupado! Tente novamente...\n", quarto);
                }else{
                    quartos[quarto] = new AluguelQuarto(nome, email);
                    break;
                }
            }
        }
        System.out.println();

        System.out.println("Quartos ocupados:");
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] != null){
                System.out.printf("- %d: %s\n", i, quartos[i].toString());
            }
        }

        sc.close();
    }
}
