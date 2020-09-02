/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author levyc
 */
public class ModeloTabelaItemPedido extends AbstractTableModel {
    private String [] colunas = new String[] { "Produto", "Quantidade" };
    private List<ItemDoPedido> lista;
    
    public ModeloTabelaItemPedido(List<ItemDoPedido> lista){
        this.lista = lista;
    }    
    
    public ModeloTabelaItemPedido(){
        this.lista = new ArrayList();
    }
      
      public int getRowCount(){
        return this.lista.size();
    }
    
    public int getColumnCount() {
        return this.colunas.length;
    }

    public String getColumnName(int index) {
        return this.colunas[index];
    }

    public boolean isCellEditable(int row, int column) {
        return false;       
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemDoPedido item = lista.get(rowIndex);        
        switch (columnIndex) {
            case 0:
                return item.getProduto().getDescricao();
            case 1:
                return item.getQuantidade();
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            ItemDoPedido item = lista.get(row);
            switch (col) {
                case 0:
                    item.getProduto().setDescricao((String) value);
                    break;
                case 1:
                    item.setQuantidade((long) value);
                    break;
                default:
                    break;
            }
            this.fireTableCellUpdated(row, col);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar tabela: " + e.getMessage());
        }
    }
    
    public boolean deleteItemDoPedido(ItemDoPedido item) {
        int linha = this.lista.indexOf(item);
        boolean result = this.lista.remove(item);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }
    
    public boolean removeItem(ItemDoPedido item) {
        int linha = this.lista.indexOf(item);
        boolean result = this.lista.remove(item);
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }

    public void adicionaItem(ItemDoPedido item) {
        this.lista.add(item);
        this.fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public void setListaItens(List<ItemDoPedido> itens) {
        this.lista = itens;
        this.fireTableDataChanged();        
    }

    public void limparTabela() {
        int indice = lista.size() - 1;
        if(indice < 0) {
            indice = 0;
        }
        
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0, indice);
    }

    public ItemDoPedido getItem(int linha){
        return lista.get(linha);
    }
}
