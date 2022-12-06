package secao_06.exercicio_pt2.exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em
        seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora
        do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do
        intervalo, e "out" para fora do intervalo).
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos valores serão lidos: ");
        int N = sc.nextInt();

        int contIn = 0;
        int contOut = 0;

        for(int x = 1; x <= N; x++){
            System.out.printf("Insira o %dº valor: ", x);
            int valor = sc.nextInt();

            if((valor >= 10) && (valor <= 20)){
                contIn++;
            }else{
                contOut++;
            }
        }
        System.out.printf("In: %d\n", contIn);
        System.out.printf("Out: %d\n", contOut);

        sc.close();
    }
}
