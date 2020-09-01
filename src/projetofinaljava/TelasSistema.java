package projetofinaljava;

import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
    private ModeloTabelaPedidos modeloTabelaPedidos = new ModeloTabelaPedidos();
    private int linhaSelecionada = -1;
    private Cliente cliente;

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
        atualizaCliente = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        scrollProdutoPedido = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        pegarCpf = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        exibeNomeCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        quantProduto = new javax.swing.JTextField();
        adicionarProduto = new javax.swing.JButton();
        scrollPedido = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        listaProdutos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        listaPedidos = new javax.swing.JButton();
        scrollPedidos = new javax.swing.JScrollPane();
        tabelaPedidos = new javax.swing.JTable();
        cpfClienteListarPedidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaCliente.setModel(modeloTabelaCliente);
        tabelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        scrolTabelaCliente.setViewportView(tabelaCliente);

        cpfLabel.setText("CPF:");

        nomeLabel.setText("Nome:");

        sobrenomeLabel.setText("Sobrenome:");

        listarClientes.setText("Listar");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
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

        atualizaCliente.setText("Atualizar");
        atualizaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrolTabelaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
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
                                .addComponent(atualizaCliente))
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
                .addComponent(scrolTabelaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
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
                    .addComponent(atualizaCliente))
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Cliente", jPanel2);

        botaoNovoProduto.setText("Novo");
        botaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoProdutoActionPerformed(evt);
            }
        });

        descricaoLabel.setText("Descrição: ");

        tabela.setModel(modeloTabela);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        scrollPanelTabela.setViewportView(tabela);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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

        tabelaProduto.setModel(modeloTabela);
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        scrollProdutoPedido.setViewportView(tabelaProduto);

        pegarCpf.setText("Digite CPF");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisarMouseClicked(evt);
            }
        });

        jLabel1.setText("Produto");

        quantProduto.setText("Quant..");

        adicionarProduto.setText("OK");
        adicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarProdutoMouseClicked(evt);
            }
        });

        jTable2.setModel(modeloTabelaPedidos);
        scrollPedido.setViewportView(jTable2);

        listaProdutos.setText("Listar Produtos");
        listaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdutosMouseClicked(evt);
            }
        });

        jButton2.setText("Excluir Item");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaProdutos))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exibeNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(quantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(adicionarProduto))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scrollPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pegarCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(listaProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pegarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exibeNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adicionarProduto))
                        .addGap(37, 37, 37)
                        .addComponent(scrollPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2))
                    .addComponent(scrollProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Incluir Pedido", jPanel4);

        listaPedidos.setText("Listar pedidos do cliente");
        listaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPedidosActionPerformed(evt);
            }
        });

        tabelaPedidos.setModel(modeloTabela);
        scrollPedidos.setViewportView(tabelaPedidos);

        cpfClienteListarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteListarPedidosActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF do cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(scrollPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 415, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfClienteListarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaPedidos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfClienteListarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaPedidos))
                .addGap(12, 12, 12)
                .addComponent(scrollPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 217, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listar Pedido", jPanel1);

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
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void botaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoProdutoActionPerformed
        try {
            String descricao = caixaDeTextoDescricao.getText();
            Produto p = new Produto(0L, descricao);
            ProdutoDAO dao = new ProdutoDAO();
            dao.insere(p);
            modeloTabela.adicionaProduto(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoNovoProdutoActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        try {
            List<Produto> lista = new ProdutoDAO().getLista();
            modeloTabela.setListaProdutos(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void excluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoActionPerformed
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
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
            e.printStackTrace();
        }
    }//GEN-LAST:event_editarProdutoActionPerformed

    private void limparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTabelaActionPerformed
        try {
            modeloTabela.limparTabela();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_limparTabelaActionPerformed

    private void novoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoClienteMouseClicked
        try {
            String cpf = caixaCpf.getText();
            String nome = caixaNome.getText();
            String sobrenome = caixaSobrenome.getText();

            Cliente c = new Cliente(0L, cpf, nome, sobrenome);
            ClienteDAO dao = new ClienteDAO();
            dao.insere(c);
            modeloTabelaCliente.adicionaCliente(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_novoClienteMouseClicked

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

    private void atualizaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizaClienteMouseClicked
        if (linhaSelecionada!=-1) {
            Cliente cliente = modeloTabelaCliente.getCliente(linhaSelecionada);
            cliente.setCpf(caixaCpf.getText());
            cliente.setNome(caixaNome.getText());
            cliente.setSobrenome(caixaSobrenome.getText());

            ClienteDAO dao = null;
            dao = new ClienteDAO();
            dao.atualiza(cliente);

            modeloTabelaCliente.fireTableRowsUpdated(linhaSelecionada, linhaSelecionada);
        }
    }//GEN-LAST:event_atualizaClienteMouseClicked

    private void botaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarMouseClicked
           String cpf = pegarCpf.getText();             
           ClienteDAO dao = new ClienteDAO();
           this.cliente = dao.get(cpf);
           String nome = this.cliente.getNome();
           String sobrenome = this.cliente.getSobrenome();            
           exibeNomeCliente.setText(nome + " " + sobrenome);
    }//GEN-LAST:event_botaoPesquisarMouseClicked

    private void listaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdutosMouseClicked
        List<Produto> lista = new ProdutoDAO().getLista();
        modeloTabela.setListaProdutos(lista);
    }//GEN-LAST:event_listaProdutosMouseClicked

    private void adicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarProdutoMouseClicked
        System.out.println(linhaSelecionada);
        if (linhaSelecionada != -1) {
            Produto produto = modeloTabela.getProduto(linhaSelecionada);            ;
            long quantidade = Long.parseLong(quantProduto.getText());                       
            LocalDate data = LocalDate.now();         
            
            Pedido pedido = new Pedido(data, this.cliente, null);          
            PedidoDAO daopedido = new PedidoDAO();
            daopedido.insere(pedido);
            
            ItemDoPedido item = new ItemDoPedido(quantidade, produto);           
            ItemDoPedidoDAO dao = new ItemDoPedidoDAO();           
            dao.insere(pedido.getId(),item);
            
            List<Pedido> lista = new PedidoDAO().getLista();
            modeloTabelaPedidos.setListaPedidos(lista);  
       } 
    }//GEN-LAST:event_adicionarProdutoMouseClicked

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        this.linhaSelecionada = tabelaCliente.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        this.linhaSelecionada = tabelaProduto.rowAtPoint(evt.getPoint());              
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void listaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPedidosActionPerformed
        try {
            PedidoDAO dao = new PedidoDAO();
            List<Pedido> lista = dao.getLista();
            
            String cpf = cpfClienteListarPedidos.getText();
            
            modeloTabelaPedidos.setListaPedidos(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listaPedidosActionPerformed

    private void cpfClienteListarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteListarPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteListarPedidosActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        this.linhaSelecionada = tabelaProduto.rowAtPoint(evt.getPoint());
        Produto produto = this.modeloTabela.getProduto(linhaSelecionada);
        caixaDeTextoDescricao.setText(produto.getDescricao());
    }//GEN-LAST:event_tabelaMouseClicked

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesActionPerformed
        try {
            List<Cliente> lista = new ClienteDAO().getLista();
            modeloTabelaCliente.setListaClientes(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarClientesActionPerformed

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
    private javax.swing.JButton adicionarProduto;
    private javax.swing.JButton atualizaCliente;
    private javax.swing.JButton botaoNovoProduto;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField caixaCpf;
    private javax.swing.JTextField caixaDeTextoDescricao;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JTextField caixaSobrenome;
    private javax.swing.JTextField cpfClienteListarPedidos;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton editarProduto;
    private javax.swing.JButton excluirCliente;
    private javax.swing.JButton excluirProduto;
    private javax.swing.JLabel exibeNomeCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton limparListaClientes;
    private javax.swing.JButton limparTabela;
    private javax.swing.JButton listaPedidos;
    private javax.swing.JButton listaProdutos;
    private javax.swing.JButton listarClientes;
    private javax.swing.JButton listarProdutos;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton novoCliente;
    private javax.swing.JTextField pegarCpf;
    private javax.swing.JTextField quantProduto;
    private javax.swing.JScrollPane scrolTabelaCliente;
    private javax.swing.JScrollPane scrollPanelTabela;
    private javax.swing.JScrollPane scrollPedido;
    private javax.swing.JScrollPane scrollPedidos;
    private javax.swing.JScrollPane scrollProdutoPedido;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaPedidos;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
