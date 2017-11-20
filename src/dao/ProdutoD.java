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
    
    public void cadastrar (Produto produto){
        conectadb.conexao();
       try {
           PreparedStatement pst = conectadb.conn.prepareStatement("insert into produto("
                   + "nome, modelo, marca, quantidade, configuracao, valor"
                   + ")values (?, ?, ?, ?, ?, ?)");
           
           pst.setString(1,produto.getNome());
           pst.setString(2,produto.getModelo());
           pst.setString(3, produto.getMarca());
           pst.setInt(4, produto.getQuantidade());
           pst.setString(5,produto.getConfiguracao());
           pst.setDouble(6, produto.getValor());
          
           
           pst.execute();
           JOptionPane.showMessageDialog(null, " Salvo com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " ERROR! Favor preencher todos os dados!"+ex);
       }
       }
       

        public void excluir (){

        }
        public void alterar (){

        }
        public void salvar(){

        }
        public void pesquisar(){

        }

}
