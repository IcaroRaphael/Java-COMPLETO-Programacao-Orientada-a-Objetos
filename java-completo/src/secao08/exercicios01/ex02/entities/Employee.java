package secao08.exercicios01.ex02.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary *= (1 + (percentage/100));
    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
