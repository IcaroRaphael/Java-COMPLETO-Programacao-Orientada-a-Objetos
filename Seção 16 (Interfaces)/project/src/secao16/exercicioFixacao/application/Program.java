package secao16.exercicioFixacao.application;

import secao16.exercicioFixacao.model.entities.Contract;
import secao16.exercicioFixacao.model.entities.Installment;
import secao16.exercicioFixacao.model.services.ContractService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int numberInstallments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService service = new ContractService();
        service.processContract(contract, numberInstallments);

        System.out.println("parcelas: ");
        for(Installment i : contract.getInstallments()){
            System.out.println(sdf.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()));
        }

        sc.close();
    }
}
