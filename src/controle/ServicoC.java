/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ServicoD;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Servico;
import modelo.Produto;

/**
 *
 * @author Simone Barbosa
 * @author Jéssica Alves
 */
public class ServicoC {
    
    public void cadastrar(ArrayList<String> servico, ArrayList<Produto> produtos) {
        //O metodo cadastrar recebe o objeto serviço do tipo arraylist da classe serviço visão.

        // Pegando os itens do array list e transformando em objeto
        Cliente cli = new Cliente();
        // É necessário saber de que cliente é determinado serviço, então é criado 
        // uma instancia de cliente para apontar para o local na memória que está a variável do cliente que já existe
        // para então 
        cli.setId(Integer.parseInt(servico.get(0)));
        
        Servico s = new Servico();
        s.setCliente(cli);
        s.setDescricao(servico.get(1));
        try {
            s.setValor(Double.parseDouble(servico.get(2)));
        } catch (NumberFormatException e) {
            
        }
        s.setDispositivo(new Dispositivo());
        
        s.getDispositivo().setTipo(servico.get(3));
        s.getDispositivo().setVoltagem(servico.get(4));
        s.getDispositivo().setAcessorio(servico.get(5));
        s.setSolucao(servico.get(6));
        s.setStatus(servico.get(7));
        s.getDispositivo().setNumeroSerie(servico.get(8));
        s.getDispositivo().setMarca(servico.get(9));
        s.setProdutosIncluidos(produtos);
        
        new ServicoD().cadastrar(s);
        
    }
    
    public void excluir() {
        
    }
    
    public void alterar(ArrayList<String> servico, ArrayList<Produto> produtos) {
        
        Cliente cli = new Cliente();
        
        cli.setId(Integer.parseInt(servico.get(0)));
        
        Servico s = new Servico();
        s.setCliente(cli);
        s.setDescricao(servico.get(1));
        
        try {
            s.setValor(Double.parseDouble(servico.get(2)));
            s.setId(Integer.parseInt(servico.get(10)));
            
        } catch (NumberFormatException e) {
            
        }
        s.setDispositivo(new Dispositivo());
        
        s.getDispositivo().setTipo(servico.get(3));
        s.getDispositivo().setVoltagem(servico.get(4));
        s.getDispositivo().setAcessorio(servico.get(5));
        s.setSolucao(servico.get(6));
        s.setStatus(servico.get(7));
        s.getDispositivo().setNumeroSerie(servico.get(8));
        s.getDispositivo().setMarca(servico.get(9));
        s.setProdutosIncluidos(produtos);
        
        new ServicoD().alterar(s);
        
    }
    
    public void salvar() {
        
    }
    
    public void pesquisar() {
        
    }
}
