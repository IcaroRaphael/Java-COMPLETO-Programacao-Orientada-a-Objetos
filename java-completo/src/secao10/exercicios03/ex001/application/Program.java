package secao10.exercicios03.ex001.application;

import secao10.exercicios03.ex001.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
        N funcionários. Não deve haver repetição de id.

        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        conforme exemplos.

        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
        aumento por porcentagem dada.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.printf("Emplyoee #%d:\n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));

            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        int counter = 0;
        for(Employee e : list){
            if(e.getId() == id){
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                e.salaryIncrease(percentage);
                counter++;
                break;
            }
        }
        if(counter == 0){
            System.out.println("This id does not exist!");
        }
        System.out.println();

        System.out.println("List of employees:");
        for(Employee e : list){
            System.out.println(e);
        }

        sc.close();
    }
}
