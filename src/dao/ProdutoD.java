package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloTabela;
import modelo.Produto;

public class ProdutoD {

    ConecaoBanco conectadb = new ConecaoBanco();
    Produto produto = new Produto();

    public void cadastrar(Produto produto) {
        conectadb.conexao();
        try {
            PreparedStatement pst = conectadb.conn.prepareStatement("insert into produto("
                    + "nome, modelo, marca, quantidade, configuracao, valor"
                    + ")values (?, ?, ?, ?, ?, ?)");

            pst.setString(1, produto.getNome());
            pst.setString(2, produto.getModelo());
            pst.setString(3, produto.getMarca());
            pst.setInt(4, produto.getQuantidade());
            pst.setString(5, produto.getConfiguracao());
            pst.setDouble(6, produto.getValor());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERROR! Favor preencher todos os dados!" + ex);
        }
    }
    
     public void excluir(int idProduto) {
       

    }


    public void alterar(Produto p) {

        conectadb.conexao();
        try {
            PreparedStatement pst = conectadb.conn.prepareStatement("update produto set nome=?"
                    + ",modelo=?,marca=?,quantidade=?,valor=?,configuracao=? where idProduto=?");

           
            pst.setString(1, p.getNome());
            pst.setString(2, p.getModelo());
            pst.setString(3, p.getMarca());
            pst.setInt(4, p.getQuantidade());
            pst.setDouble(5, p.getValor());
            pst.setString(6, p.getConfiguracao());
            pst.setInt(7, p.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!! " + ex);
        }
        conectadb.desconecta();
    }

    public void salvar() {

    }

    public void pesquisar() {

    }

    public Produto selecionaProduto(int id) {

        Produto p = new Produto();
        try {
            conectadb.conexao();
            conectadb.executaSql("SELECT * FROM `produto` WHERE idProduto = " + id);

            conectadb.rs.first();

            

            p.setId(conectadb.rs.getInt("idProduto"));
            p.setMarca(conectadb.rs.getString("marca"));
            p.setModelo(conectadb.rs.getString("modelo"));
            p.setNome(conectadb.rs.getString("nome"));
            p.setQuantidade(conectadb.rs.getInt("quantidade"));
            p.setValor(conectadb.rs.getDouble("valor"));
            p.setConfiguracao(conectadb.rs.getString("configuracao"));

           

        } catch (SQLException ex) {

            System.out.println(ex);
        }
        
        return p;

    }

    public void diminuirEstoque(Produto p) {
        conectadb.conexao();

        try {
            //Obtem a quantidade atual do estoque:
            conectadb.executaSql("SELECT  `quantidade` FROM `produto` WHERE `idProduto` =" + p.getId());
            conectadb.rs.first();

            int quantidadeAtual = conectadb.rs.getInt("quantidade");

            //Diminui a quantidade do estoque substraindo a quantidade do produto passado
            PreparedStatement pst = conectadb.conn.prepareStatement("update produto set quantidade=? "
                    + "WHERE  `idProduto` =?");

            pst.setInt(1, quantidadeAtual - p.getQuantidade());
            pst.setInt(2, p.getId());
            pst.execute();

        } catch (SQLException e) {
            System.out.println("erro ao diminuir estoque" + e);
        }

    }

   
}
