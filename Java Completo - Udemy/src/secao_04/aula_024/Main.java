package secao_04.aula_024;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Olá mundo! ");
        System.out.println("Bom dia!");

        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println("y = " + y);
        System.out.println("x = " + x);
        System.out.printf("x = %.2f\n", x);
        System.out.printf("x = %.4f\n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS\n", x);
        System.out.printf("%s tem %d anos e ganha R$%.2f reais\n", nome, idade, renda);
    }
}
