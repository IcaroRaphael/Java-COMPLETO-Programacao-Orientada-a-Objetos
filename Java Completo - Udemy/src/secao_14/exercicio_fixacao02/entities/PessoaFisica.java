package secao_14.exercicio_fixacao02.entities;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        double imposto = 0;
        if(getRendaAnual() < 20000.0){
            imposto = 0.15 * getRendaAnual();
        }else if(getRendaAnual() >= 20000.0){
            imposto = 0.25 * getRendaAnual();
        }

        if(gastosSaude > 0){
            imposto -= getGastosSaude() * 0.5;
        }

        return imposto;
    }
}
