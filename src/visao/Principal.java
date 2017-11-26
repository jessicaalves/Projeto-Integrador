package visao;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        //setLocationByPlatform(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBprodutos = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBservicos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Serviço Easy Solution");
        getContentPane().setLayout(null);

        jBprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bulk.png"))); // NOI18N
        jBprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprodutosActionPerformed(evt);
            }
        });
        getContentPane().add(jBprodutos);
        jBprodutos.setBounds(430, 150, 130, 131);

        jBclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/folder.customer.icon.jpg"))); // NOI18N
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });
        getContentPane().add(jBclientes);
        jBclientes.setBounds(100, 150, 130, 130);

        jBservicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/maintenance.ordinateur.reseaux.tanger.maroc.jpg"))); // NOI18N
        jBservicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBservicosActionPerformed(evt);
            }
        });
        getContentPane().add(jBservicos);
        jBservicos.setBounds(270, 150, 130, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/872b4cdee9ddd7e4f52a89eeab9b1dcb-fundo-brilhante-azul-abstrato-da-tecnologia.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 580);

        setSize(new java.awt.Dimension(685, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBservicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBservicosActionPerformed
       new ServicoVisao().setVisible(true);
    }//GEN-LAST:event_jBservicosActionPerformed

    private void jBprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprodutosActionPerformed
        new ProdutoVisao().setVisible(true);
    }//GEN-LAST:event_jBprodutosActionPerformed

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        new ClienteVisao().setVisible(true);
    }//GEN-LAST:event_jBclientesActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBprodutos;
    private javax.swing.JButton jBservicos;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
