package secao13.exercicioFixacao02.application;

import secao13.exercicioFixacao02.entities.Company;
import secao13.exercicioFixacao02.entities.Individual;
import secao13.exercicioFixacao02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if(ch == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();

        double sum = 0;
        System.out.println("TAXES PAID:");
        for(TaxPayer tp : list){
            System.out.printf("%s: $ %.2f\n", tp.getName(), tp.tax());
            sum += tp.tax();
        }
        System.out.println();

        System.out.printf("TOTAL TAXES: $ %.2f\n", sum);

        sc.close();
    }
}
