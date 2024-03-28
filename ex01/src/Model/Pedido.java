package Model;

import java.util.List;

public class Pedido {
  int numeroNota;
  List<ItemPedido> itens;

  public Pedido() {
  }

  public int getNumeroNota() {
    return numeroNota;
  }

  public void setNumeroNota(int numeroNota) {
    this.numeroNota = numeroNota;
  }

  public List<ItemPedido> getItens() {
    return itens;
  }

  public void setItens(List<ItemPedido> itens) {
    this.itens = itens;
  }

  public double getValorTotal() {
    double total = 0;
    for (ItemPedido item : itens) {
      total += item.getQuantidade() * item.getProduto().getValor();
    }
    return total;
  }
}
