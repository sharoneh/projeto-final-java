/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sharonhasegawa
 */
public class PanelProduto extends javax.swing.JPanel {
    ModeloTabelaProdutos modeloTabela = new ModeloTabelaProdutos();
    int linhaSelecionada = -1;

    /**
     * Creates new form PanelProduto
     */
    public PanelProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNovoProduto = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();
        caixaDeTextoDescricao = new javax.swing.JTextField();
        scrollPanelTabela = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        listarProdutos = new javax.swing.JButton();
        excluirProduto = new javax.swing.JButton();
        editarProduto = new javax.swing.JButton();
        limparTabela = new javax.swing.JButton();

        botaoNovoProduto.setText("Novo");
        botaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoProdutoActionPerformed(evt);
            }
        });

        descricaoLabel.setText("Descrição: ");

        tabelaProduto.setModel(modeloTabela);
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaProdutoMousePressed(evt);
            }
        });
        scrollPanelTabela.setViewportView(tabelaProduto);

        listarProdutos.setText("Listar");
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });

        excluirProduto.setText("Excluir");
        excluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirProdutoActionPerformed(evt);
            }
        });

        editarProduto.setText("Editar");
        editarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoActionPerformed(evt);
            }
        });

        limparTabela.setText("Limpar");
        limparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarProdutos)
                            .addComponent(descricaoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaDeTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(excluirProduto)
                                .addGap(18, 18, 18)
                                .addComponent(limparTabela)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarProdutos)
                    .addComponent(excluirProduto)
                    .addComponent(limparTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaDeTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovoProduto)
                    .addComponent(editarProduto))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoProdutoActionPerformed
        try {
            String descricao = caixaDeTextoDescricao.getText();
            Produto p = new Produto(0L, descricao);
            ProdutoDAO dao = new ProdutoDAO();
            dao.insere(p);
            modeloTabela.adicionaProduto(p);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_botaoNovoProdutoActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        try {
            List<Produto> lista = new ProdutoDAO().getLista();
            modeloTabela.setListaProdutos(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void excluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoActionPerformed
        try {
            ProdutoDAO p = new ProdutoDAO();
            int[] linhasSelecionadas = tabelaProduto.getSelectedRows();
            List<Produto> listaExcluir = new ArrayList();

            for (int i = 0; i < linhasSelecionadas.length; i++) {
                Produto produto = modeloTabela.getProduto(linhasSelecionadas[i]);
                p.deleta(produto);
                listaExcluir.add(produto);
            }

            for (Produto produto : listaExcluir) {
                modeloTabela.deleteProduto(produto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_excluirProdutoActionPerformed

    private void editarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoActionPerformed
        if (linhaSelecionada == -1) return;
        try {
            Produto produto = modeloTabela.getProduto(linhaSelecionada);
            produto.setDescricao(caixaDeTextoDescricao.getText());
            ProdutoDAO dao = null;
            dao = new ProdutoDAO();
            dao.atualiza(produto);

            modeloTabela.fireTableRowsUpdated(linhaSelecionada, linhaSelecionada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_editarProdutoActionPerformed

    private void limparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTabelaActionPerformed
        try {
            modeloTabela.limparTabela();
            linhaSelecionada = -1;
            caixaDeTextoDescricao.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_limparTabelaActionPerformed

    private void tabelaProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMousePressed
        try {
            linhaSelecionada = tabelaProduto.rowAtPoint(evt.getPoint());
            Produto produto = modeloTabela.getProduto(linhaSelecionada);
            caixaDeTextoDescricao.setText(produto.getDescricao());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tabelaProduto, e.getMessage());
        }
    }//GEN-LAST:event_tabelaProdutoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNovoProduto;
    private javax.swing.JTextField caixaDeTextoDescricao;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton editarProduto;
    private javax.swing.JButton excluirProduto;
    private javax.swing.JButton limparTabela;
    private javax.swing.JButton listarProdutos;
    private javax.swing.JScrollPane scrollPanelTabela;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
