package secao_14.exercicio_fixacao01.entities;

public class ImportedProduct extends Product{
    private Double taxaImportacao;

    public ImportedProduct(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double precoTotal(){
        return getPreco() + getTaxaImportacao();
    }

    @Override
    public String etiquetaPreco(){
        return String.format("%s $%.2f (Taxa de impostação: $%.2f)", getNome(), precoTotal(), getTaxaImportacao());
    }
}
