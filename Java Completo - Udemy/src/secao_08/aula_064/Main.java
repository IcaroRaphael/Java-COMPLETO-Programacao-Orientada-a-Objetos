package secao_08.aula_064;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("\nInsira as medidas do 1º triângulo: ");
        System.out.print("1º lado: ");
        xA = sc.nextDouble();
        System.out.print("2º lado: ");
        xB = sc.nextDouble();
        System.out.print("3º lado: ");
        xC = sc.nextDouble();

        System.out.println("\nInsira as medidas do 2º triângulo: ");
        System.out.print("1º lado: ");
        yA = sc.nextDouble();
        System.out.print("2º lado: ");
        yB = sc.nextDouble();
        System.out.print("3º lado: ");
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

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
