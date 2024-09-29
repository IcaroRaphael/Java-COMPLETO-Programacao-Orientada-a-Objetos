package secao16.aula167.model.services;

import secao16.aula167.model.entities.CarRental;
import secao16.aula167.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double princePerDay;
    private Double pricePerHour;
    private BrazilTaxService taxService;

    public RentalService(Double princePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.princePerDay = princePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;
        if(hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = princePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
