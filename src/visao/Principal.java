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
        jBClientes = new javax.swing.JButton();
        jBServicos = new javax.swing.JButton();
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
        jBprodutos.setBounds(430, 150, 130, 137);

        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/folder.customer.icon.jpg"))); // NOI18N
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jBClientes);
        jBClientes.setBounds(100, 150, 130, 130);

        jBServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/maintenance.ordinateur.reseaux.tanger.maroc.jpg"))); // NOI18N
        jBServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBServicosActionPerformed(evt);
            }
        });
        getContentPane().add(jBServicos);
        jBServicos.setBounds(270, 150, 130, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/872b4cdee9ddd7e4f52a89eeab9b1dcb-fundo-brilhante-azul-abstrato-da-tecnologia.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 580);

        setSize(new java.awt.Dimension(685, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBServicosActionPerformed
       new ServicoVisao().setVisible(true);
    }//GEN-LAST:event_jBServicosActionPerformed

    private void jBprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprodutosActionPerformed
        new ProdutoVisao().setVisible(true);
    }//GEN-LAST:event_jBprodutosActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        new ClienteVisao().setVisible(true);
    }//GEN-LAST:event_jBClientesActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBServicos;
    private javax.swing.JButton jBprodutos;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
