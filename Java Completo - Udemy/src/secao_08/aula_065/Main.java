package secao_08.aula_065;

import secao_08.aula_065.entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("\nInsira as medidas do 1º triângulo: ");
        System.out.print("1º lado: ");
        x.a = sc.nextDouble();
        System.out.print("2º lado: ");
        x.b = sc.nextDouble();
        System.out.print("3º lado: ");
        x.c = sc.nextDouble();

        System.out.println("\nInsira as medidas do 2º triângulo: ");
        System.out.print("1º lado: ");
        y.a = sc.nextDouble();
        System.out.print("2º lado: ");
        y.b = sc.nextDouble();
        System.out.print("3º lado: ");
        y.c = sc.nextDouble();

        double pX = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));

        double pY = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));

        System.out.println();
        System.out.printf("Área do 1º triângulo: %.4f\n", areaX);
        System.out.printf("Área do 2º triângulo: %.4f\n", areaY);

        if(areaX == areaY){
            System.out.println("Área dos dois triângulos são iguais.");
        }else if(areaX > areaY){
            System.out.println("Área do 1º triângulo é maior.");
        }else if(areaY > areaX){
            System.out.println("Área do 2º triângulo é maior.");
        }

        sc.close();
    }
}
