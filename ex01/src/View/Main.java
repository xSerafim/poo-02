package View;

import java.util.List;

import javax.swing.JOptionPane;

import Model.ItemPedido;
import Model.Pedido;
import Model.Produto;

public class Main {
  public static void main(String[] args) {
    Produto prod1 = new Produto();
    prod1.setCodigo(1);
    prod1.setDescricao("Caneta");
    prod1.setValor(1.5);

    Produto prod2 = new Produto();
    prod2.setCodigo(2);
    prod2.setDescricao("Lápis");
    prod2.setValor(0.5);

    Produto prod3 = new Produto();
    prod3.setCodigo(3);
    prod3.setDescricao("Borracha");
    prod3.setValor(1);

    ItemPedido item1 = new ItemPedido();
    item1.setProduto(prod1);
    item1.setQuantidade(10);

    ItemPedido item2 = new ItemPedido();
    item2.setProduto(prod2);
    item2.setQuantidade(5);

    ItemPedido item3 = new ItemPedido();
    item3.setProduto(prod3);
    item3.setQuantidade(3);

    List<ItemPedido> itens = List.of(item1, item2, item3);

    Pedido pedido = new Pedido();
    pedido.setNumeroNota(1);
    pedido.setItens(itens);

    JOptionPane.showMessageDialog(null, "Valor total do pedido: " + pedido.getValorTotal());
  }
}
