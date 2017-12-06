/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.ClienteD;
import dao.ConecaoBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import modelo.Cliente;
import modelo.ModeloTabela;
import modelo.ReceptorCliente;

/**
 *
 * @author Jéssica
 */
public class ListarClientes extends javax.swing.JFrame {

    ClienteD clid = new ClienteD();
   
    ConecaoBanco conbanco = new ConecaoBanco();

    public static int idCliente;
    private ReceptorCliente receptor;

    /**
     * Creates new form L_Produto
     */
    public ListarClientes(ReceptorCliente receptor) {
        idCliente = 0;
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        preencheTabelaCliente("");
        this.receptor = receptor;
    }

    public ArrayList preencheTabelaCliente(String buscarNome) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"id", "Nome", "cpf", "telefone", "cidade"};
        ConecaoBanco conectadb = new ConecaoBanco();
        conectadb.conexao();

        conectadb.executaSql("select * from cliente where nome like'%" + buscarNome + "%'");

        // String sql="Select * from cliente where telefone like'%" + PesquisaSQL + "%' ORDER ";
        try {

            conectadb.rs.first();
            do {
                dados.add(new Object[]{conectadb.rs.getString("idCliente"), conectadb.rs.getString("nome"), conectadb.rs.getString("cpf"), conectadb.rs.getString("telefone"), conectadb.rs.getString("cidade")});

            } while (conectadb.rs.next());

        } catch (SQLException ex) {

            tabela.removeAll();

            //JOptionPane.showMessageDialog(null, "Erro ao carregar os dados" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conectadb.desconecta();
        return null;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTBuscarClientes = new javax.swing.JTextField();
        jTbSelecionarCliente = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 720, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 7, 44, -1));

        jTBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscarClientesActionPerformed(evt);
            }
        });
        jTBuscarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscarClientesKeyPressed(evt);
            }
        });
        jPanel1.add(jTBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 184, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTbSelecionarCliente.setText("Selecionar cliente");
        jTbSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbSelecionarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTbSelecionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 180, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscarClientesActionPerformed

    private void jTBuscarClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarClientesKeyPressed
        preencheTabelaCliente(jTBuscarClientes.getText());

    }//GEN-LAST:event_jTBuscarClientesKeyPressed

    private void jTbSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbSelecionarClienteActionPerformed

        idCliente = Integer.parseInt("" + tabela.getValueAt(tabela.getSelectedRow(), 0));
        
        Cliente c = new Cliente();
        
        c.setId(idCliente);
        c.setNome(""+tabela.getValueAt(tabela.getSelectedRow(), 1));
        
        //ServicoVisao.iDcliente = idCliente;
        receptor.setCliente(c);
        
        this.dispose();

    }//GEN-LAST:event_jTbSelecionarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBuscarClientes;
    private javax.swing.JToggleButton jTbSelecionarCliente;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
