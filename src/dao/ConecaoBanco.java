/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConecaoBanco {

    public Statement stm;// responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; // e responsavel por armazenar o resultado de uma pesquisa passada ´por statement
    private String driver = "com.mysql.jdbc.Driver"; // e responsavél por indentificar o serviço de banco de dados 
    private String usuario = "root";
    private String caminho = "jdbc:mysql://localhost:3306/bancopi";// e responsavel por setar o local do banco de dados
    private String senha = "";
    public Connection conn;// responsavel por realizar a conexão com  o banco de dados 

    public void conexao() {// metodo responsavel por realizar a conexão com o banco 

        try {
            System.setProperty("jdbc.drivers", driver);// seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);// realiza a conexão com o banco de dados 
          //  JOptionPane.showMessageDialog(null, "Conectado com sucesso");// imprime uma mensagem de confirmação de  conexão
        } catch (SQLException ex) {//execeção
            JOptionPane.showMessageDialog(null, "Error  de conexão!\n ERROR:" + ex.getMessage());

        }

    }

    public void desconecta() {// método para fechar a conexão
        try {
            conn.close(); // fecha a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  ao fechar a conexão" + ex.getMessage());
        }
    }

    public void executaSql(String SQL) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Falha no método executaSQL\n"
                    + ex.getMessage());
        }
    }

}
