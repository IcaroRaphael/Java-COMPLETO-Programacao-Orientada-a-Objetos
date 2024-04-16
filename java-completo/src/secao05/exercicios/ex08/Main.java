package secao05.exercicios.ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do salario: ");
        double salario = sc.nextDouble();

        double imposto = 0;

        if((salario >= 0) && (salario <= 2000)){
            imposto = 0.0;
        }else if((salario > 2000) && (salario <= 3000)){
            imposto = (salario - 2000) * 0.08;
        }else if((salario > 3000) && (salario <= 4500)){
            imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
        }else if(salario > 4500){
            imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
        }

        System.out.printf("Imposto: R$%.2f\n", imposto);

        sc.close();
    }
}
