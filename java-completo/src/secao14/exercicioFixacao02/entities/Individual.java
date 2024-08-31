package secao14.exercicioFixacao02.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double value = 0;
        if(super.getAnualIncome() < 20000){
            value += 0.15 * super.getAnualIncome();
        }
        else{
            value += 0.25 * super.getAnualIncome();
        }
        if(healthExpenditures > 0){
            value -= 0.5 * healthExpenditures;
        }
        return value;
    }
}
