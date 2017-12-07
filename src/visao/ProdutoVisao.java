/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ProdutoC;
import dao.ProdutoD;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Produto;
import modelo.ReceptorProduto;

/**
 *
 * @author Jéssica A Ferreira
 */
public class ProdutoVisao extends javax.swing.JFrame implements ReceptorProduto {

    ProdutoD produto = new ProdutoD();
    Produto prod;

    @Override
    public void setProduto(Produto p) {

        p=new ProdutoD().selecionaProduto(p.getId());
        
        
        jTid.setText("" + p.getId());
        jTnome.setText(p.getNome());
        jTmodelo.setText(p.getModelo());
        jTmarca.setText(p.getMarca());
        jTquantidade.setText("" + p.getQuantidade());
        jTconfiguracao.setText(p.getConfiguracao());
        jTvalor.setText(""+p.getValor());

         }

    public ProdutoVisao() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        jLmodelo = new javax.swing.JLabel();
        jLmarca = new javax.swing.JLabel();
        jLconfiguracao = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTconfiguracao = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JButton();
        jBbuscarProdutos = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jLvalor = new javax.swing.JLabel();
        jLquantidade = new javax.swing.JLabel();
        jTquantidade = new javax.swing.JTextField();
        jTvalor = new javax.swing.JTextField();
        jLid = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jBsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLnome.setText("*Nome: ");
        jPanel1.add(jLnome);
        jLnome.setBounds(90, 70, 70, 30);

        jLmodelo.setText("Modelo: ");
        jPanel1.add(jLmodelo);
        jLmodelo.setBounds(90, 110, 60, 30);

        jLmarca.setText("Marca: ");
        jPanel1.add(jLmarca);
        jLmarca.setBounds(98, 150, 80, 30);

        jLconfiguracao.setText("Configuração:");
        jPanel1.add(jLconfiguracao);
        jLconfiguracao.setBounds(70, 190, 80, 30);

        jTmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmodeloActionPerformed(evt);
            }
        });
        jPanel1.add(jTmodelo);
        jTmodelo.setBounds(150, 110, 170, 30);

        jTmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmarcaActionPerformed(evt);
            }
        });
        jPanel1.add(jTmarca);
        jTmarca.setBounds(150, 150, 170, 30);

        jTconfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTconfiguracaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTconfiguracao);
        jTconfiguracao.setBounds(150, 190, 170, 30);

        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTnome);
        jTnome.setBounds(150, 70, 350, 30);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalvar);
        jBsalvar.setBounds(70, 310, 170, 50);

        jBbuscarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/novoProduto2.png"))); // NOI18N
        jBbuscarProdutos.setText("Buscar Produtos");
        jBbuscarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarProdutos);
        jBbuscarProdutos.setBounds(540, 70, 170, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Delete-icon-2.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBexcluir);
        jBexcluir.setBounds(470, 310, 170, 50);

        jBnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mais.png"))); // NOI18N
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnovo);
        jBnovo.setBounds(270, 310, 170, 50);

        jLvalor.setText("Valor: ");
        jPanel1.add(jLvalor);
        jLvalor.setBounds(360, 190, 60, 30);

        jLquantidade.setText("Quantidade:");
        jPanel1.add(jLquantidade);
        jLquantidade.setBounds(330, 150, 70, 30);

        jTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTquantidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jTquantidade);
        jTquantidade.setBounds(400, 150, 100, 30);

        jTvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTvalorKeyReleased(evt);
            }
        });
        jPanel1.add(jTvalor);
        jTvalor.setBounds(400, 190, 100, 30);

        jLid.setText("ID:");
        jPanel1.add(jLid);
        jLid.setBounds(370, 110, 30, 30);

        jTid.setEditable(false);
        jPanel1.add(jTid);
        jTid.setBounds(400, 110, 100, 30);

        jBsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sair1.png"))); // NOI18N
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });
        jPanel1.add(jBsair);
        jBsair.setBounds(540, 140, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmodeloActionPerformed

    private void jTmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmarcaActionPerformed

    private void jTconfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTconfiguracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTconfiguracaoActionPerformed

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomeActionPerformed

    private void limparCampos() {

        jTnome.setText("");
        jTmodelo.setText("");
        jTmarca.setText("");
        jTquantidade.setText("");
        jTconfiguracao.setText("");
        jTvalor.setText("");
        jTid.setText("");
    }

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        //Se os campos especificados abaixo não forem preenchidos,
        //.equals compara logicamente | (== "") compara se é o mesmo objeto
        if (jTnome.getText().equals("")
                || jTquantidade.getText().equals("")
                || jTvalor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios! ");

        } else {// Os campos preenchidos do formulário serão adicionados no arrayList produtos
            //para serem enviados para frente...
            ArrayList<String> produto = new ArrayList<>();
            produto.add(jTnome.getText());
            produto.add(jTmodelo.getText());
            produto.add(jTmarca.getText());
            produto.add(jTquantidade.getText());
            produto.add(jTconfiguracao.getText());
            produto.add(jTvalor.getText());
            
            produto.add(jTid.getText());
            
            
            if(jTid.getText().equals("")){
                new ProdutoC().cadastrar(produto);
                
            }else{                
                new ProdutoC().alterar(produto);
            }
            
            
            
            
            limparCampos();

        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBbuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarProdutosActionPerformed
        // new ListarProdutos().setVisible(true);
        new ListarProdutos(this,false).setVisible(true);
    }//GEN-LAST:event_jBbuscarProdutosActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed

        limparCampos();


    }//GEN-LAST:event_jBnovoActionPerformed

    private void jTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTquantidadeActionPerformed

    private void jTvalorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTvalorKeyReleased
       
        String x = jTvalor.getText();

        x = x.replace(',', '.');
        x = x.replace("..", ".");

        jTvalor.setText(x);
    }//GEN-LAST:event_jTvalorKeyReleased

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarProdutos;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JLabel jLconfiguracao;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLmarca;
    private javax.swing.JLabel jLmodelo;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLquantidade;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTconfiguracao;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTquantidade;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables

   
}
