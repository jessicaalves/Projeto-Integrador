/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Produto;
import modelo.Servico;

/**
 *
 * @author Simone Barbosa
 */
public class ServicoD {

    ConecaoBanco conectadb = new ConecaoBanco();

    public void cadastrar(Servico servico) {

        conectadb.conexao();
        try {

            conectadb.conn.setAutoCommit(false);

            PreparedStatement pst = conectadb.conn.prepareStatement("insert into dispositivo("
                    + " `acessorio`, `marca`, `numeroSerie`, `voltagem`, `tipo`"
                    + ")values ( ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, servico.getDispositivo().getAcessorio());
            pst.setString(2, servico.getDispositivo().getMarca());
            pst.setString(3, servico.getDispositivo().getNumeroSerie());
            pst.setString(4, servico.getDispositivo().getVoltagem());
            pst.setString(5, servico.getDispositivo().getTipo());

            pst.executeUpdate();

            ResultSet rs = pst.getGeneratedKeys();

            int idUltimoDisp = 0;

            if (rs.next()) {
                idUltimoDisp = rs.getInt(1);
            }

            if (idUltimoDisp == 0) {
                throw new SQLException();
            }

            pst = conectadb.conn.prepareStatement("insert into servico("
                    + " Cliente_idCliente, id_dispositivo, descricao,  valor, solucao, status"
                    + ")values ( ?, ?, ?, ?, ?, ? )", Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, servico.getCliente().getId());
            pst.setInt(2, idUltimoDisp);
            pst.setString(3, servico.getDescricao());
            pst.setDouble(4, servico.getValor());
            pst.setString(5, servico.getSolucao());
            pst.setString(6, servico.getStatus());

            pst.executeUpdate();

            rs = pst.getGeneratedKeys();

            int idUltimoServico = 0;

            if (rs.next()) {
                idUltimoServico = rs.getInt(1);
            }

            if (servico.getProdutosIncluidos() != null) {

                if (idUltimoServico == 0) {
                    throw new SQLException();
                }

                for (Produto p : servico.getProdutosIncluidos()) {
                    pst = conectadb.conn.prepareStatement("INSERT INTO `servicos_has_produtos`( `idProduto`, `idServico`, `quantidade`, `valor`) "
                            + "VALUES (?,?,?,?)");

                    pst.setInt(1, p.getId());
                    pst.setInt(2, idUltimoServico);
                    pst.setInt(3, p.getQuantidade());
                    pst.setDouble(4, p.getValor());

                    pst.execute();

                }
            }
            conectadb.conn.commit();

            JOptionPane.showMessageDialog(null, "Serviço salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!" + ex);

            try {
                conectadb.conn.rollback();
            } catch (SQLException ex1) {
            }
        } finally {

            try {
                conectadb.conn.setAutoCommit(false);
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);

            }
            conectadb.desconecta();

        }

    }

    public Servico buscaServico(int idServico) {
        conectadb.conexao();
        conectadb.executaSql("SELECT * FROM `servico` "
                + "INNER JOIN cliente ON servico.Cliente_idCliente = cliente.idCliente "
                + "INNER JOIN dispositivo ON servico.id_dispositivo = dispositivo.idDispositivo "
                + "WHERE idServico = " + idServico);
        try {

            Servico s = new Servico();
            s.setCliente(new Cliente());
            s.setDispositivo(new Dispositivo());
            conectadb.rs.first();

            System.out.println(conectadb.rs.getInt("idServico"));

            s.setId(conectadb.rs.getInt("idServico"));
            s.getCliente().setNome(conectadb.rs.getString("nome"));
            s.getCliente().setId(conectadb.rs.getInt("idCliente"));
            s.getDispositivo().setId(conectadb.rs.getInt("id_dispositivo"));
            s.getDispositivo().setMarca(conectadb.rs.getString("marca"));
            s.getDispositivo().setAcessorio(conectadb.rs.getString("acessorio"));
            s.getDispositivo().setNumeroSerie(conectadb.rs.getString("numeroSerie"));
            s.getDispositivo().setTipo(conectadb.rs.getString("tipo"));
            s.getDispositivo().setVoltagem(conectadb.rs.getString("voltagem"));
            s.setDescricao(conectadb.rs.getString("descricao"));
            s.setStatus(conectadb.rs.getString("status"));
            s.setSolucao(conectadb.rs.getString("solucao"));
            s.setValor(conectadb.rs.getDouble("valor"));

            conectadb.rs = null;

            conectadb.executaSql("SELECT * FROM `servicos_has_produtos` "
                    + "INNER JOIN produto ON servicos_has_produtos.idProduto = produto.idProduto "
                    + "WHERE idServico ='" + s.getId() + "'");

            if (conectadb.rs != null) {

                s.setProdutosIncluidos(new ArrayList<Produto>());

                while (conectadb.rs.next()) {

                    Produto p = new Produto();

                    p.setId(conectadb.rs.getInt("id"));
                    p.setMarca(conectadb.rs.getString("marca"));
                    p.setModelo(conectadb.rs.getString("modelo"));
                    p.setNome(conectadb.rs.getString("nome"));
                    p.setQuantidade(conectadb.rs.getInt("quantidade"));
                    p.setValor(conectadb.rs.getDouble("valor"));

                    s.getProdutosIncluidos().add(p);

                }

            }

            return s;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o código." + ex);
            return null;
        } finally {
            conectadb.desconecta();
        }

    }

    public void excluir() {

    }

    public void alterar() {
    }

    public void salvar() {

    }

    public void pesquisar() {

    }
}
