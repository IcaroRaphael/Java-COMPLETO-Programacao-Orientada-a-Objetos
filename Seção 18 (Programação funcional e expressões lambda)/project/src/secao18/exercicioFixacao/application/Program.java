package secao18.exercicioFixacao.application;

import secao18.exercicioFixacao.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\Home\\Documents\\GitHub\\Java-COMPLETO-Programacao-Orientada-a-Objetos\\Seção 18 (Programação funcional e expressões lambda)\\project\\src\\secao18\\exercicioFixacao\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                list.add(new Employee(name, email, salary));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salaryInput = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryInput) + ":");
            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salaryInput)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();
            emails.forEach(System.out::println);

            Double salarySum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", salarySum));
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
