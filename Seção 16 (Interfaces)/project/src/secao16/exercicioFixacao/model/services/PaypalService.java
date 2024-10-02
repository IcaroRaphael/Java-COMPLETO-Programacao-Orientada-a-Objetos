package secao16.exercicioFixacao.model.services;

public class PaypalService implements OnlinePaymentService{
    @Override
    public Double interest(Double amount, Integer months) {
        return amount * ((double)months/100);
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }
}
