package projetofinaljava;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author levyc
 */
public class TelasSistema extends javax.swing.JFrame {

    private ModeloTabelaProdutos modeloTabela = new ModeloTabelaProdutos();
    private ModeloTabelaCliente modeloTabelaCliente = new ModeloTabelaCliente();
    private int linhaSelecionada=-1;    

    /**
     * Creates new form NovaTabelaProduto
     */
    public TelasSistema() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jFrame1 = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        scrolTabelaCliente = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        cpfLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        sobrenomeLabel = new javax.swing.JLabel();
        caixaCpf = new javax.swing.JTextField();
        caixaNome = new javax.swing.JTextField();
        caixaSobrenome = new javax.swing.JTextField();
        listarClientes = new javax.swing.JButton();
        excluirCliente = new javax.swing.JButton();
        limparListaClientes = new javax.swing.JButton();
        novoCliente = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botaoNovoProduto = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();
        caixaDeTextoDescricao = new javax.swing.JTextField();
        scrollPanelTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        listarProdutos = new javax.swing.JButton();
        excluirProduto = new javax.swing.JButton();
        editarProduto = new javax.swing.JButton();
        limparTabela = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaCliente.setModel(modeloTabelaCliente);
        tabelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrolTabelaCliente.setViewportView(tabelaCliente);

        cpfLabel.setText("CPF:");

        nomeLabel.setText("Nome:");

        sobrenomeLabel.setText("Sobrenome:");

        caixaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCpfActionPerformed(evt);
            }
        });

        listarClientes.setText("Listar");
        listarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarClientesMouseClicked(evt);
            }
        });

        excluirCliente.setText("Excluir");
        excluirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirClienteMouseClicked(evt);
            }
        });

        limparListaClientes.setText("Limpar");
        limparListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparListaClientesMouseClicked(evt);
            }
        });

        novoCliente.setText("Novo");
        novoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoClienteMouseClicked(evt);
            }
        });

        jButton5.setText("Atualizar (NA)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrolTabelaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(listarClientes)
                                .addGap(18, 18, 18)
                                .addComponent(excluirCliente)
                                .addGap(18, 18, 18)
                                .addComponent(limparListaClientes))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(novoCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sobrenomeLabel)
                                    .addComponent(nomeLabel)
                                    .addComponent(cpfLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caixaCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(caixaNome)
                                    .addComponent(caixaSobrenome))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolTabelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarClientes)
                    .addComponent(excluirCliente)
                    .addComponent(limparListaClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(caixaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeLabel)
                    .addComponent(caixaSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoCliente)
                    .addComponent(jButton5))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cliente", jPanel2);

        botaoNovoProduto.setText("Novo");
        botaoNovoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoNovoProdutoMouseClicked(evt);
            }
        });
        botaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoProdutoActionPerformed(evt);
            }
        });

        descricaoLabel.setText("Descrição: ");

        caixaDeTextoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDeTextoDescricaoActionPerformed(evt);
            }
        });

        tabela.setModel(modeloTabela);
        scrollPanelTabela.setViewportView(tabela);

        listarProdutos.setText("Listar");
        listarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarProdutosMouseClicked(evt);
            }
        });
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });

        excluirProduto.setText("Excluir");
        excluirProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirProdutoMouseClicked(evt);
            }
        });
        excluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirProdutoActionPerformed(evt);
            }
        });

        editarProduto.setText("Editar (NA)");
        editarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarProdutoMouseClicked(evt);
            }
        });
        editarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoActionPerformed(evt);
            }
        });

        limparTabela.setText("Limpar");
        limparTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparTabelaMouseClicked(evt);
            }
        });
        limparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarProdutos)
                            .addComponent(descricaoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaDeTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarProduto)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(excluirProduto)
                                .addGap(18, 18, 18)
                                .addComponent(limparTabela)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarProdutos)
                    .addComponent(excluirProduto)
                    .addComponent(limparTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaDeTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovoProduto)
                    .addComponent(editarProduto))
                .addGap(45, 45, 45))
        );

        jTabbedPane2.addTab("Produtos", jPanel3);

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pedidos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoNovoProdutoActionPerformed

    private void botaoNovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNovoProdutoMouseClicked
            String descricao = caixaDeTextoDescricao.getText();
            Produto p = new Produto(0L, descricao);
            ProdutoDAO dao = new ProdutoDAO();
            dao.insere(p);
            modeloTabela.adicionaProduto(p);      
        

    }//GEN-LAST:event_botaoNovoProdutoMouseClicked

    private void caixaDeTextoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDeTextoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaDeTextoDescricaoActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void listarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarProdutosMouseClicked
        List<Produto> lista = new ProdutoDAO().getLista();
        modeloTabela.setListaProdutos(lista);

    }//GEN-LAST:event_listarProdutosMouseClicked

    private void excluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoActionPerformed
        ProdutoDAO p = new ProdutoDAO();
        int[] linhasSelecionadas = tabela.getSelectedRows();
        List<Produto> listaExcluir = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Produto produto = modeloTabela.getProduto(linhasSelecionadas[i]);
            p.deleta(produto);
            listaExcluir.add(produto);

        }
        for (Produto produto : listaExcluir) {
            modeloTabela.deleteProduto(produto);
        }    

    }//GEN-LAST:event_excluirProdutoActionPerformed

    private void editarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarProdutoActionPerformed

    private void excluirProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirProdutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirProdutoMouseClicked

    private void editarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarProdutoMouseClicked
       if (linhaSelecionada !=-1) {
            Produto produto = modeloTabela.getProduto(linhaSelecionada);
            produto.setDescricao(caixaDeTextoDescricao.getText());
            ProdutoDAO dao = null;            
            dao = new ProdutoDAO();
            dao.atualiza(produto);

            modeloTabela.fireTableRowsUpdated(linhaSelecionada, linhaSelecionada);
       }


    }//GEN-LAST:event_editarProdutoMouseClicked

    private void limparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limparTabelaActionPerformed

    private void limparTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparTabelaMouseClicked
        modeloTabela.limparTabela();
    }//GEN-LAST:event_limparTabelaMouseClicked

    private void caixaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaCpfActionPerformed

    private void novoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoClienteMouseClicked
        String cpf = caixaCpf.getText();
        String nome = caixaNome.getText();
        String sobrenome = caixaSobrenome.getText();     
        
        Cliente c = new Cliente(0L, cpf, nome, sobrenome);
        ClienteDAO dao = new ClienteDAO();
        dao.insere(c);
        modeloTabelaCliente.adicionaCliente(c);      
               
        
    }//GEN-LAST:event_novoClienteMouseClicked

    private void listarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarClientesMouseClicked
        List<Cliente> lista = new ClienteDAO().getLista();
        modeloTabelaCliente.setListaClientes(lista);
    }//GEN-LAST:event_listarClientesMouseClicked

    private void excluirClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirClienteMouseClicked
        ClienteDAO c = new ClienteDAO();
        int[] linhasSelecionadas = tabelaCliente.getSelectedRows();
        List<Cliente> listaExcluir = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Cliente cliente = modeloTabelaCliente.getCliente(linhasSelecionadas[i]);
            c.deleta(cliente);
            listaExcluir.add(cliente);
        }
        for (Cliente cliente : listaExcluir) {
            modeloTabelaCliente.deleteCliente(cliente);
        }        
        
        
        
    }//GEN-LAST:event_excluirClienteMouseClicked

    private void limparListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparListaClientesMouseClicked
        modeloTabelaCliente.limparTabela();
    }//GEN-LAST:event_limparListaClientesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelasSistema.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelasSistema.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelasSistema.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelasSistema.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelasSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNovoProduto;
    private javax.swing.JTextField caixaCpf;
    private javax.swing.JTextField caixaDeTextoDescricao;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JTextField caixaSobrenome;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton editarProduto;
    private javax.swing.JButton excluirCliente;
    private javax.swing.JButton excluirProduto;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton limparListaClientes;
    private javax.swing.JButton limparTabela;
    private javax.swing.JButton listarClientes;
    private javax.swing.JButton listarProdutos;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton novoCliente;
    private javax.swing.JScrollPane scrolTabelaCliente;
    private javax.swing.JScrollPane scrollPanelTabela;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables
}
