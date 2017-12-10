/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ModeloTabela;
import visao.ClienteVisao;

public class ClienteD {

    ConecaoBanco conectadb = new ConecaoBanco();
    Cliente cliente = new Cliente();

    int codCliente;

    public void salvar(Cliente cliente) {
        
        conectadb.conexao();
       
        try {
            PreparedStatement pst = conectadb.conn.prepareStatement("insert into cliente(nome, telefone, endereco,cpf,responsavel,telefone2,cidade,cep,estado)values ( ?, ?, ?, ?,?,?,?,?,?)");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getTelefone());
            pst.setString(3, cliente.getEndereco());
            pst.setString(4, cliente.getCpf());
            pst.setString(5, cliente.getNome_responsavel());
            pst.setString(6, cliente.getTelefone2());
            pst.setString(7, cliente.getCidade());
            pst.setString(8, cliente.getCep());
            pst.setString(9, cliente.getEstado());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERROR! Favor preencher todos os dados!" + ex);
        }

    }

    public Cliente pesquisar(Cliente climodel) {
        conectadb.conexao();

        try {
            conectadb.executaSql("select * from cliente where nome like'%" + climodel.getPesquisa() + "%'");
            conectadb.rs.first();
            cliente.setNome(conectadb.rs.getString("nome"));
            cliente.setTelefone(conectadb.rs.getString("telefone"));
            cliente.setEndereco(conectadb.rs.getString("endereco"));
            cliente.setCpf(conectadb.rs.getString("cpf"));
            cliente.setNome_responsavel(conectadb.rs.getString("responsavel"));
            cliente.setTelefone2(conectadb.rs.getString("telefone2"));
            cliente.setCidade(conectadb.rs.getString("cidade"));
            cliente.setCep(conectadb.rs.getString("cep"));
            cliente.setEstado(conectadb.rs.getString("estado"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do cliente" + ex);
        }
        conectadb.desconecta();
        return cliente;

    }

    public ArrayList preencheTabelaCliente(String SQL) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "cpf", "telefone", "cidade"};
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
            JOptionPane.showInternalMessageDialog(null, "Erro ao carregar os dados" + ex);

        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        return dados;
    }

    public void buscaCodigo(String nomecli) {
        conectadb.conexao();
        conectadb.executaSql("select*from cliente where nomecli='" + nomecli + "'");
        try {
            conectadb.rs.first();
            codCliente = conectadb.rs.getInt("idCliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao busacar o codigo" + ex);
        }
        conectadb.desconecta();

    }

    public void alterar(Cliente c) {

        conectadb.conexao();
        try {
            PreparedStatement pst = conectadb.conn.prepareStatement("update cliente set nome=?,telefone=?"
                    + ",endereco=?,cpf=?,responsavel=?,telefone2=?,cidade=?,cep=?,estado=? where idCliente=?");

            pst.setString(1, c.getNome());
            pst.setString(2, c.getTelefone());
            pst.setString(3, c.getEndereco());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getNome_responsavel());
            pst.setString(6, c.getTelefone2());
            pst.setString(7, c.getCidade());
            pst.setString(8, c.getCep());
            pst.setString(9, c.getEstado());
            pst.setInt(10, c.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!! " + ex);
        }
        conectadb.desconecta();
    }

    public void excluir(Cliente client) {

        conectadb.conexao();
        try {
            PreparedStatement pst = conectadb.conn.prepareStatement("delete from cliente where idCliente=?");
            pst.setInt(1, client.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao excluir dados" + ex);
        }

        conectadb.desconecta();

    }

}

// public void cadastrar (){
//}
//  public void excluir (){
//  }
// public void alterar (){
// }
//  public void pesquisar(){
// }
//}

