/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProdutoD;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Produto;

/**
 *
 * @author Simone Barbosa
 * @author Jéssica Alves
 */
public class ProdutoC {
     public void cadastrar (ArrayList<String> produto){
         
         Produto p = new Produto();
         p.setNome(produto.get(0));
         p.setModelo(produto.get(1));
         p.setMarca(produto.get(2));
         p.setQuantidade(Integer.parseInt(produto.get(3)));
         p.setConfiguracao(produto.get(4));
         p.setValor(Double.parseDouble(produto.get(5)));
        
         
         
         new ProdutoD().cadastrar(p);

               
    }
    public void excluir (){
        
    }
    public void alterar (ArrayList<String> produto){
        
        Produto p = new Produto();
         p.setNome(produto.get(0));
         p.setModelo(produto.get(1));
         p.setMarca(produto.get(2));
         p.setQuantidade(Integer.parseInt(produto.get(3)));
         p.setConfiguracao(produto.get(4));
         p.setValor(Double.parseDouble(produto.get(5)));
         p.setId(Integer.parseInt(produto.get(6)));
         
         
         new ProdutoD().alterar(p);
        
    }
    public void salvar(){
        
    }
    public void pesquisar(){
        
    }
}

    

