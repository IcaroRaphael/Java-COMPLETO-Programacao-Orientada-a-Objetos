package secao_07.aula_061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o 1º número: ");
        int a = sc.nextInt();
        System.out.print("Insira o 2º número: ");
        int b = sc.nextInt();
        System.out.print("Insira o 3º número: ");
        int c = sc.nextInt();

        int maiorNumero = max(a, b, c);
        mostraResultado(maiorNumero);

        sc.close();
    }

    public static int max(int a, int b, int c){
        int maior = 0;
        if((a >= b) && (a >= c)){
            maior = a;
        }else if((b >= a) && (b >= c)){
            maior = b;
        }else if((c >= a) && (c >= b)){
            maior = c;
        }
        return maior;
    }

    public static void mostraResultado(int maior){
        System.out.println("Maior número: " + maior);
    }
}
