package visao;

import dao.ClienteD;
import dao.ConecaoBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Cliente;
import modelo.ModeloTabela;

public class ClienteVisao extends javax.swing.JFrame {
    ClienteD clid = new ClienteD();
    Cliente cli = new Cliente();
    ConecaoBanco conbanco = new ConecaoBanco();
    public ClienteVisao() {
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jT9 = new javax.swing.JTextField();
        jLnome = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jT7 = new javax.swing.JTextField();
        jLtelefone2 = new javax.swing.JLabel();
        jLresponsavel = new javax.swing.JLabel();
        jT1 = new javax.swing.JTextField();
        jLendereco = new javax.swing.JLabel();
        jT2 = new javax.swing.JTextField();
        jLcpf = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLtelefone1 = new javax.swing.JLabel();
        jLcidade = new javax.swing.JLabel();
        jT5 = new javax.swing.JTextField();
        jLestado = new javax.swing.JLabel();
        jLcep = new javax.swing.JLabel();
        jT8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBsalvar = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jBalterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jT3 = new javax.swing.JTextField();
        jT4 = new javax.swing.JTextField();
        jT6 = new javax.swing.JTextField();
        jBbuscarClientes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jtexPesquisar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setSize(new java.awt.Dimension(1000, 1000));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel2.setLayout(null);

        jT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT9ActionPerformed(evt);
            }
        });
        jPanel2.add(jT9);
        jT9.setBounds(270, 240, 100, 25);

        jLnome.setText("*Nome:");
        jPanel2.add(jLnome);
        jLnome.setBounds(70, 40, 70, 20);

        jLid.setText("ID:");
        jPanel2.add(jLid);
        jLid.setBounds(100, 120, 30, 14);

        jT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT7ActionPerformed(evt);
            }
        });
        jPanel2.add(jT7);
        jT7.setBounds(130, 200, 350, 25);

        jLtelefone2.setText("Telefone 2:");
        jPanel2.add(jLtelefone2);
        jLtelefone2.setBounds(290, 160, 70, 20);

        jLresponsavel.setText("Responsável:");
        jPanel2.add(jLresponsavel);
        jLresponsavel.setBounds(50, 80, 100, 20);

        jT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT1ActionPerformed(evt);
            }
        });
        jPanel2.add(jT1);
        jT1.setBounds(130, 40, 350, 25);

        jLendereco.setText("Endereço:");
        jPanel2.add(jLendereco);
        jLendereco.setBounds(70, 200, 90, 20);

        jT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT2ActionPerformed(evt);
            }
        });
        jPanel2.add(jT2);
        jT2.setBounds(130, 80, 350, 25);

        jLcpf.setText("CPF:");
        jPanel2.add(jLcpf);
        jLcpf.setBounds(330, 120, 23, 14);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(220, 200, 0, 0);

        jLtelefone1.setText("*Telefone 1:");
        jPanel2.add(jLtelefone1);
        jLtelefone1.setBounds(50, 160, 70, 20);

        jLcidade.setText("Cidade:");
        jPanel2.add(jLcidade);
        jLcidade.setBounds(80, 240, 50, 20);

        jT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT5ActionPerformed(evt);
            }
        });
        jPanel2.add(jT5);
        jT5.setBounds(130, 160, 120, 25);

        jLestado.setText("Estado:");
        jPanel2.add(jLestado);
        jLestado.setBounds(380, 240, 60, 20);

        jLcep.setText("CEP:");
        jPanel2.add(jLcep);
        jLcep.setBounds(240, 240, 40, 20);

        jT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT8ActionPerformed(evt);
            }
        });
        jPanel2.add(jT8);
        jT8.setBounds(130, 240, 100, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ \t ", "RN \t ", "RS \t ", "RO \t ", "RR \t ", "SC \t ", "SP \t ", "SE \t ", "TO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(430, 240, 55, 20);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jBsalvar);
        jBsalvar.setBounds(10, 290, 120, 50);

        jBnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icone_usuario_novo.png"))); // NOI18N
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel2.add(jBnovo);
        jBnovo.setBounds(140, 290, 120, 50);

        jBalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alterar.png"))); // NOI18N
        jBalterar.setText("Alterar");
        jPanel2.add(jBalterar);
        jBalterar.setBounds(400, 290, 120, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ca.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jBexcluir);
        jBexcluir.setBounds(270, 290, 120, 50);

        jT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT3ActionPerformed(evt);
            }
        });
        jPanel2.add(jT3);
        jT3.setBounds(130, 120, 120, 25);

        jT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT4ActionPerformed(evt);
            }
        });
        jPanel2.add(jT4);
        jT4.setBounds(360, 120, 120, 25);

        jT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT6ActionPerformed(evt);
            }
        });
        jPanel2.add(jT6);
        jT6.setBounds(360, 160, 120, 25);

        jBbuscarClientes.setText("Buscar Clientes");
        jBbuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarClientesActionPerformed(evt);
            }
        });
        jPanel2.add(jBbuscarClientes);
        jBbuscarClientes.setBounds(530, 290, 120, 50);

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

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 420, 570, 110);

        jtexPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtexPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(jtexPesquisar);
        jtexPesquisar.setBounds(430, 360, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        // TODO add your hadling code here:
        jT1.setText("");
        jT5.setText("");
        jT7.setText("");
        jT4.setText("");
        jT2.setText("");
        jT6.setText("");
        jT8.setText("");
        jT9.setText("");
        
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        // TODO add your handling code here:
        cli.setNome(jT1.getText());
        cli.setTelefone(jT5.getText());
        cli.setEndereco(jT7.getText());
        cli.setCpf(jT4.getText());
        cli.setNome_responsavel(jT2.getText());
        cli.setTelefone2(jT6.getText());
        cli.setCidade(jT8.getText());
        cli.setCep(jT9.getText());
        cli.setEstado((String)jComboBox1.getSelectedItem());
        
        clid.salvar(cli);
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT8ActionPerformed

    private void jT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT5ActionPerformed

    private void jT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT2ActionPerformed

    private void jT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT1ActionPerformed

    private void jT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT7ActionPerformed

    private void jT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT9ActionPerformed

    private void jT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT3ActionPerformed

    private void jT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT4ActionPerformed

    private void jT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT6ActionPerformed

    private void jBbuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarClientesActionPerformed
          // new ListaProduto().setVisible(true);
          cli.setPesquisa(jtexPesquisar.getText());
          Cliente c = clid.pesquisar(cli);
          jT1.setText(c.getNome());
          jT5.setText(c.getTelefone());
          jT7.setText(c.getEndereco());
          jT4.setText(c.getCpf());
          jT2.setText(c.getNome_responsavel());
          jT6.setText(c.getTelefone2());
          jT8.setText(c.getCidade());
          jT9.setText(c.getCep());
          jComboBox1.setSelectedItem(c.getEstado());
         preencheTabelaCliente("Select * from cliente where nome like'%" + jtexPesquisar.getText() + "%'ORDER BY nome");
    }//GEN-LAST:event_jBbuscarClientesActionPerformed

    private void jtexPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtexPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexPesquisarActionPerformed
    public ArrayList preencheTabelaCliente(String SQL) {
        ArrayList dados = new ArrayList();
        String[]colunas = new String[]{"Nome","cpf","telefone","cidade"};
         ConecaoBanco conectadb = new ConecaoBanco(); 
         conectadb.conexao();
         conectadb.executaSql(SQL);
       
        // String sql="Select * from cliente where telefone like'%" + PesquisaSQL + "%' ORDER ";

        try {
            
            conectadb.rs.first();
            do {
                dados.add(new Object[]{conectadb.rs.getString("nome"), conectadb.rs.getString("cpf"), conectadb.rs.getString("telefone"), conectadb.rs.getString("cidade")});

            } while (conectadb.rs.next());
            
        } catch (SQLException ex) {
         JOptionPane.showInternalMessageDialog(null, "Erro ao carregar os dados"+ex);
        
        
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            conectadb.desconecta();
        return null;
    }
     
    
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBbuscarClientes;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLcep;
    private javax.swing.JLabel jLcidade;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLresponsavel;
    private javax.swing.JLabel jLtelefone1;
    private javax.swing.JLabel jLtelefone2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jT1;
    private javax.swing.JTextField jT2;
    private javax.swing.JTextField jT3;
    private javax.swing.JTextField jT4;
    private javax.swing.JTextField jT5;
    private javax.swing.JTextField jT6;
    private javax.swing.JTextField jT7;
    private javax.swing.JTextField jT8;
    private javax.swing.JTextField jT9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtexPesquisar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
