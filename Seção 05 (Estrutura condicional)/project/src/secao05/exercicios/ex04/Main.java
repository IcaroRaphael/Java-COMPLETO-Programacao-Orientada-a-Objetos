package secao05.exercicios.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaI = sc.nextInt();
        System.out.print("Hora final: ");
        int horaF = sc.nextInt();

        int h;

        if(horaF > horaI){
            h = horaF - horaI;
        }
        else{
            h = (24 - horaI) + horaF;
        }

        System.out.printf("O jogo durou %d hora(s)\n", h);

        sc.close();
    }
}
