/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Servico;

/**
 *
 * @author Simone Barbosa
 */
public class ServicoD {
     ConecaoBanco conectadb = new ConecaoBanco(); 
    
    
    public void cadastrar (Servico servico ){
        
     conectadb.conexao();
       try {
           PreparedStatement pst = conectadb.conn.prepareStatement("insert into servico("
                   + " Cliente_idCliente, descricao,  valor, tipo, voltagem, acessorios, solucao, status"
                   + ")values ( ?, ?, ?, ?, ?, ?, ?, ?)");
           pst.setInt(1, servico.getCliente().getId());
           pst.setString(2,servico.getDescricao());
           pst.setDouble(3,servico.getValor());
           pst.setString(4, servico.getTipo());
           pst.setString(5,servico.getVoltagem());
           pst.setString(6, servico.getAcessorios());
           pst.setString(7, servico.getSolucao());
           pst.setString(8, servico.getStatus());
           
           
           pst.execute();
           JOptionPane.showMessageDialog(null, "Serviço salvo com sucesso!");
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


