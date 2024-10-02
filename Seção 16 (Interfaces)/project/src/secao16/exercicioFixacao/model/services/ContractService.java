package secao16.exercicioFixacao.model.services;

import secao16.exercicioFixacao.model.entities.Contract;
import secao16.exercicioFixacao.model.entities.Installment;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(){
    }

    public void processContract(Contract contract, Integer months){
        OnlinePaymentService service = new PaypalService();

        double withoutInterest = contract.getTotalValue() / months;

        for(int i=1; i<=months; i++){
            // criar uma data
            Date data = contract.getDate();
            // converter para LocalDate e adicionar um mês
            LocalDate dataLocal = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate dataMaisUmMes = dataLocal.plusMonths(i);
            // converter de volta para Date
            Date dueDate = Date.from(dataMaisUmMes.atStartOfDay(ZoneId.systemDefault()).toInstant());

            double amountInterest = withoutInterest + (service.interest(withoutInterest, i));
            double amount = amountInterest + service.paymentFee(amountInterest);

            contract.addInstallment(new Installment(dueDate, amount));
        }
    }


}
