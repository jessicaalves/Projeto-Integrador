/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ProdutoC;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica A Ferreira
 */
public class ProdutoVisao extends javax.swing.JFrame {
   
    /**
     * Creates new form ProdutoVisao
     */
    public ProdutoVisao() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        jLnome = new javax.swing.JLabel();
        jLmodelo = new javax.swing.JLabel();
        jLmarca = new javax.swing.JLabel();
        jLconfiguracao = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTconfiguracao = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jBalterar = new javax.swing.JButton();
        jBsalvar1 = new javax.swing.JButton();
        jBbuscarProdutos = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBnovo1 = new javax.swing.JButton();
        jLvalor = new javax.swing.JLabel();
        jLquantidade = new javax.swing.JLabel();
        jTquantidade = new javax.swing.JTextField();
        jTvalor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLnome.setText("*Nome: ");
        jPanel1.add(jLnome);
        jLnome.setBounds(70, 50, 40, 14);

        jLmodelo.setText("Modelo: ");
        jPanel1.add(jLmodelo);
        jLmodelo.setBounds(70, 90, 41, 14);

        jLmarca.setText("Marca: ");
        jPanel1.add(jLmarca);
        jLmarca.setBounds(80, 130, 78, 14);

        jLconfiguracao.setText("Configuração:");
        jPanel1.add(jLconfiguracao);
        jLconfiguracao.setBounds(40, 170, 68, 14);

        jTmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmodeloActionPerformed(evt);
            }
        });
        jPanel1.add(jTmodelo);
        jTmodelo.setBounds(130, 90, 350, 25);

        jTmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmarcaActionPerformed(evt);
            }
        });
        jPanel1.add(jTmarca);
        jTmarca.setBounds(130, 130, 170, 25);

        jTconfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTconfiguracaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTconfiguracao);
        jTconfiguracao.setBounds(130, 170, 170, 25);

        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTnome);
        jTnome.setBounds(130, 50, 350, 25);

        jBalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit-validated_40458.png"))); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });
        jPanel1.add(jBalterar);
        jBalterar.setBounds(490, 270, 120, 50);

        jBsalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar1.setText("Salvar");
        jBsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalvar1);
        jBsalvar1.setBounds(70, 270, 120, 50);

        jBbuscarProdutos.setText("Buscar Produtos");
        jBbuscarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarProdutos);
        jBbuscarProdutos.setBounds(520, 50, 120, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Delete-icon-2.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBexcluir);
        jBexcluir.setBounds(350, 270, 120, 50);

        jBnovo1.setText("Novo");
        jBnovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBnovo1);
        jBnovo1.setBounds(210, 270, 120, 50);

        jLvalor.setText("Valor: ");
        jPanel1.add(jLvalor);
        jLvalor.setBounds(320, 170, 34, 14);

        jLquantidade.setText("Quantidade:");
        jPanel1.add(jLquantidade);
        jLquantidade.setBounds(310, 130, 70, 14);

        jTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTquantidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jTquantidade);
        jTquantidade.setBounds(380, 130, 100, 25);

        jTvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalorActionPerformed(evt);
            }
        });
        jPanel1.add(jTvalor);
        jTvalor.setBounds(379, 170, 100, 25);

        jButton1.setText("Buscar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 130, 120, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
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

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jBsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvar1ActionPerformed
      //Se os campos especificados abaixo não forem preenchidos,
      //.equals compara logicamente | (== "") compara se é o mesmo objeto
        if (jTnome.getText().equals("")
                || jTquantidade.getText().equals("")
                || jTvalor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios! ");
            
        }else{// Os campos preenchidos do formulário serão adicionados no arrayList produtos
            //para serem enviados para frente...
            ArrayList<String> produto = new ArrayList<>();
            produto.add(jTnome.getText());
            produto.add(jTmodelo.getText());
            produto.add(jTmarca.getText());
            produto.add(jTquantidade.getText());
            produto.add(jTconfiguracao.getText());
            produto.add(jTvalor.getText());
            
            new ProdutoC().cadastrar(produto);

        }
    }//GEN-LAST:event_jBsalvar1ActionPerformed

    private void jBbuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarProdutosActionPerformed
        new ListarProdutos().setVisible(true);
    }//GEN-LAST:event_jBbuscarProdutosActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBnovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovo1ActionPerformed
        jTnome.setText("");
        jTmodelo.setText("");
        jTmarca.setText("");
        jTquantidade.setText("");
        jTconfiguracao.setText("");
        jTvalor.setText("");
        
    }//GEN-LAST:event_jBnovo1ActionPerformed

    private void jTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTquantidadeActionPerformed

    private void jTvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvalorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBbuscarProdutos;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo1;
    private javax.swing.JButton jBsalvar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLconfiguracao;
    private javax.swing.JLabel jLmarca;
    private javax.swing.JLabel jLmodelo;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLquantidade;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTconfiguracao;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTquantidade;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables

}