package visao;

import dao.ConecaoBanco;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    ConecaoBanco con = new ConecaoBanco();

    public Login() {
        initComponents();
        con.conexao();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bt_cancelar = new javax.swing.JButton();
        jLsenha = new javax.swing.JLabel();
        text_login1 = new javax.swing.JTextField();
        jLlogin = new javax.swing.JLabel();
        bt_ok = new javax.swing.JButton();
        text_login2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setIconImage(Toolkit.getDefaultToolkit().getImage("/recursos/login-icon-39414_2"));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, 30));

        jLsenha.setText("Senha:");
        jPanel2.add(jLsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        text_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_login1ActionPerformed(evt);
            }
        });
        jPanel2.add(text_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 30));

        jLlogin.setText("Login:");
        jPanel2.add(jLlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        bt_ok.setText("OK");
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });
        jPanel2.add(bt_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));

        text_login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_login2ActionPerformed(evt);
            }
        });
        jPanel2.add(text_login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login-icon-39414_2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 500, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed

        try {

            String sql = "select * from operadorsistema where Usuario =? and senha =?";

            PreparedStatement ps = con.conn.prepareStatement(sql);

            ps.setString(1, text_login1.getText());
            ps.setString(2, text_login2.getText());

            con.rs = ps.executeQuery();

//Se a busca com usuário e senha digitados retornou ao menos uma linha, 
//quer dizer que estão certos login e senha, logo carrega a tela principal
            if (con.rs.first()) {
                this.dispose();
                new Principal().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha não encontrado(s).");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Senha ou usuario invalidos !");
        }


    }//GEN-LAST:event_bt_okActionPerformed

    private void text_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_login1ActionPerformed

    private void text_login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_login2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_login2ActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLlogin;
    private javax.swing.JLabel jLsenha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField text_login1;
    private javax.swing.JPasswordField text_login2;
    // End of variables declaration//GEN-END:variables

    private void disposo() {
        //To change body of generated methods, choose Tools | Templates.
    }
}
