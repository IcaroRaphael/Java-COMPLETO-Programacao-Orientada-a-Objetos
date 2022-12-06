package secao_05.exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que
        o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima
        de 24 horas.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Hora final: ");
        int fim = sc.nextInt();

        int horas;
        if(inicio == fim){
            horas = 24;
        }else if(inicio > fim){
            horas = (24 - inicio) + fim;
        }else{
            horas = fim - inicio;
        }
        System.out.printf("O jogo durou %d hora(s).\n", horas);

        sc.close();
    }
}
