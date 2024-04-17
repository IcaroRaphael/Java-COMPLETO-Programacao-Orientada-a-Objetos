package secao06.exercicios01.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaAlcool = 0;
        int somaGasolina = 0;
        int somaDiesel = 0;

        while(true){
            System.out.println("1- Álcool");
            System.out.println("2- Gasolina");
            System.out.println("3- Diesel");
            System.out.println("4- Finalizar");
            System.out.print("Insira uma opção: ");
            int opcao = sc.nextInt();

            if(opcao == 1){
                somaAlcool++;
            }
            else if(opcao == 2){
                somaGasolina++;
            }
            else if(opcao == 3){
                somaDiesel++;
            }
            else if(opcao == 4){
                System.out.println("Muito obrigado!");
                break;
            }
            else{
                System.out.println("Código inválido. Tente novamente!");
            }
            System.out.println();
        }
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
        System.out.println("Álcool: " + somaAlcool);
        System.out.println("Gasolina: " + somaGasolina);
        System.out.println("Diesel: " + somaDiesel);

        sc.close();
    }
}
