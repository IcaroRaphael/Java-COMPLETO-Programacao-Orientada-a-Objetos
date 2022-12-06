package secao_05.exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
        "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números
        devem poder ser digitados em ordem crescente ou decrescente.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Insira o segundo valor inteiro: ");
        int B = sc.nextInt();

        if((A == B) && ((A % B) == 0)){
            System.out.println("São múltiplos!");
        }else if((A > B) && ((A % B) == 0)){
            System.out.println("São múltiplos!");
        }else if((A < B) && ((B % A) == 0)){
            System.out.println("São múltiplos!");
        }else{
            System.out.println("Não são múltiplos!");
        }

        sc.close();
    }
}
