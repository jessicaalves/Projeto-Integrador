
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.ConecaoBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;
import modelo.Produto;
import modelo.ReceptorProduto;

/**
 *
 * @author jessica
 */
public class ListarProdutos extends javax.swing.JFrame {
 ConecaoBanco conbanco = new ConecaoBanco();
 private ReceptorProduto rp;
    /**
     * Creates new form ListaProduto
     */
    public ListarProdutos(ReceptorProduto receptorProduto) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        preencheTabelaCliente("");
        rp = receptorProduto;
    }
    
    
    public ListarProdutos(ReceptorProduto receptorProduto, boolean mostrarBoxQuantidade){
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        preencheTabelaCliente("");
        rp = receptorProduto;    
        
       
            jTquantidade.setVisible(mostrarBoxQuantidade);
            jLabel2.setVisible(mostrarBoxQuantidade);
       
                
        
    }

    public ArrayList preencheTabelaCliente(String buscarNome) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Marca", "Quantidade","Valor"};
        ConecaoBanco conectadb = new ConecaoBanco();
        conectadb.conexao();

        conectadb.executaSql("select * from produto where nome like'%" + buscarNome + "%'");

        try {

            conectadb.rs.first();
            do {
                dados.add(new Object[]{conectadb.rs.getString("idProduto"), conectadb.rs.getString("nome"), conectadb.rs.getString("marca"),  conectadb.rs.getString("quantidade"), conectadb.rs.getString("valor")});

            } while (conectadb.rs.next());

        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(null, "Não existem dados cadastrados! " );

            tabela.removeAll();

        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conectadb.desconecta();
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTBuscarProdutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTbSelecionarProduto = new javax.swing.JToggleButton();
        jTquantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Produtos");
        setResizable(false);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabela);

        jTBuscarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscarProdutosActionPerformed(evt);
            }
        });
        jTBuscarProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscarProdutosKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N

        jTbSelecionarProduto.setText("Selecionar produto");
        jTbSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbSelecionarProdutoActionPerformed(evt);
            }
        });

        jTquantidade.setText("1");
        jTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTquantidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Qnt.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBuscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(478, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jTbSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(236, 236, 236))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBuscarProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(101, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscarProdutosActionPerformed

    private void jTBuscarProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarProdutosKeyPressed
        preencheTabelaCliente(jTBuscarProdutos.getText());
    }//GEN-LAST:event_jTBuscarProdutosKeyPressed

    private void jTbSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbSelecionarProdutoActionPerformed

     
     Produto p = new Produto();
     
     
     int id = Integer.parseInt(""+tabela.getValueAt(tabela.getSelectedRow(), 0));
     int qnt = Integer.parseInt(jTquantidade.getText());
     double valor= Double.parseDouble(""+tabela.getValueAt(tabela.getSelectedRow(), 4));
     
     
     p.setId(id);
     p.setNome(""+tabela.getValueAt(tabela.getSelectedRow(), 1));//Concatenarc com Coluna 2(marca)?
     p.setMarca(""+tabela.getValueAt(tabela.getSelectedRow(), 2));
     p.setQuantidade(qnt);
     p.setValor(valor);
          
     rp.setProduto(p);
     
      this.dispose();
    }//GEN-LAST:event_jTbSelecionarProdutoActionPerformed

    private void jTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTquantidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBuscarProdutos;
    private javax.swing.JToggleButton jTbSelecionarProduto;
    private javax.swing.JTextField jTquantidade;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
