package visao;

import dao.ClienteD;
import dao.ConecaoBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Cliente;
import modelo.ModeloTabela;

public class ClienteVisao extends javax.swing.JFrame {

    ClienteD clid = new ClienteD();
    Cliente cli;
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
        jLnome = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jT7 = new javax.swing.JTextField();
        jLtelefone2 = new javax.swing.JLabel();
        jLresponsavel = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLendereco = new javax.swing.JLabel();
        jTNome_Resposnsavel = new javax.swing.JTextField();
        jLcpf = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLtelefone1 = new javax.swing.JLabel();
        jLcidade = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jLcep = new javax.swing.JLabel();
        jT8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBsalvar = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jTID = new javax.swing.JTextField();
        jT5 = new javax.swing.JFormattedTextField();
        jT6 = new javax.swing.JFormattedTextField();
        jT4 = new javax.swing.JFormattedTextField();
        jT9 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jtexPesquisar = new javax.swing.JTextField();
        jBbuscarClientes = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();

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
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel2.setLayout(null);

        jLnome.setText("*Nome:");
        jPanel2.add(jLnome);
        jLnome.setBounds(110, 50, 70, 30);

        jLid.setText("ID:");
        jPanel2.add(jLid);
        jLid.setBounds(140, 130, 40, 30);

        jT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT7ActionPerformed(evt);
            }
        });
        jPanel2.add(jT7);
        jT7.setBounds(160, 210, 350, 30);

        jLtelefone2.setText("*Telefone 2:");
        jPanel2.add(jLtelefone2);
        jLtelefone2.setBounds(340, 170, 70, 30);

        jLresponsavel.setText("*Responsável:");
        jPanel2.add(jLresponsavel);
        jLresponsavel.setBounds(80, 90, 100, 30);

        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        jPanel2.add(jTnome);
        jTnome.setBounds(160, 50, 350, 30);

        jLendereco.setText("Endereço:");
        jPanel2.add(jLendereco);
        jLendereco.setBounds(100, 210, 90, 30);

        jTNome_Resposnsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNome_ResposnsavelActionPerformed(evt);
            }
        });
        jPanel2.add(jTNome_Resposnsavel);
        jTNome_Resposnsavel.setBounds(160, 90, 350, 30);

        jLcpf.setText("CPF:");
        jPanel2.add(jLcpf);
        jLcpf.setBounds(320, 130, 50, 30);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(220, 200, 0, 0);

        jLtelefone1.setText("*Telefone 1:");
        jPanel2.add(jLtelefone1);
        jLtelefone1.setBounds(90, 170, 70, 30);

        jLcidade.setText("Cidade:");
        jPanel2.add(jLcidade);
        jLcidade.setBounds(110, 250, 50, 30);

        jLestado.setText("Estado:");
        jPanel2.add(jLestado);
        jLestado.setBounds(400, 250, 70, 30);

        jLcep.setText("CEP:");
        jPanel2.add(jLcep);
        jLcep.setBounds(270, 250, 40, 30);

        jT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT8ActionPerformed(evt);
            }
        });
        jPanel2.add(jT8);
        jT8.setBounds(160, 250, 100, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ \t ", "RN \t ", "RS \t ", "RO \t ", "RR \t ", "SC \t ", "SP \t ", "SE \t ", "TO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(450, 250, 60, 30);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jBsalvar);
        jBsalvar.setBounds(560, 50, 170, 50);

        jBnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icone_usuario_novo.png"))); // NOI18N
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel2.add(jBnovo);
        jBnovo.setBounds(560, 110, 170, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ca.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jBexcluir);
        jBexcluir.setBounds(560, 180, 170, 50);

        jTID.setEditable(false);
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTID);
        jTID.setBounds(160, 130, 90, 30);

        try {
            jT5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT5ActionPerformed(evt);
            }
        });
        jPanel2.add(jT5);
        jT5.setBounds(160, 170, 100, 30);

        try {
            jT6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT6ActionPerformed(evt);
            }
        });
        jPanel2.add(jT6);
        jT6.setBounds(410, 170, 100, 30);

        try {
            jT4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT4ActionPerformed(evt);
            }
        });
        jPanel2.add(jT4);
        jT4.setBounds(350, 130, 160, 30);

        try {
            jT9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT9ActionPerformed(evt);
            }
        });
        jPanel2.add(jT9);
        jT9.setBounds(300, 250, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        jtexPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtexPesquisarActionPerformed(evt);
            }
        });

        jBbuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pesquisa4.png"))); // NOI18N
        jBbuscarClientes.setText("Buscar Cliente");
        jBbuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtexPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 350, 680, 240);

        jBsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sair1.png"))); // NOI18N
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });
        jPanel2.add(jBsair);
        jBsair.setBounds(560, 250, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
        
        int resposta;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Você deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            cli= new Cliente();
            cli.setId(Integer.parseInt(jTID.getText()));
            clid.excluir(cli);
            jTID.setText("");
            jTnome.setText("");
            jT5.setText("");
            jT7.setText("");
            jT4.setText("");
            jTnome.setText("");
            jT6.setText("");
            jT8.setText("");
            jT9.setText("");
             jTNome_Resposnsavel.setText("");
            tabela.repaint();
        preencheTabelaCliente("Select * from cliente where nome like'%" + jtexPesquisar.getText() + "%'ORDER BY nome");
        }
        
        
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        // TODO add your hadling code here:
        jTID.setText("");
        jTnome.setText("");
        jT5.setText("");
        jT7.setText("");
        jT4.setText("");
        jTnome.setText("");
        jT6.setText("");
        jT8.setText("");
        jT9.setText("");
        jTNome_Resposnsavel.setText("");
        
        
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        cli = new Cliente();
        
        cli.setNome(jTnome.getText());
        cli.setTelefone(jT5.getText());
        cli.setEndereco(jT7.getText());
        cli.setCpf(jT4.getText());
        cli.setNome_responsavel(jTNome_Resposnsavel.getText());
        cli.setTelefone2(jT6.getText());
        cli.setCidade(jT8.getText());
        cli.setCep(jT9.getText());
        cli.setEstado((String) jComboBox1.getSelectedItem());

        if (jTID.getText().equals("")) {
            clid.salvar(cli);
            preencheTabelaCliente("Select * from cliente where nome like'%" + jtexPesquisar.getText() + "%'ORDER BY nome");
        } else {            
            cli.setId(Integer.parseInt(jTID.getText()));            
            clid.alterar(cli);
            preencheTabelaCliente("Select * from cliente where nome like'%" + jtexPesquisar.getText() + "%'ORDER BY nome");
        }
        cli = null;
        
        //preencheTabelaCliente("");


    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT8ActionPerformed

    private void jT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT7ActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        jTID.setEnabled(false);


    }//GEN-LAST:event_jTIDActionPerformed

    private void jBbuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarClientesActionPerformed
        // new ListaProduto().setVisible(true);
