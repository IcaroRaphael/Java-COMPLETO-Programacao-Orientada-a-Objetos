package secao_14.exercicio_fixacao01.application;

import secao_14.exercicio_fixacao01.entities.ImportedProduct;
import secao_14.exercicio_fixacao01.entities.Product;
import secao_14.exercicio_fixacao01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        /*
        Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
        mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados. Todos
        produtos possuem nome e preço. Produtos importados possuem uma taxa de alfândega, e
        produtos usados possuem data de fabricação. Estes dados específicos devem ser acrescentados
        na etiqueta de preço conforme exemplo (próxima página). Para produtos importados, a taxa e
        alfândega deve ser acrescentada ao preço final do produto.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Insira quantos produtos serão lidos: ");
        int n = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.printf("- INSIRA OS DADOS DO %dº PRODUTO: \n", i);
            System.out.print("Comum, usado ou importado? [C|U|I]: ");
            char tipo = sc.next().toUpperCase().charAt(0);


            if(tipo == 'C'){
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                Product produto = new Product(nome, preco);
                list.add(produto);
            }else if(tipo == 'U'){
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine();
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String data = sc.next();

                Product produto = new UsedProduct(nome, preco, sdf.parse(data));
                list.add(produto);
            }else if(tipo == 'I'){
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                System.out.print("Taxa de importação: ");
                double taxaImportacao = sc.nextDouble();

                Product produto = new ImportedProduct(nome, preco, taxaImportacao);
                list.add(produto);
            }
        }
        System.out.println();

        System.out.println("ETIQUETAS DE PREÇO:");
        for(Product p : list){
            System.out.println(p.etiquetaPreco());
        }

        sc.close();
    }
}
