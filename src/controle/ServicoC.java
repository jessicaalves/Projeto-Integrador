/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ServicoD;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Servico;

/**
 *
 * @author Simone Barbosa
 * @author Jéssica Alves
 */
public class ServicoC {
    public void cadastrar (ArrayList<String> servico ){
        //O metodo cadastrar recebe o objeto serviço do tipo arraylist da classe serviço visão.
        
        // Pegando os itens do array list e transformando em objeto
        Cliente cli = new Cliente();
        // É necessário saber de que cliente é determinado serviço, 
        cli.setId(Integer.parseInt(servico.get(0)));
        
        Servico s = new Servico();
        s.setCliente(cli);
        s.setDescricao(servico.get(1));
        s.setValor(Double.parseDouble(servico.get(2)));
        s.setTipo(servico.get(3));
        s.setVoltagem(servico.get(4));
        s.setAcessorios(servico.get(5));
        s.setSolucao(servico.get(6));
        s.setStatus(servico.get(7));
        
        
       new ServicoD().cadastrar(s);
        
        
        
        
        
        
        
        
        //System.out.println(servico.get(1));
        
      // for (String string : servico) {
      // System.out.println(string);
      // }
//        
        
        
        
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


