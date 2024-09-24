package secao13.exercicioFixacao02.entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double value = 0;
        if(numberOfEmployees <= 10){
            value += 0.16 * super.getAnualIncome();
        }
        else{
            value += 0.14 * super.getAnualIncome();
        }
        return value;
    }
}
