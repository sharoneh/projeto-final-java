/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author levyc
 */
public class ModeloTabelaProdutos extends AbstractTableModel {
    private String [] colunas=new String[] {"ID","Descrição"};
    private List<Produto> lista = new ArrayList();
    
    public ModeloTabelaProdutos(List<Produto> lista){
        this.lista=lista;
    }
    
    public ModeloTabelaProdutos(){
        
    }
    
    @Override
    public int getRowCount(){
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
        Produto produtos = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return produtos.getId();
            case 1: return produtos.getDescricao();            
            default : return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            Produto produtos = lista.get(row);
            switch (col) {
                case 0:
                    produtos.setId((Long) value);
                    break;
                case 1:
                    produtos.setDescricao((String) value);
                    break;
                
                default:
            }
            this.fireTableCellUpdated(row, col);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar tabela: " + e.getMessage());
        }
    }

    public boolean deleteProduto(Produto p) {
        int linha = this.lista.indexOf(p);
        boolean result = this.lista.remove(p);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }

    public void adicionaProduto(Produto p) {
        this.lista.add(p);        
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }

    public void setListaProdutos(List<Produto> produtos) {
        this.lista = produtos;
        this.fireTableDataChanged();        
    }

    public void limparProdutos() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Produto getProduto(int linha){
        return lista.get(linha);
    }
    
}

    
    

