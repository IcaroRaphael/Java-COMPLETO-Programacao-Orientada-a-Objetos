package secao_08.exercicio_01;

import secao_08.exercicio_01.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
        mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado
        no projeto ao lado.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira as medidas do retangulo...");
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.println();

        System.out.printf("AREA: %.2f\n", retangulo.calcularArea());
        System.out.printf("PERIMETRO: %.2f\n", retangulo.calcularPerimetro());
        System.out.printf("DIAGONAL: %.2f\n", retangulo.calcularDiagonal());

        sc.close();
    }
}
