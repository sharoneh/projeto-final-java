/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sharonhasegawa
 */
public class ModeloTabelaPedidos extends AbstractTableModel {
    private String [] colunas = new String[] { "Pedido ID", "Data" };
    private List<Pedido> lista;
    
    public ModeloTabelaPedidos(List<Pedido> lista){
        this.lista = lista;
    }

    ModeloTabelaPedidos() {
        this.lista = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;       
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return pedido.getId();
            case 1: return pedido.getData();
            default : return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            Pedido pedido = lista.get(row);
            switch (col) {
                case 0:
                    pedido.setId((Long) value);
                    break;
                case 1:
                    pedido.setData((LocalDate) value);
                    break;
                default:
                    break;
            }
            
            this.fireTableCellUpdated(row, col);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar tabela: " + e.getMessage());
        }
    }
    
    public boolean deletaPedido(Pedido pedido) {
        int linha = this.lista.indexOf(pedido);
        boolean result = this.lista.remove(pedido);
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }

    public void adicionaPedido(Pedido pedido) {
        this.lista.add(pedido);        
        this.fireTableRowsInserted(lista.size() - 1, lista.size () - 1);
    }

    public void setListaPedidos(List<Pedido> pedidos) {
        this.lista = pedidos;
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

    public Pedido getPedido(int linha){
        return lista.get(linha);
    }
}
