/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ServicoC;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Cliente;
import modelo.ModeloTabela;
import modelo.Produto;
import modelo.ReceptorCliente;
import modelo.ReceptorProduto;

/**
 *
 * @author Jéssica A Ferreira
 */
public class ServicoVisao extends javax.swing.JFrame implements ReceptorCliente, ReceptorProduto {

    public static Cliente cliente;

    private ArrayList<Produto> produtosIncuidos;

    @Override
    public void setCliente(Cliente cli) {
        this.cliente = cli;
        jTcliente.setText(cliente.getNome());

    }

    @Override
    public void setProduto(Produto p) {
        if(produtosIncuidos==null){
            produtosIncuidos= new ArrayList<>();
        }
        
        produtosIncuidos.add(p);
        carregaTabelaProdutosIncusos();
    }

    private void carregaTabelaProdutosIncusos() {

        String[] colunas = new String[]{"ID", "Nome", "Marca", "Quantidade", "Valor"};

        ModeloTabela modelo = new ModeloTabela(produtosIncuidos, colunas);
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

    }

    /**
     * Creates new form ServicoVisao
     */
    public ServicoVisao() {
        initComponents();
        jRadio110.setActionCommand("110V");
        jRadio220.setActionCommand("220V");
        jRadioBivolt.setActionCommand("Bivolt");
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

        bGVoltagem = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLid = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jLvalor = new javax.swing.JLabel();
        jTsolucao = new javax.swing.JTextField();
        jTvalor = new javax.swing.JTextField();
        jLdescricao = new javax.swing.JLabel();
        jBbuscarServicos = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jLsolucao = new javax.swing.JLabel();
        jTcliente = new javax.swing.JTextField();
        jBadicionarProduto = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jTAcessorios = new javax.swing.JTextField();
        jLacessorios = new javax.swing.JLabel();
        jLtipo = new javax.swing.JLabel();
        jLvoltagem2 = new javax.swing.JLabel();
        jRadio110 = new javax.swing.JRadioButton();
        jRadio220 = new javax.swing.JRadioButton();
        jRadioBivolt = new javax.swing.JRadioButton();
        jLcliente = new javax.swing.JLabel();
        jTdescricao = new javax.swing.JTextField();
        jBbuscarClientes = new javax.swing.JButton();
        jLstatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Serviços");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLid.setText("ID:");
        jPanel1.add(jLid);
        jLid.setBounds(90, 120, 30, 20);

        jTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidActionPerformed(evt);
            }
        });
        jPanel1.add(jTid);
        jTid.setBounds(130, 120, 120, 25);

        jLvalor.setText("Valor:");
        jPanel1.add(jLvalor);
        jLvalor.setBounds(270, 120, 70, 25);

        jTsolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsolucaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTsolucao);
        jTsolucao.setBounds(130, 230, 310, 25);

        jTvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalorActionPerformed(evt);
            }
        });
        jPanel1.add(jTvalor);
        jTvalor.setBounds(310, 120, 130, 25);

        jLdescricao.setText("Descrição:");
        jPanel1.add(jLdescricao);
        jLdescricao.setBounds(60, 80, 70, 20);

        jBbuscarServicos.setText("Buscar Serviços");
        jBbuscarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarServicosActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarServicos);
        jBbuscarServicos.setBounds(560, 150, 130, 40);

        jBnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icone_servicos.png"))); // NOI18N
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnovo);
        jBnovo.setBounds(570, 280, 120, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Delete-icon-2.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBexcluir);
        jBexcluir.setBounds(570, 210, 120, 50);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalvar);
        jBsalvar.setBounds(570, 350, 120, 50);

        jLsolucao.setText("Solução:");
        jPanel1.add(jLsolucao);
        jLsolucao.setBounds(80, 230, 60, 14);

        jTcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTclienteActionPerformed(evt);
            }
        });
        jPanel1.add(jTcliente);
        jTcliente.setBounds(130, 50, 310, 25);

        jBadicionarProduto.setText("Adicionar Produto");
        jBadicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jBadicionarProduto);
        jBadicionarProduto.setBounds(560, 100, 130, 40);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Notebook", "Celular", "Tablet", "Gadgets" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(130, 160, 71, 20);

        jTAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAcessoriosActionPerformed(evt);
            }
        });
        jPanel1.add(jTAcessorios);
        jTAcessorios.setBounds(130, 190, 310, 25);

        jLacessorios.setText("Acessórios:");
        jPanel1.add(jLacessorios);
        jLacessorios.setBounds(70, 190, 55, 14);

        jLtipo.setText("Tipo:");
        jPanel1.add(jLtipo);
        jLtipo.setBounds(90, 160, 24, 14);

        jLvoltagem2.setText("Voltagem:");
        jPanel1.add(jLvoltagem2);
        jLvoltagem2.setBounds(220, 160, 48, 20);

        bGVoltagem.add(jRadio110);
        jRadio110.setText("110V");
        jRadio110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio110ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadio110);
        jRadio110.setBounds(270, 160, 49, 23);

        bGVoltagem.add(jRadio220);
        jRadio220.setText("220V");
        jPanel1.add(jRadio220);
        jRadio220.setBounds(330, 160, 49, 23);

        bGVoltagem.add(jRadioBivolt);
        jRadioBivolt.setText("Bivolt");
        jPanel1.add(jRadioBivolt);
        jRadioBivolt.setBounds(390, 160, 51, 23);

        jLcliente.setText("Cliente:");
        jPanel1.add(jLcliente);
        jLcliente.setBounds(60, 50, 50, 14);

        jTdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTdescricao);
        jTdescricao.setBounds(130, 80, 310, 25);

        jBbuscarClientes.setText("Buscar Cliente");
        jBbuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarClientes);
        jBbuscarClientes.setBounds(560, 50, 130, 40);

        jLstatus.setText("Status:");
        jPanel1.add(jLstatus);
        jLstatus.setBounds(80, 270, 40, 14);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em manutenção", "Aguardando cliente", "Entrar em contato com o cliente", "Finalizado" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxStatus);
        jComboBoxStatus.setBounds(130, 270, 130, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de produtos incluídos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de produtos incluídos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 330, 520, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidActionPerformed

    private void jTsolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsolucaoActionPerformed

    private void jTvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvalorActionPerformed

    private void jBbuscarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarServicosActionPerformed
        //new ListarClientes().setVisible(true);
    }//GEN-LAST:event_jBbuscarServicosActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed

        if (cliente.getId() != 0) {
            if (bGVoltagem.getSelection() != null) {
                ArrayList<String> servico = new ArrayList<>();

                servico.add("" + cliente.getId());
                servico.add(jTdescricao.getText());
                servico.add(jTvalor.getText());
                servico.add(jComboBoxTipo.getItemAt(jComboBoxTipo.getSelectedIndex()));
                servico.add(bGVoltagem.getSelection().getActionCommand());
                servico.add(jTAcessorios.getText());
                servico.add(jTsolucao.getText());
                servico.add(jComboBoxStatus.getItemAt(jComboBoxStatus.getSelectedIndex()));

                // ServicoC sc = new ServicoC();
                //  sc.cadastrar(servico);
                new ServicoC().cadastrar(servico); // O metodo cadastrar
            } else {

                JOptionPane.showMessageDialog(this, "É necessário selecionar a voltagem!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Cliente não selecionado!");
        }

        cliente.setId(0);  // zera o id cliente após salvar o serviço

    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jTclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTclienteActionPerformed

    private void jBadicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarProdutoActionPerformed
        new ListarProdutos(this).setVisible(true);
    }//GEN-LAST:event_jBadicionarProdutoActionPerformed

    private void jTAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAcessoriosActionPerformed

    private void jTdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdescricaoActionPerformed

    private void jBbuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarClientesActionPerformed
        // iDcliente = 1;
        //new ListarClientes().setVisible(true);

        new ListarClientes(this).setVisible(true);

        // iDcliente = ListarClientes.idCliente;
// TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarClientesActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jRadio110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio110ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio110ActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

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
            java.util.logging.Logger.getLogger(ServicoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicoVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGVoltagem;
    private javax.swing.JButton jBadicionarProduto;
    private javax.swing.JButton jBbuscarClientes;
    private javax.swing.JButton jBbuscarServicos;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLacessorios;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLdescricao;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLsolucao;
    private javax.swing.JLabel jLstatus;
    private javax.swing.JLabel jLtipo;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JLabel jLvoltagem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadio110;
    private javax.swing.JRadioButton jRadio220;
    private javax.swing.JRadioButton jRadioBivolt;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTAcessorios;
    private javax.swing.JTextField jTcliente;
    private javax.swing.JTextField jTdescricao;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTsolucao;
    private javax.swing.JTextField jTvalor;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
