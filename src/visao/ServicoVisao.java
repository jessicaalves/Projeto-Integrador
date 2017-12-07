/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ServicoC;
import dao.ServicoD;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Cliente;
import modelo.ModeloTabela;
import modelo.Produto;
import modelo.ReceptorCliente;
import modelo.ReceptorProduto;
import modelo.ReceptorServico;
import modelo.Servico;

/**
 *
 * @author Jéssica A Ferreira
 */
public class ServicoVisao extends javax.swing.JFrame implements ReceptorCliente, ReceptorProduto, ReceptorServico {

    public static Cliente cliente = new Cliente();
    private ArrayList<Produto> produtosIncuidos; //ArrayList que recebe da janela listaProdutos os produtos que serão incluidos no serviço.

    @Override
    public void setServico(Servico ser) { //Recebe um objeto do tipo serviço e os mostra. 

        /*
        Ao clicar no botão buscar serviço é solicitada a janela de listar serviços,
        onde estarão constados todos os serviços cadastrados, as classes que desejem utilizar o serviço
        das janelas de listar clientes, listar serviços ou produtos devem implementar
        o metódo das interfaces receptor. A interface foi criada para que as janelas de listar clientes,
        produtos e serviços se tornem genéricas e possam ser usadas em qualquer outra classe mais de uma vez.
        Não se pode utilizar a lista de cadastros mais de uma vez porque a lista não saberá para qual classe enviar o id.
        A classe listar cliente só poderá ser instanciada se a classe que a chamar implementar o metódo da interface receptor.
        Ela só vai ser instanciada se ela receber no contrutor quem é o receptor. 
         */
        jTid.setText("" + ser.getId());
        jTcliente.setText(ser.getCliente().getNome());
        jTsolucao.setText(ser.getSolucao());
        jTvalor.setText("" + ser.getValor());
        jTdescricao.setText(ser.getDescricao());
        jTAcessorios.setText(ser.getDispositivo().getAcessorio());
        jTmarca.setText(ser.getDispositivo().getMarca());
        jTnumeroSerie1.setText(ser.getDispositivo().getNumeroSerie());
        jComboBoxStatus.setSelectedItem(ser.getStatus());
        jComboBoxTipo.setSelectedItem(ser.getDispositivo().getTipo());
        
        cliente=ser.getCliente();

        if (ser.getDispositivo().getVoltagem().equals("220V")) {
            jRadio220.setSelected(true);
        } else if (ser.getDispositivo().getVoltagem().equals("110V")) {
            jRadio110.setSelected(true);
        } else {
            jRadioBivolt.setSelected(true);
        }

        produtosIncuidos = ser.getProdutosIncluidos();

        carregaTabelaProdutosIncusos();

    }

    @Override
    public void setCliente(Cliente cli) {
        this.cliente = cli;
        jTcliente.setText(cliente.getNome());

    }

    @Override
    public void setProduto(Produto p) {
        if (produtosIncuidos == null) {
            produtosIncuidos = new ArrayList<>();
        }

        produtosIncuidos.add(p);
        carregaTabelaProdutosIncusos();
    }

    private void carregaTabelaProdutosIncusos() {

        String[] colunas = new String[]{"ID", "Nome", "Marca", "Quantidade", "Valor"};

        ArrayList dados = new ArrayList();

        for (Produto p : produtosIncuidos) {

            dados.add(new Object[]{p.getId(), p.getNome(), p.getMarca(), p.getQuantidade(), p.getValor()});

        }

        //ModeloTabela modelo = new ModeloTabela(produtosIncuidos, colunas);
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(190);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(190);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        dados = null;
    }
    