//          cli.setPesquisa(jtexPesquisar.getText());
//          Cliente c = clid.pesquisar(cli);
//          jT1.setText(c.getNome());
//          jT5.setText(c.getTelefone());
//          jT7.setText(c.getEndereco());
//          jT4.setText(c.getCpf());
//          jT2.setText(c.getNome_responsavel());
//          jT6.setText(c.getTelefone2());
//          jT8.setText(c.getCidade());
//          jT9.setText(c.getCep());
//          jComboBox1.setSelectedItem(c.getEstado());
        preencheTabelaCliente("Select * from cliente where nome like'%" + jtexPesquisar.getText() + "%'ORDER BY nome");
    }//GEN-LAST:event_jBbuscarClientesActionPerformed

    private void jtexPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtexPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        String nome_Cliente = "" + tabela.getValueAt(tabela.getSelectedRow(), 0);
        conbanco.conexao();
        conbanco.executaSql("select *from cliente where nome='" + nome_Cliente + "'");

        try {
            conbanco.rs.first();
            jTID.setText(String.valueOf(conbanco.rs.getInt("idCliente")));
            jTnome.setText(conbanco.rs.getString("nome"));
            jTNome_Resposnsavel.setText(conbanco.rs.getString("responsavel"));
            jT4.setText(conbanco.rs.getString("cpf"));
            jT5.setText(conbanco.rs.getString("telefone"));
            jT6.setText(conbanco.rs.getString("telefone2"));
            jT7.setText(conbanco.rs.getString("endereco"));
            jT8.setText(conbanco.rs.getString("cidade"));
            jT9.setText(conbanco.rs.getString("cep"));
            jComboBox1.setSelectedItem(conbanco.rs.getString("estado"));
            conbanco.desconecta();

        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Erro as selecionar os dados!\nERROR:" + s);
        }


    }//GEN-LAST:event_tabelaMouseClicked

    private void jT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT5ActionPerformed

    private void jT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT6ActionPerformed

    private void jT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT4ActionPerformed

    private void jTNome_ResposnsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNome_ResposnsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNome_ResposnsavelActionPerformed

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomeActionPerformed

    private void jT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT9ActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed
    public ArrayList preencheTabelaCliente(String SQL) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "cpf", "telefone", "cidade"};
        ConecaoBanco conectadb = new ConecaoBanco();
        conectadb.conexao();
        conectadb.executaSql(SQL);

       
        try {

            conectadb.rs.first();
            do {
                dados.add(new Object[]{conectadb.rs.getString("nome"), conectadb.rs.getString("cpf"), conectadb.rs.getString("telefone"), conectadb.rs.getString("cidade")});

            } while (conectadb.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existem dados cadastrados! " );

        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
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
                //  new ClienteVisao().setVisible(true);
                ClienteVisao visao = new ClienteVisao();
                visao.setLocationRelativeTo(null);
                visao.pack();
                visao.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarClientes;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBsair;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField jT4;
    private javax.swing.JFormattedTextField jT5;
    private javax.swing.JFormattedTextField jT6;
    private javax.swing.JTextField jT7;
    private javax.swing.JTextField jT8;
    private javax.swing.JFormattedTextField jT9;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNome_Resposnsavel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jtexPesquisar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
