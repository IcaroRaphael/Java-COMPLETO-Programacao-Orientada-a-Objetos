package secao_04.exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.print("Insira o primeiro valor: ");
        A = sc.nextDouble();
        System.out.print("Insira o segundo valor: ");
        B = sc.nextDouble();
        System.out.print("Insira o terceiro valor: ");
        C = sc.nextDouble();
        System.out.println();

        double a = (A*C)/2;
        System.out.printf("a) a área do triângulo retângulo que tem A por base e C por altura: %.3f\n", a);

        double b = 3.14159 * Math.pow(C, 2);
        System.out.printf("b) a área do círculo de raio C. (pi = 3.14159): %.3f\n", b);

        double c = ((A+B)/2)*C;
        System.out.printf("c) a área do trapézio que tem A e B por bases e C por altura: %.3f\n", c);

        double d = Math.pow(B, 2);
        System.out.printf("d) a área do quadrado que tem lado B: %.3f\n", d);

        double e = A * B;
        System.out.printf("e) a área do retângulo que tem lados A e B: %.3f\n", e);

        sc.close();
    }
}
