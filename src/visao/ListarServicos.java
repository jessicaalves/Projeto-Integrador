package visao;
import dao.ConecaoBanco;
import dao.ServicoD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;
import modelo.ReceptorServico;


public class ListarServicos extends javax.swing.JFrame {
    public static int idServico;
    
ReceptorServico rs;
    

    public ListarServicos(ReceptorServico receptor) {
        rs=receptor;
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        preencheTabelaServico("");
        
    }
    
   
    
    
    public ArrayList preencheTabelaServico(String buscarNome) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Descrição", "Status", "Solução", "Valor"};
        ConecaoBanco conectadb = new ConecaoBanco();
        conectadb.conexao();

        conectadb.executaSql("SELECT * FROM `servico` "
                + "INNER JOIN cliente ON servico.Cliente_idCliente = cliente.idCliente "
                + "WHERE cliente.nome LIKE '%" + buscarNome + "%'");

        
        try {

            conectadb.rs.first();
            do {
                dados.add(new Object[]{conectadb.rs.getString("idServico"),conectadb.rs.getString("nome"), 
                    conectadb.rs.getString("descricao"), conectadb.rs.getString("status"),
                conectadb.rs.getString("solucao"), conectadb.rs.getString("valor")});

            } while (conectadb.rs.next());

        } catch (SQLException ex) {

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
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(5).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conectadb.desconecta();
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTbSelecionarServico = new javax.swing.JToggleButton();
        jTBuscarProdutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTbSelecionarServico.setText("Selecionar serviço");
        jTbSelecionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbSelecionarServicoActionPerformed(evt);
            }
        });

        jTBuscarProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscarProdutosKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTbSelecionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBuscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTBuscarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(185, 185, 185)
                .addComponent(jTbSelecionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTbSelecionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbSelecionarServicoActionPerformed

        idServico = Integer.parseInt("" + tabela.getValueAt(tabela.getSelectedRow(), 0));
      
        rs.setServico(new ServicoD().buscaServico(idServico));
        
        
        this.dispose();
    }//GEN-LAST:event_jTbSelecionarServicoActionPerformed

    private void jTBuscarProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarProdutosKeyPressed
      preencheTabelaServico(jTBuscarProdutos.getText());
    }//GEN-LAST:event_jTBuscarProdutosKeyPressed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBuscarProdutos;
    private javax.swing.JToggleButton jTbSelecionarServico;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