       private void limparCampos() {

        cliente.setId(0);

        jTcliente.setText("");
        jTdescricao.setText("");
        jTvalor.setText("");
        jComboBoxTipo.setSelectedItem("Desktop");
        bGVoltagem.clearSelection();
        jTAcessorios.setText("");
        jTsolucao.setText("");
        jComboBoxStatus.setSelectedItem("Em manutenção");
        jTmarca.setText("");
        jTnumeroSerie1.setText("");
        jTid.setText("");

        if (produtosIncuidos != null) {
            produtosIncuidos.clear();
            carregaTabelaProdutosIncusos();
        }

        

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
        jBnovo = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jLsolucao = new javax.swing.JLabel();
        jTcliente = new javax.swing.JTextField();
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
        jLstatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jBexcluirProd = new javax.swing.JButton();
        jBadicionarProduto = new javax.swing.JButton();
        jBs = new javax.swing.JButton();
        jLnumeroSerie = new javax.swing.JLabel();
        jTmarca = new javax.swing.JTextField();
        jTnumeroSerie1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBbuscarServicos = new javax.swing.JButton();
        jBbuscarClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Serviços");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLid.setText("ID:");
        jPanel1.add(jLid);
        jLid.setBounds(100, 130, 50, 30);

        jTid.setEditable(false);
        jTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidActionPerformed(evt);
            }
        });
        jPanel1.add(jTid);
        jTid.setBounds(140, 130, 140, 30);

        jLvalor.setText("Valor:");
        jPanel1.add(jLvalor);
        jLvalor.setBounds(290, 130, 40, 25);

        jTsolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsolucaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTsolucao);
        jTsolucao.setBounds(140, 250, 330, 30);

        jTvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalorActionPerformed(evt);
            }
        });
        jTvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTvalorKeyReleased(evt);
            }
        });
        jPanel1.add(jTvalor);
        jTvalor.setBounds(330, 130, 140, 30);

        jLdescricao.setText("Descrição:");
        jPanel1.add(jLdescricao);
        jLdescricao.setBounds(70, 90, 70, 30);

        jBnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icone-Serviços.png"))); // NOI18N
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnovo);
        jBnovo.setBounds(520, 110, 170, 50);

        jBexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Delete-icon-2.png"))); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBexcluir);
        jBexcluir.setBounds(520, 180, 170, 50);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/floppy-save-icon-23.png"))); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalvar);
        jBsalvar.setBounds(520, 40, 170, 50);

        jLsolucao.setText("Solução:");
        jPanel1.add(jLsolucao);
        jLsolucao.setBounds(80, 250, 60, 30);

        jTcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTclienteActionPerformed(evt);
            }
        });
        jPanel1.add(jTcliente);
        jTcliente.setBounds(140, 50, 330, 30);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Notebook", "Celular", "Tablet", "Gadgets" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(140, 170, 90, 30);

        jTAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAcessoriosActionPerformed(evt);
            }
        });
        jPanel1.add(jTAcessorios);
        jTAcessorios.setBounds(140, 210, 330, 30);

        jLacessorios.setText("Acessórios:");
        jPanel1.add(jLacessorios);
        jLacessorios.setBounds(60, 210, 80, 30);

        jLtipo.setText("Tipo:");
        jPanel1.add(jLtipo);
        jLtipo.setBounds(90, 170, 50, 30);

        jLvoltagem2.setText("Voltagem:");
        jPanel1.add(jLvoltagem2);
        jLvoltagem2.setBounds(240, 170, 70, 30);

        bGVoltagem.add(jRadio110);
        jRadio110.setText("110V");
        jRadio110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio110ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadio110);
        jRadio110.setBounds(300, 170, 60, 30);

        bGVoltagem.add(jRadio220);
        jRadio220.setText("220V");
        jPanel1.add(jRadio220);
        jRadio220.setBounds(360, 170, 50, 30);

        bGVoltagem.add(jRadioBivolt);
        jRadioBivolt.setText("Bivolt");
        jPanel1.add(jRadioBivolt);
        jRadioBivolt.setBounds(420, 170, 60, 30);

        jLcliente.setText("Cliente:");
        jPanel1.add(jLcliente);
        jLcliente.setBounds(70, 50, 70, 30);

        jTdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTdescricao);
        jTdescricao.setBounds(140, 90, 330, 30);

        jLstatus.setText("Status:");
        jPanel1.add(jLstatus);
        jLstatus.setBounds(90, 290, 60, 30);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em manutenção", "Aguardando cliente", "Entrar em contato com o cliente", "Finalizado" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxStatus);
        jComboBoxStatus.setBounds(140, 290, 210, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de produtos incluídos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 630, 160));

        jBexcluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/x2.png"))); // NOI18N
        jBexcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirProdActionPerformed(evt);
            }
        });
        jPanel2.add(jBexcluirProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 50, 40));

        jBadicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mais5.png"))); // NOI18N
        jBadicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarProdutoActionPerformed(evt);
            }
        });
        jPanel2.add(jBadicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 50, -1));

        jBs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sair12.png"))); // NOI18N
        jBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsActionPerformed(evt);
            }
        });
        jPanel2.add(jBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 50, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 390, 710, 210);

        jLnumeroSerie.setText("Nº de Série: ");
        jPanel1.add(jLnumeroSerie);
        jLnumeroSerie.setBounds(70, 330, 70, 30);
        jPanel1.add(jTmarca);
        jTmarca.setBounds(400, 290, 70, 30);
        jPanel1.add(jTnumeroSerie1);
        jTnumeroSerie1.setBounds(140, 330, 330, 30);

        jLabel1.setText("Marca:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 290, 40, 30);

        jBbuscarServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icone-Serviços2.png"))); // NOI18N
        jBbuscarServicos.setText("Buscar Serviços");
        jBbuscarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarServicosActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarServicos);
        jBbuscarServicos.setBounds(520, 250, 170, 50);

        jBbuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pesquisa4.png"))); // NOI18N
        jBbuscarClientes.setText("Selecionar Cliente");
        jBbuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscarClientes);
        jBbuscarClientes.setBounds(520, 320, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
        new ListarServicos(this).setVisible(true);
    }//GEN-LAST:event_jBbuscarServicosActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed

        limparCampos();

    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        //Chamar método no dao para excluir Serviço

        int resposta;
        resposta = JOptionPane.showConfirmDialog(this, "Você deseja realmente excluir?");

        if (resposta == JOptionPane.YES_OPTION) {

            int idServico = Integer.parseInt(jTid.getText());

            new ServicoD().excluir(idServico);
            limparCampos();
        }


    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        //método que verifica se foi selecionado um cliente, e dps zera o cliente selecionado ao salvar, porque ao criar um novo cliente o id é diferente.

        if (cliente.getId() != 0) {//Condição para certificar se o cliente foi selecionado, 
            if (bGVoltagem.getSelection() != null) { //Condição para certificar de que o usuário irá selecionar pelo menos um tipo de voltagem, impede que ele mantenha este campo vazio.
                ArrayList<String> servico = new ArrayList<>();//Criação do arrayList serviço

                servico.add("" + cliente.getId());//0 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTdescricao.getText());//1 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTvalor.getText());//2 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jComboBoxTipo.getItemAt(jComboBoxTipo.getSelectedIndex()));//3 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(bGVoltagem.getSelection().getActionCommand());//4 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTAcessorios.getText());//5 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTsolucao.getText());//6 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jComboBoxStatus.getItemAt(jComboBoxStatus.getSelectedIndex()));//7 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTnumeroSerie1.getText());//8 // Adição dos campos digitados pelo usuário através do formulário no arrayList.
                servico.add(jTmarca.getText());//9 // Adição dos campos digitados pelo usuário através do formulário no arrayList.

                servico.add(jTid.getText());//10 idServiço
                // ServicoC sc = new ServicoC();
                //  sc.cadastrar(servico);
                if (jTid.getText().equals("")) {
                    new ServicoC().cadastrar(servico, produtosIncuidos); // Criação do objeto anônimo da classe ServicoC, envio do arrayList serviço para classe ServicoC através do metódo cadastrar de controle que espera receber um arrayList do tipo serviço.
                    cliente.setId(0);  // zera o id cliente após salvar o serviço

                } else {
                    new ServicoC().alterar(servico, produtosIncuidos);

                }

                limparCampos();
            } else {
                //Se o usuário não selecionou o campo de voltagem, este receberá a msg abaixo e deverá selecionar a voltagem para finalizar o cadastro do serviço.
                JOptionPane.showMessageDialog(this, "É necessário selecionar a voltagem!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Cliente não selecionado!");
        }


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

    private void jBexcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirProdActionPerformed

        if (tabela.getRowCount() > 0) {
            if (tabela.getSelectedRow() != -1) {

                int indexTabela = tabela.getSelectedRow();

                produtosIncuidos.remove(indexTabela);

                carregaTabelaProdutosIncusos();
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum item selecionado");
            }
        }


    }//GEN-LAST:event_jBexcluirProdActionPerformed

    private void jTvalorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTvalorKeyReleased
        String x = jTvalor.getText();

        x = x.replace(',', '.');
        x = x.replace("..", ".");

        jTvalor.setText(x);
    }//GEN-LAST:event_jTvalorKeyReleased

    private void jBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsActionPerformed

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
    private javax.swing.JButton jBexcluirProd;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBs;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLacessorios;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLdescricao;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnumeroSerie;
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
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTnumeroSerie1;
    private javax.swing.JTextField jTsolucao;
    private javax.swing.JTextField jTvalor;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

 

}
