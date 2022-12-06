package secao_08.exercicio_04.utilitarios;

public class ConversorMoeda {
    public static double valorDolar;

    public static double converterMoeda(double valor){
        return (valorDolar * valor) * 1.06;
    }
}
