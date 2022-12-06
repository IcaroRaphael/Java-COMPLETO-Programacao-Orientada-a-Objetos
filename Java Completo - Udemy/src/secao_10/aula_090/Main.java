package secao_10.aula_090;

import secao_10.aula_090.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos produtos serão lidos: ");
        int n = sc.nextInt();

        Produto[] vect = new Produto[n];
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("* Dados do %dº produto *\n", (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            vect[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i].getPreco();
        }
        System.out.printf("Média dos preços: %.2f\n", (soma/n));

        sc.close();
    }
}
