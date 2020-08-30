/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

/**
 *
 * @author sharonhasegawa
 */
public class ItemDoPedido {
    private long quantidade;
    private Produto produto;

    public ItemDoPedido(long quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
