package secao_10.exercicio_fixacao02;

import secao_10.exercicio_fixacao02.aplicacao.Metodos;
import secao_10.exercicio_fixacao02.entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N
        funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no
        salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o
        id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
        listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar a técnica de
        encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode
        ser aumentado com base em uma operação de aumento por porcentagem dada.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos funcionários serão inseridos: ");
        int n = sc.nextInt();
        System.out.println();

        List<Funcionario> funcionarios = new ArrayList<>();

        // CADASTRO FUNCIONÁRIOS
        for(int i = 0; i < n; i++){
            System.out.printf("Insira os dados do %dº funcionário...\n", (i+1));
            int id;
            while(true){
                System.out.print("ID: ");
                id = sc.nextInt();
                if(!Metodos.verificaId(id, funcionarios)){
                    System.out.println("ID existente, tente novamente!");
                }else{
                    break;
                }
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
            System.out.println();
        }

        // AUMENTO FUNCIONÁRIO
        System.out.println("Insira os dados do funcionário que receberá aumento: ");
        int id;
        double percentual;
        while(true){
            System.out.print("ID: ");
            id = sc.nextInt();
            if(!Metodos.verificaId(id, funcionarios) && funcionarios.size() > 0){
                System.out.print("Percentual de aumento: ");
                percentual = sc.nextDouble();
                break;
            }else{
                System.out.println("ID inexistente, tente novamente!");
            }
        }

        for(Funcionario f : funcionarios){
            if(f.getId() == id){
                f.aumentaSalario(percentual);
                break;
            }
        }
        System.out.println();

        System.out.println("Lista de funcionários: ");
        Metodos.listaFuncionarios(funcionarios);

        sc.close();
    }
}
