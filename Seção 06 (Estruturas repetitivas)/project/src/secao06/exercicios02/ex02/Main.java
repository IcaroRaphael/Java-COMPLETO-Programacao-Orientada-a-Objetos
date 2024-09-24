package secao06.exercicios02.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de X: ");
        int x = sc.nextInt();
        System.out.println();

        int somaIN = 0;
        int somaOUT = 0;

        for(int i = 0; i < x; i++){

            System.out.printf("Insira o %dº valor: ", (i+1));
            int valor = sc.nextInt();

            if((valor >= 10) && (valor <= 20)){
                somaIN++;
            }
            else{
                somaOUT++;
            }
        }
        System.out.println();

        System.out.printf("%d in\n", somaIN);
        System.out.printf("%d out\n", somaOUT);

        sc.close();
    }
}
