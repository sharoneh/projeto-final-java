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
public class ModeloTabelaCliente extends AbstractTableModel{
    private String [] colunas=new String[] {"ID","CPF","Nome","Sobrenome"};
    private List<Cliente> lista = new ArrayList();
    
    public ModeloTabelaCliente(List<Cliente> lista){
        this.lista=lista;
    }
    
    public ModeloTabelaCliente(){
        
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
        Cliente clientes = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return clientes.getId();
            case 1:
                return clientes.getCpf();
            case 2:
                return clientes.getNome();
            case 3:
                return clientes.getSobrenome();

            default:
                return null;
        }
    }

    public void setValueAt(Object value, int row, int col) {
        try {
            Cliente clientes = lista.get(row);
            switch (col) {
                case 0:
                    clientes.setId((Long) value);
                    break;
                case 1:
                    clientes.setCpf((String) value);
                    break;
                case 2:
                    clientes.setNome((String) value);
                    break;
                case 3:
                    clientes.setSobrenome((String) value);
                    break;
                default:
            }
            this.fireTableCellUpdated(row, col);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar tabela: " + e.getMessage());
        }
    }

    public boolean deleteCliente(Cliente c) {
        int linha = this.lista.indexOf(c);
        boolean result = this.lista.remove(c);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }

    public void adicionaCliente(Cliente c) {
        this.lista.add(c);        
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }

    public void setListaClientes(List<Cliente> clientes) {
        this.lista = clientes;
        this.fireTableDataChanged();        
    }

    public void limparTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }
}
