package secao_13.exercicio_fixacao.application;


import secao_13.exercicio_fixacao.entities.Cliente;
import secao_13.exercicio_fixacao.entities.ItemPedido;
import secao_13.exercicio_fixacao.entities.Pedido;
import secao_13.exercicio_fixacao.entities.Produto;
import secao_13.exercicio_fixacao.entities.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*
        Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
        sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve
        ser o instante do sistema: new Date()
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // CRIANDO CLIENTE
        System.out.println("- INSIRA OS DADOS DO CLIENTE:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        String dataNascimento = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, sdf.parse(dataNascimento));
        System.out.println();

        // CRIANDO PEDIDO
        System.out.println("- INSIRA OS DADOS DO PEDIDO: ");
        System.out.print("Status do pedido: ");
        String statusPedido = sc.nextLine();
        System.out.print("Quantidade de itens: ");
        int quantItens = sc.nextInt();
        System.out.println();

        Pedido pedido = new Pedido(new Date(), StatusPedido.valueOf(statusPedido), cliente);

        for(int i = 0; i < quantItens; i++){
            sc.nextLine();
            System.out.printf("- Insira os dados do %dº pedido: \n", (i+1));
            System.out.print("Nome: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantProduto = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantProduto, produto);
            pedido.adicionarItem(itemPedido);
        }
        System.out.println();

        System.out.println("- RESUMO DO PEDIDO:");
        System.out.println(pedido);

        sc.close();
    }
}
