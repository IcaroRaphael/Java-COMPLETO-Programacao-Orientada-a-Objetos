package secao08.exercicios02.ex01.util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){
        double grossValue = amount * dollarPrice;
        return grossValue + (grossValue * 0.06);
    }
}