package secao_13.exercicio_fixacao.entities;

import secao_13.exercicio_fixacao.entities.enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private StatusPedido status;

    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public void removerItem(ItemPedido item){
        itens.remove(item);
    }

    public double total(){
        double soma = 0;
        for(ItemPedido i : itens){
            soma += i.subTotal();
        }
        return soma;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: " + sdf.format(momento) + "\n");
        sb.append("Status do pedido: " + status + "\n");
        sb.append("Cliente: " + cliente + "\n");
        sb.append("Itens do pedido: \n");
        for(ItemPedido i : itens){
            sb.append("- " + i + "\n");
        }
        sb.append(String.format("Preço total: $%.2f\n", total()));

        return sb.toString();
    }
}
