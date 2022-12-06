package secao_06.exercicio_pt1.exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
        de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
        corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
        que a senha correta é o valor 2002.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senhaVerdadeira = 2002;

        System.out.print("Insira a senha: ");
        int senhaTentativa = sc.nextInt();

        while(senhaTentativa != senhaVerdadeira){
            System.out.print("Senha inválida! Tente novamente: ");
            senhaTentativa = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
